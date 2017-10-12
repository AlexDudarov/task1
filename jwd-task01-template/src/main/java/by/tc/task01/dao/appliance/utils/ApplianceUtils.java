package by.tc.task01.dao.appliance.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tc.task01.dao.appliance.builder.ApplianceBuilder;
import by.tc.task01.dao.command.ApplianceDirector;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceUtils<E> {
	private static final String FILE_NAME = "appliances_db.txt";

	public Appliance createAppliance(Criteria<E> criteria) {

		ApplianceBuilder applianceBuilder = ApplianceDirector.getInstance().getBuilder(criteria.getAplianceTypeName());
		String data = findStringInFile(criteria);
		if (data == null) {
			System.out.println("We found nothing");
			return null;
		} else {
			Map<String, String> dataMap = Parser.parse(data);
			Appliance appliance = applianceBuilder.build(dataMap);
			return appliance;
		}
	}

	private String findStringInFile(Criteria<E> criteria) {

		String regular = createRegular(criteria);
		boolean isFind;
		String line;
		File file;
			file = getFile();

		if (file==null){
			System.out.println("file not found");
			return null;
		}
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {

			while ((line = reader.readLine()) != null) {
				isFind = isFind(regular, line);
				if (isFind) {
					return line;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}

	private boolean isFind(String regular, String testString) {
		String trimTestString = testString.trim();
		Pattern p = Pattern.compile(regular, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(trimTestString);

		return m.matches();

	}

	private File getFile() {
		URL url = this.getClass().getClassLoader().getResource(FILE_NAME);


		if (url != null) {
			File file;
			try {
				file = new File(url.toURI());
				return file;
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			return null;
		}
		return null;

	}

	private String createRegular(Criteria<E> criteria) {

		Set<Entry<E, Object>> entrySet = criteria.getCriteria().entrySet();
		String applianceTypeName = criteria.getAplianceTypeName();
		StringBuffer sb = new StringBuffer();
		NumberFormat nf = new DecimalFormat("#.######");

		sb.append("^").append(applianceTypeName).append( "\\s(.*)");
		for (Entry<E, Object> criteriaEntry : entrySet) {
			String key = criteriaEntry.getKey().toString();
			String value;
			if (criteriaEntry.getValue().getClass().equals(Double.class)) {
				Double d = (Double) criteriaEntry.getValue();
				value = nf.format(d);
				value = value.replace(",", ".");
			} else {
				value = criteriaEntry.getValue().toString().trim();
			}
			sb.append("(?=.*\\b").append(key).append("=").append(value).append("((;$)|(,\\s.*)))");
		}
		sb.append("(.*)");

		return sb.toString();
	}
}
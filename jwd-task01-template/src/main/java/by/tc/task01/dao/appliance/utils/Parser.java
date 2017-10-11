package by.tc.task01.dao.appliance.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

	public static Map<String, String> parse(String data) {
		Map<String, String> mapData = new HashMap<>();

		Pattern keyPattern = Pattern.compile("(\\w*)=");
		Matcher keyMatcher = keyPattern.matcher(data);
		Pattern valuePattern = Pattern.compile("=(\\S*)[,|;]");
		Matcher valueMatcher = valuePattern.matcher(data);
		while (keyMatcher.find() && valueMatcher.find()) {
			mapData.put(keyMatcher.group(1), valueMatcher.group(1));
		}

		return mapData;
	}

}

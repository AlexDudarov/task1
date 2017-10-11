package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria<E> {

	private Map<E, Object> criteria = new HashMap<E, Object>();
	private String aplianceTypeName;

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

	public String getAplianceTypeName() {
		return aplianceTypeName;
	}

	public void setAplianceTypeName(String aplianceTypeName) {
		this.aplianceTypeName = aplianceTypeName;
	}

	public Object getValue(E key) {
		Object value = criteria.get(key);
		return value;
	}
	
	public Set<E> getKeySet(){
		Set<E> set = criteria.keySet();
		return 	set;
	}

}

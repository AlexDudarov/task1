package by.tc.task01.service.validation;

import java.util.Set;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static <E> boolean validate(Criteria<E> criteria) {

		Set<E> set = criteria.getKeySet();
		for (E enumer : set) {
			Object validationValue = ValdationMap.getValue(enumer);
			Object dataValue = criteria.getValue(enumer);
			boolean isString = (dataValue instanceof String) && (validationValue.equals(String.class));
			boolean isNumber = (dataValue instanceof Number) && (validationValue.equals(Number.class));

			if (criteria.getAplianceTypeName() == null) {
				System.out.println("apliance type is empty");
				return false;
			}

			if (dataValue == null) {
				return false;
			}

			if (isNumber) {
				Number number = (Number) dataValue;
				double data = number.doubleValue();
				boolean isNegative= data < 0.0; 
				return !isNegative;

			}

			if (!(isString || isNumber)) {
				return false;
			}

		}

		return true;
	}

}

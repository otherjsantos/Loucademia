package br.com.softblue.loucademia.application.util;

public class Validation {

	public static void assertNotEmpty(Object obj) {

		if (obj instanceof String) {
			String s = (String) obj;

			if (StringUtils.isEmpty(s)) {
				throw new ValidationException("O texto passado n�o pode estar vazio!");
			}
		}
		if (obj == null) {
			throw new ValidationException("O valor passado n�o pode ser nulo!");
		}
	}
}

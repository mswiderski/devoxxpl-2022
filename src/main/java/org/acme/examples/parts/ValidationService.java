package org.acme.examples.parts;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ValidationService {

	public boolean validate(String partNumber, PartInfo info) {
		if (partNumber.length() < 5) {
			return false;
		}
		
		return true;
	}
}

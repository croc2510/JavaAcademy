package com.softtek.java.academy.challenge;

public class SwitchCaseChallenge {
	public static void main(String... args) {
		int formulaNumber = 50;
		String heisenbergFormula = "";
		
		switch (formulaNumber) {
		case 30:
			heisenbergFormula += "Zn";
			break;
		case 50:
			heisenbergFormula += "Mn";
		case 10:
			heisenbergFormula += "Ne";
		case 5:
			heisenbergFormula += "H";
			break;
		default:
			heisenbergFormula += "He";
		
		}
		/* choice 2
		switch (formulaNumber) {
		case 30:
			heisenbergFormula += "Zn";
			break;
		case 10:
			heisenbergFormula += "O";
		case 50:
			heisenbergFormula += "Mn";
		case 5:
			heisenbergFormula += "Ne";
		default:
			heisenbergFormula += "H";
		}*/
		
		System.out.println(heisenbergFormula);
	}

}

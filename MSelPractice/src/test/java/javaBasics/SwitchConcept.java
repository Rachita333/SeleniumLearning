package javaBasics;

public class SwitchConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "Sunday";

		switch (day) {
		case "Monday":
			System.out.println("Today is Monday");
			break;

		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;

		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;

		case "Thursday":
			System.out.println("Today is Thursday");
			break;

		case "Friday":
			System.out.println("Today is Friday");
			break;

		case "Saturday":
			System.out.println("Today is Saturday");
			break;

		case "Sunday":
			System.out.println("Today is Sunday");
			break;

		default:
			System.out.println("Give proper day");

		}

	}

}

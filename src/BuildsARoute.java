import java.util.Scanner;

public class BuildsARoute {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();
		 
		String result = "";
		String[] route = { "right", "down", "left", "up" };

		String[] abc = { "A", "B", "C", "D" };

		if (start.equalsIgnoreCase(end)) {
			System.out.print(start.toUpperCase() + " found");
		} else {

			int i = 0, j = 0;

			for (i = 0; i < route.length; i++) {

				if (!start.equalsIgnoreCase(abc[i])) {
					continue;
				} else {
					for (j = i + 1; j < route.length; j++) {

						if (end.equalsIgnoreCase(abc[j])) {
							break;
						}
						result += " > " + route[j];

					}
					System.out.print(route[i]);
					System.out.print(result);

				}
			}

			System.out.print(": " + end.toUpperCase() + " found");
		}

	}

}

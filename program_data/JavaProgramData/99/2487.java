package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int time = 0;
		int age;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double s;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (time < n)
		{
					 age = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					 if (age <= 18)
					 {
					 a = a + 1;
					 }
					 else if (age <= 35)
					 {
					 b = b + 1;
					 }
					 else if (age <= 60)
					 {
					 c = c + 1;
					 }
					 else
					 {
					 d = d + 1;
					 }

					 time++;
		}

		s = a + b + c + d;
		System.out.printf("%.2f", "1-18: ");
		System.out.printf("%.2f", 100 * a / s);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", 100 * b / s);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", 100 * c / s);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", 100 * d / s);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");



		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double i;
		double age;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			age = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (age <= 18)
			{
				a++;
				continue;
			}
			if (age > 18 && age <= 35)
			{
				b++;
				continue;
			}
			if (age > 35 && age <= 60)
			{
				c++;
				continue;
			}
			if (age > 60)
			{
				d++;
				continue;
			}
		}
		System.out.print("1-18: ");
		System.out.printf("%.2f", a / n * 100);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", b / n * 100);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", c / n * 100);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", d / n * 100);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}
}


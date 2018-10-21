package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double i;
		double a;
		double x = 0;
		double y = 0;
		double z = 0;
		double k = 0;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (a <= 18)
			{
				x++;
			}
			else if (a <= 35)
			{
				y++;
			}
			else if (a <= 60)
			{
				z++;
			}
			else
			{
				k++;
			}
		}
		System.out.printf("%.2f", "1-18: ");
		System.out.printf("%.2f", x / n * 100);
		System.out.printf("%.2f", '%');
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", y / n * 100);
		System.out.printf("%.2f", '%');
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", z / n * 100);
		System.out.printf("%.2f", '%');
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", k / n * 100);
		System.out.printf("%.2f", '%');
		System.out.printf("%.2f", "\n");
		return 0;
	}


}


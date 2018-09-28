package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int temp;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double ra;
		double rb;
		double rc;
		double rd;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if (1 <= temp != 0 && temp <= 18)
			{
				a++;
			}
			else if (19 <= temp != 0 && temp <= 35)
			{
				b++;
			}
			else if (36 <= temp != 0 && temp <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}

		ra = a * 100 / n;
		rb = b * 100 / n;
		rc = c * 100 / n;
		rd = d * 100 / n;

		System.out.print("1-18: ");
		System.out.printf("%.2f", ra);
		System.out.printf("%.2f", '%');
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", rb);
		System.out.printf("%.2f", '%');
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", rc);
		System.out.printf("%.2f", '%');
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "Over60: ");
		System.out.printf("%.2f", rd);
		System.out.printf("%.2f", '%');
		System.out.printf("%.2f", "\n");




	}
}


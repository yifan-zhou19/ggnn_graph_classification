package <missing>;

public class GlobalMembers
{
	/************************************
	 *   ????????				*
	 *   ??????  1200012815		*
	 *   ???2012.9.25				*
	 ************************************/
	public static int Main()
	{
		int n;
		int i;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a1;
		double a2;
		double a3;
		double a4;
		a1 = a2 = a3 = a4 = 0;
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a <= 18)
			{
				a1++;
			}
			else if (a >= 19 && a <= 35)
			{
				a2++;
			}
			else if (a >= 36 && a <= 60)
			{
				a3++;
			}
			else
			{
				a4++;
			}
		}
		System.out.printf("%.2f", "1-18: ");
		System.out.printf("%.2f", 100 * a1 / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", 100 * a2 / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", 100 * a3 / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", 100 * a4 / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}


}


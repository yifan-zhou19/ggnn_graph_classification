package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		double f1 = 1;
		double f2 = 1;
		double f;
		double sum = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1;j <= n;) //???j?1-n
			{
				f1 = f1 + f2;
				sum = sum + f1 / f2; //?????
				f2 = f2 + f1;
				sum = sum + f2 / f1; //?????
				j = j + 2;
			}
			if (n % 2 != 0) //??n???
			{
				sum = sum - f2 / f1; //?????????
			}
			System.out.printf("%.3f",sum); //??
			System.out.print("\n");
			sum = 0;
			f1 = f2 = 1; //???
		}

		return 0;
	}
}


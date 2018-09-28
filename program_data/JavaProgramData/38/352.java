package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		double sqplus;
		double plus;
		double x;
		double avr;
		double outcome;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sqplus = 0;
			plus = 0;
			avr = 0;
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x = Double.parseDouble(tempVar3);
				}
				sqplus = sqplus + x * x;
				plus = plus + x;
			}
			avr = plus / m;
			outcome = sqplus - 2 * plus * avr + m * avr * avr;
			System.out.printf("%.5lf\n",Math.sqrt(outcome / m));
		}
		return 0;
	}
}


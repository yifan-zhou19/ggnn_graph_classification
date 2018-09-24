package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] s = new double[100][2];
		int i;
		int j;
		int n;
		double a;
		double k;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   s[i][j] = Double.parseDouble(tempVar2);
			   }
			}
		}
		a = s[0][1] / s[0][0];
		for (i = 1;i < n - 1;i++)
		{
			k = s[i][1] / s[i][0];
			if ((k - a) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((a - k) > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		b = s[n - 1][1] / s[n - 1][0];
		if ((b - a) > 0.05)
		{
				System.out.print("better");
		}
			else if ((a - b) > 0.05)
			{
				System.out.print("worse");
			}
			else
			{
				System.out.print("same");
			}
		return 0;
	}

}


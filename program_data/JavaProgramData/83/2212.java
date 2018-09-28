package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] s = new int[2][10];
		int i = 0;
		int k = 0;
		int sum1 = 0;
		double c;
		double result;
		double sum2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i][k] = Integer.parseInt(tempVar2);
			}
		}
		}
		for (k = 0;k < n;k++)
		{
			sum1 += s[0][k];
		}
		for (k = 0;k < n;k++)
		{
			if (s[1][k] >= 90 && s[1][k] <= 100)
			{
				c = 4.0;
			}
			else if (s[1][k] >= 85 && s[1][k] <= 89)
			{
				c = 3.7;
			}
			else if (s[1][k] >= 82 && s[1][k] <= 84)
			{
				c = 3.3;
			}
			else if (s[1][k] >= 78 && s[1][k] <= 81)
			{
				c = 3.0;
			}

			else if (s[1][k] >= 75 && s[1][k] <= 77)
			{
				c = 2.7;
			}

			else if (s[1][k] >= 72 && s[1][k] <= 74)
			{
				c = 2.3;
			}

			 else if (s[1][k] >= 68 && s[1][k] <= 71)
			 {
				c = 2.0;
			 }
			else if (s[1][k] >= 64 && s[1][k] <= 67)
			{
				c = 1.5;
			}
			else if (s[1][k] >= 60 && s[1][k] <= 63)
			{
				c = 1.0;
			}
			else if (s[1][k] < 60)
			{
				c = 0;
			}
			sum2 += c * s[0][k];
		}
		result = sum2 / sum1;
		System.out.printf("%.2lf",result);
	}
}


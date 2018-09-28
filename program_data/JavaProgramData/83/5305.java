package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] sz = new int[10];
		double[] mark = new double[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				mark[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (mark[i] >= 90)
			{
				mark[i] = 4.0;
			}
				else if (85 <= mark[i] != 0 && mark[i] <= 89)
				{
					mark[i] = 3.7;
				}
				else if (82 <= mark[i] != 0 && mark[i] <= 84)
				{
					mark[i] = 3.3;
				}
				else if (78 <= mark[i] != 0 && mark[i] <= 81)
				{
					mark[i] = 3.0;
				}
				else if (75 <= mark[i] != 0 && mark[i] <= 77)
				{
					mark[i] = 2.7;
				}
				else if (72 <= mark[i] != 0 && mark[i] <= 74)
				{
					mark[i] = 2.3;
				}
				else if (68 <= mark[i] != 0 && mark[i] <= 71)
				{
					mark[i] = 2.0;
				}
				else if (64 <= mark[i] != 0 && mark[i] <= 67)
				{
					mark[i] = 1.5;
				}
				else if (60 <= mark[i] != 0 && mark[i] <= 63)
				{
					mark[i] = 1.0;
				}
				else if (mark[i] < 60)
				{
					mark[i] = 0;
				}

		}
		double[] sum = new double[10];
		for (i = 0;i < n;i++)
		{
			sum[i] = mark[i] * sz[i];
		}
		double sumGPA = 0;
		double xuefen = 0;
		for (i = 0;i < n;i++)
		{
			sumGPA += sum[i];
		}
		for (i = 0;i < n;i++)
		{
			xuefen += sz[i];
		}
		double result;
		result = sumGPA / xuefen;
		System.out.printf("%.2lf",result);
		return 0;
	}
}


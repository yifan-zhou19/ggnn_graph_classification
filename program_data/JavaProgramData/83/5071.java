package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		double[] c = new double[10];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++) //????
		{
			if (b[i] >= 90)
			{
				c[i] = 4.0;
			}
			else if (b[i] >= 85)
			{
				c[i] = 3.7;
			}
			else if (b[i] >= 82)
			{
				c[i] = 3.3;
			}
			else if (b[i] >= 78)
			{
				c[i] = 3.0;
			}
			else if (b[i] >= 75)
			{
				c[i] = 2.7;
			}
			else if (b[i] >= 72)
			{
				c[i] = 2.3;
			}
			else if (b[i] >= 68)
			{
				c[i] = 2.0;
			}
			else if (b[i] >= 64)
			{
				c[i] = 1.5;
			}
			else if (b[i] >= 60)
			{
				c[i] = 1.0;
			}
			else
			{
				c[i] = 0;
			}
		}
		double sum1 = 0;
		double sum2 = 0;
		double GPA;
		for (i = 0;i < n;i++)
		{
			sum1 = sum1 + a[i] * c[i]; //??????
			sum2 = sum2 + a[i]; //????
		}
		GPA = sum1 / sum2;
		System.out.printf("%.2f",GPA);

		return 0;
	}
}


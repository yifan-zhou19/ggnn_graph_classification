package <missing>;

public class GlobalMembers
{
	public static int fab(int n)
	{
		if (n >= 2)
		{
			return (fab(n - 1) + fab(n - 2));
		}
		else if (n == 1)
		{
			return 1;
		}
		else if (n == 0)
		{
			return 1;
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		float[] sum = new float[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				sum[i] = sum[i] + (float)fab(j + 2) / (float)fab(j + 1);
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3f\n",sum[i]);
		}
		return 0;
	}

}


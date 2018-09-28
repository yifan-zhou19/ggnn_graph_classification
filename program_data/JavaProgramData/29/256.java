package <missing>;

public class GlobalMembers
{
	public static int fbnq(int s)
	{
			if (s == 0)
			{
				return 0;
			}
			else if (s == 1)
			{
				return 1;
			}
			else
			{
				return fbnq(s - 1) + fbnq(s - 2);
			}
	}
	public static int Main()
	{
		float[] sum = new float[100];
		int i;
		int n;
		int[] d = new int[100];
		int j;
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
				d[i] = Integer.parseInt(tempVar2);
			}
			for (j = 2;j <= d[i] + 1;j++)
			{
				sum[i] += (float)fbnq(j + 1) / fbnq(j);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.3f\n",sum[i]);
		}
		return 0;
	}

}


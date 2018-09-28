package <missing>;

public class GlobalMembers
{
	public static int fbnq(int a)
	{
		if (a == 1)
		{
			return 1;
		}
		else
		{
			if (a == 2)
			{
				return 2;
			}
			else
			{
				return fbnq(a - 1) + fbnq(a - 2);
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int[] sz = new int[100];
		float[] jieguo = new float[100];
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
		for (k = 0;k < n;k++)
		{
			for (j = 1;j <= sz[k];j++)
			{
				jieguo[k] = jieguo[k] + (float)fbnq(j + 1) / fbnq(j);
			}
			System.out.printf("%.3f\n",jieguo[k]);
		}
		return 0;
	}
}


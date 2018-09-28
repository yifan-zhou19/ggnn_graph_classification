package <missing>;

public class GlobalMembers
{
	public static int fbnq(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		if (n == 1)
		{
			return 1;
		}
		return fbnq(n - 1) + fbnq(n - 2);
	}
	public static int Main()
	{
		int n;
		int[] no = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		double sum;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			no[i] = Integer.parseInt(tempVar2);
		}
		}
		for (j = 0;j < n;j++)
		{
			sum = 0;
			for (i = 1;i <= no[j];i++)
			{
				sum += (double)fbnq(i + 2) / ((double)fbnq(i + 1));
			}
			System.out.printf("%.3f\n",sum);
		}




		return 0;
	}
}


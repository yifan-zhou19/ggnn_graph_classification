package <missing>;

public class GlobalMembers
{
	public static int fxs(int a)
	{
		int[] b = new int[257];
		int k;
		int j;
		if (a < 0)
		{
			a = -a;
			for (k = 0;a > 0;k++)
			{
				b[k] = a % 10;
				a = a / 10;
			}
			for (j = 0;j < k;j++)
			{
				a = a + b[j] * Math.pow(10,(k - 1 - j));
			}
			a = -a;
		}
		else
		{
			for (k = 0;a > 0;k++)
			{
				b[k] = a % 10;
				a = a / 10;
			}
			for (j = 0;j < k;j++)
			{
				a = a + b[j] * (Math.pow(10,(k - 1 - j)));
			}
		}
		return a;
	}
	public static int Main()
	{
		int[] a = new int[120];
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (a[i] != a[i + 1])
		{
			System.out.printf("%d\n",fxs(a[i]));
			i = i + 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		return 0;
	}
}


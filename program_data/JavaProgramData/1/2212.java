package <missing>;

public class GlobalMembers
{
	public static int fenjie(int x,int k)
	{
		int t = 1;
		int i;
		if (k > x)
		{
			return 0;
		}
		for (i = k;i < x;i++)
		{
			if (x % i == 0)
			{
				t = t + fenjie(x / i, i);
			}
		}
		return t;
	}
	public static int Main()
	{
		int j;
		int p;
		int n;
		int[] a = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			System.out.printf("%d",fenjie(a[j], 2));
			System.out.print("\n");
		}
		return 0;
	}
}


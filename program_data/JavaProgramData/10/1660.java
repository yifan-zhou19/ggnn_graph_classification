package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[36];
	public static int[] f = new int[36];
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int Main()
	{
		int k;
		int i;
		int j;
		int ans = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		f[0] = 0;
		for (i = 1;i <= k;i++)
		{
			f[i] = 1;
			for (j = 1;j < i;j++)
			{
				if (a[i] <= a[j])
				{
					f[i] = max(f[i], f[j] + 1);
				}
			}
			ans = max(ans, f[i]);
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}


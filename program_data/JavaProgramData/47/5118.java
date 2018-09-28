package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int p;
	public static void oppo(int n)
	{
		for (int i1 = 0;i1 < n;i1++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				(a[i1]) = Integer.parseInt(tempVar);
			}
		}
		for (int i2 = 0;i2 < n;i2++)
		{
			for (int j = 0;j < n - i2 - 1;j++)
			{
				p = a[j];
				a[j] = a[j + 1];
				a[j + 1] = p;
			}
		}
	}
	public static void printa(int n)
	{
		for (int i3 = 0;i3 < n;i3++)
		{
			if (i3 == 0)
			{
				System.out.printf("%d",a[i3]);
			}
			else
			{
			System.out.printf(" %d",a[i3]);
			}
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		oppo(n);
		printa(n);
		return 0;
	}
}


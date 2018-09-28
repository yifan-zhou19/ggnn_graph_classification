package <missing>;

public class GlobalMembers
{
	public static void lunhuan(int[] b, int c, int d)
	{
		int i;
		int j;
		int t;
		for (i = c - d;i <= c - 1;i++)
		{
			for (j = 1;j <= c - d;j++)
			{
				t = b[i - j + 1];
				b[i - j + 1] = b[i - j];
				b[i - j] = t;
			}
		}
	}
	public static int Main()
	{
		int[] a = new int[101];
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		lunhuan(a, n, m);
		for (i = 0;i <= n - 1;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
			System.out.printf(" %d",a[i]);
			}
		}
		return 0;
	}
}


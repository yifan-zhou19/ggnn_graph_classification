package <missing>;

public class GlobalMembers
{
	public static void jiaohuan(int[] a, int i, int n, int m)
	{
		int j;
		int t;
		int p;
		int q;
		t = a[n - m + i];
		p = a[i];
		q = a[i + 1];
		for (j = i;j <= n - m - 1 + i;j++)
		{
			a[j + 1] = p;
			p = q;
			q = a[j + 2];
		}
		a[i] = t;
	}
	public static int Main()
	{
		int[] a = new int[110];
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
		for (i = 0;i <= m - 1;i++)
		{
			jiaohuan(a, i, n, m);
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i <= n - 1;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		System.out.print("\n");
		return 0;
	}


}


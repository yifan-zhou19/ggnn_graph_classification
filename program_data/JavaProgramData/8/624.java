package <missing>;

public class GlobalMembers
{
	public static void maopao(int m, int n, int[] a, int[] b)
	{
		int tempt;
		int i;
		int j;
		for (j = 0;j < m - 1;j++)
		{ //???????
			for (i = 0;i < m - j - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
					tempt = a[i];
					a[i] = a[i + 1];
					a[i + 1] = tempt;
				}
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
				if (b[i] > b[i + 1])
				{
					tempt = b[i];
					b[i] = b[i + 1];
					b[i + 1] = tempt;
				}
			}
		}
	}
	public static void jieshang(int m, int n, int[] a, int[] b)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			a[m + i] = b[i];
		}
	}
	public static void shuchu(int m, int n, int[] a)
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[m + n - 1]);
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[200];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		maopao(m, n, a, b);
		jieshang(m, n, a, b);
		shuchu(m, n, a);
	}

}


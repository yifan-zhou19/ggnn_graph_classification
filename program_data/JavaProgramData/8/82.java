package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[10];
	public static int[] b = new int[10];
	public static int[] c = new int[20];
	public static void shuru()
	{
		int i;
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
		for (i = 1;i <= m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i - 1] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void paixu()
	{
		int c;
		int i;
		int j;
		for (j = 0;j < m - 1;j++)
		{
			for (i = 0;i < m - 1 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					c = a[i];
					a[i] = a[i + 1];
					a[i + 1] = c;
				}
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					c = b[i];
					b[i] = b[i + 1];
					b[i + 1] = c;
				}
			}
		}
	}
	public static void zhenghe()
	{
		int i;
		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (i = m;i < m + n;i++)
		{
			c[i] = b[i - m];
		}
	}
	public static void shuchu()
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[m + n - 1]);
	}
	public static void Main()
	{
		shuru();
		paixu();
		zhenghe();
		shuchu();
	}


}


package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[100];
	public static void shuru()
	{
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void paixu()
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
			if (a[j] > a[j + 1])
			{
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
			if (b[j] > b[j + 1])
			{
				t = b[j];
				b[j] = b[j + 1];
				b[j + 1] = t;
			}
			}
		}
	}
	public static void zuhe()
	{
		int i;
		for (i = 0;i < n;i++)
		{
			c[i] = a[i];
		}
		for (i = n;i < n + m;i++)
		{
			c[i] = b[i - n];
		}
	}
	public static void shuchu()
	{
		int i;
		for (i = 0;i < n + m;i++)
		{
			if (i != n + m - 1)
			{
				System.out.printf("%d ",c[i]);
			}
		else
		{
			System.out.printf("%d",c[i]);
		}
		}
	}
	public static int Main()
	{
		shuru();
		paixu();
		zuhe();
		shuchu();
	}
}


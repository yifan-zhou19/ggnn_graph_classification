package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static int t;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static void passed1()
	{
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
	public static void passed2()
	{
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i - j] < a[i - 1 - j])
				{
					t = a[i - j];
					a[i - j] = a[i - 1 - j];
					a[i - 1 - j] = t;
				}
				else
				{
					break;
				}
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (b[i - j] < b[i - 1 - j])
				{
					t = b[i - j];
					b[i - j] = b[i - 1 - j];
					b[i - 1 - j] = t;
				}
				else
				{
					break;
				}
			}
		}
	}
	public static void passed3()
	{
		for (i = 0;i < n;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i < m;i++)
		{
			c[i + n] = b[i];
		}
	}
	public static void passed4()
	{
		System.out.printf("%d",c[0]);
		for (i = 1;i < n + m;i++)
		{
			System.out.printf(" %d",c[i]);
		}
	}
	public static int Main()
	{
		passed1();
		passed2();
		passed3();
		passed4();
	}
}


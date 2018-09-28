package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[2000];
	public static int i;
	public static int j;

	public static void f1()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
		for (j = 0;j < n;j++)
		{
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   b[j] = Integer.parseInt(tempVar4);
		   }
		}
	}
	public static void f2()
	{
		int t;
		for (j = 0;j < m - 1;j++)
		{
		for (i = 0;i < m - 1 - j;i++)
		{
			if (a[i] > a[i + 1])
			{
				t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;
			}
		}
		}
		for (i = 0;i < n - 1;i++)
		{
		for (j = 0;j < n - 1 - i;j++)
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
	public static void f3()
	{
		int s;
		for (s = 0,i = 0;s < m,i < m;s++,i++)
		{
			c[s] = a[i];
		}
		for (s = m,j = 0;s < m + n - 2,j < n;s++,j++)
		{
			c[s] = b[j];
		}
	}
	public static void f4()
	{
		System.out.printf("%d",c[0]);
		for (i = 1;i <= m + n - 1;i++)
		{
		System.out.printf(" %d",c[i]);
		}
		System.out.print("\n");
	}
	public static void Main()
	{
		 f1();
		 f2();
		 f3();
		 f4();
	}
}


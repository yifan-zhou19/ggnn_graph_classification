package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[500];
	public static int[] b = new int[500];
	public static void scanarray()
	{
		int i;
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
		for (i = 0;i <= m - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void shengxu(int[] x, int len)
	{
		int i;
		int j;
		int temp;
		for (i = len - 1;i >= 0;i--)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if (x[j] >= x[j + 1])
				{
					temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
	}
	public static void hebing(int[] x, int[] y, int lenx, int leny)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		for (p = x + lenx,q = y;q < y + leny;p++,q++)
		{
			*p = q;
		}
	}
	public static void printarray(int[] x, int len)
	{
		int i;
		System.out.printf("%d",x[0]);
		for (i = 1;i <= len - 1;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		System.out.print('\n');
	}
	public static int Main()
	{
		scanarray();
		shengxu(a, m);
		shengxu(b, n);
		hebing(a, b, m, n);
		printarray(a, m + n);
		return 0;
	}
}


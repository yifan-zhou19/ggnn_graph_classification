package <missing>;

public class GlobalMembers
{
	// ??????????2.cpp : ??????????????
	//


	public static int[] a = new int[5000];
	public static int[] b = new int[5000];
	public static int N1;
	public static int N2;
	public static int[] c = new int[10000];
	public static int f1()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			N2 = Integer.parseInt(tempVar2);
		}
		for (n = 0;n <= N1 - 1;n++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[n] = Integer.parseInt(tempVar3);
			}
		}
		for (n = 0;n <= N2 - 1;n++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[n] = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
	public static int f2()
	{
		int i;
		int j;
		int t;
		for (i = 1;i <= N1 - 1;i++)
		{
			for (j = 0;j <= N1 - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 1;i <= N2 - 1;i++)
		{
			for (j = 0;j <= N2 - i - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		return 0;
	}
	public static int f3()
	{
		int i;
		int j;
		for (i = 0;i <= N1 - 1;i++)
		{
			c[i] = a[i];
		}
		for (i = N1,j = 0;i <= N1 + N2 - 1;i++,j++)
		{
			c[i] = b[j];
		}
		return 0;
	}
	public static int f4()
	{
		int i;
		System.out.printf("%d",c[0]);
		for (i = 1;i <= N1 + N2 - 1;i++)
		{
			System.out.printf(" %d",c[i]);
		}
		return 0;
	}
	public static int Main() //(int argc, _TCHAR* argv[])
	{
		f1();
		f2();
		f3();
		f4();
	}


}


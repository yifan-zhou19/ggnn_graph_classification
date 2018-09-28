package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int n1;
	public static int n2;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int flag = 0;
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static paixu(int m, int[] x)
	{
		int i;
		int j;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= m - 1;j++)
			{
				if (x[j] > x[j + 1])
				{
					x[j] = x[j] + x[j + 1];
					x[j + 1] = x[j] - x[j + 1];
					x[j] = x[j] - x[j + 1];
				}
			}
		}
	}
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static output(int m, int[] x)
	{
		int i;
		for (i = 1;i <= m;i++)
		{
			if (flag != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",x[i]);
			flag = 1;
		}
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
	for (k = 1;k <= n1;k++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[k] = Integer.parseInt(tempVar3);
		}
	}
	for (k = 1;k <= n2;k++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[k] = Integer.parseInt(tempVar4);
		}
	}
		paixu(n1, a);
		paixu(n2, b);
		output(n1, a);
		output(n2, b);
	}

}


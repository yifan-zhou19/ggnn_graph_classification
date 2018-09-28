package <missing>;

public class GlobalMembers
{
	public static int la;
	public static int lb;

	public static void read(int[] a, int[] b)
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			la = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			lb = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < la;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < lb;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
		}
	}

	public static void sort(int[] a, int[] b)
	{
		int i;
		int t;
		for (i = 0;i < la - 1;i++)
		{
			if (a[i] > a[i + 1])
			{
				t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;
				if (i != 0)
				{
					i = i - 2;
				}
			}
		}
		for (i = 0;i < lb - 1;i++)
		{
			if (b[i] > b[i + 1])
			{
				t = b[i];
				b[i] = b[i + 1];
				b[i + 1] = t;
				if (i != 0)
				{
					i = i - 2;
				}
			}
		}
	}

	public static void combine(int[] a, int[] b)
	{
		int i;
		for (i = 0;i < lb;i++)
		{
			a[la + i] = b[i];
		}
	}

	public static void print(int[] a)
	{
		int i;
		for (i = 0;i < (la + lb);i++)
		{
			if (i != (la + lb - 1))
			{
			System.out.printf("%d ",a[i]);
			}
			else
			{
				System.out.printf("%d",a[i]);
			}
		}
	}

	public static int Main()
	{
		int[] x = new int[200];
		int[] y = new int[100];
		read(x, y);
	//	printx(x);
		sort(x, y);
	//	printx(x);
		combine(x, y);
		print(x);
		return 0;
	}



}


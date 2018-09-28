package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		void in(int xx[],int,int yy[],int);
		void arr(int ddd[],int);
		void con(int aa[],int,int bb[],int);
		void out(int dd[],int);
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
		in(a, m, b, n);
		arr(a, m);
		arr(b, n);
		con(a, m, b, n);
		out(a, m + n);
	}

	public static void in(int[] xx, int x, int[] yy, int y)
	{
		int i;
		for (i = 0;i < x;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				xx[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < y;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				yy[i] = Integer.parseInt(tempVar2);
			}
		}
	}

	public static void arr(int[] ddd, int x)
	{
		int i;
		int j;
		int min;
		int k;
		for (i = 0;i < x - 1;i++)
		{
			min = ddd[i];
			for (j = i + 1,k = i;j < x;j++)
			{
				if (ddd[j] < min)
				{
					min = ddd[j];
					k = j;
				}
			}
			ddd[k] = ddd[i];
			ddd[i] = min;
		}
	}

	public static void con(int[] aa, int x, int[] bb, int y)
	{
		int i;
		for (i = x;i < x + y;i++)
		{
			aa[i] = bb[i - x];
		}
		x = x + y;
	}

	public static void out(int[] dd, int x)
	{
		int i;
		System.out.printf("%d",dd[0]);
		for (i = 1;i < x;i++)
		{
			System.out.printf(" %d",dd[i]);
		}
	}

}


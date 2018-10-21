package <missing>;

public class GlobalMembers
{
	public static void scan(int[] x, tangible.RefObject<Integer> nx, int[] y, tangible.RefObject<Integer> ny)
	{
			 int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nx.argValue = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			ny.argValue = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < nx.argValue;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < ny.argValue;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				y[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void sort(int[] x, int num)
	{
			 int i;
			 int j;
		for (i = num - 1;i >= 1;i--)
		{
			for (j = 1;j <= i;j++)
			{
				if (x[j - 1] > x[j])
				{
					int temp = x[j - 1];
					x[j - 1] = x[j];
					x[j] = temp;
				}
			}
		}
	}
	public static void exp(int[] a, int[] b, int na, int nb)
	{
			 int i;
		for (i = na;i < na + nb;i++)
		{
			a[i] = b[i - na];
		}
	}
	public static void print(int[] a, int na, int nb)
	{
		System.out.printf("%d",a[0]);
		int i;
		for (i = 1;i < na + nb;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}
	public static void Main()
	{
		int[] a = new int[100];
		int na;
		int[] b = new int[100];
		int nb;
	tangible.RefObject<Integer> tempRef_na = new tangible.RefObject<Integer>(na);
	tangible.RefObject<Integer> tempRef_nb = new tangible.RefObject<Integer>(nb);
		scan(a, tempRef_na, b, tempRef_nb);
		nb = tempRef_nb.argValue;
		na = tempRef_na.argValue;
		sort(a, na);
		sort(b, nb);
		exp(a, b, na, nb);
		print(a, na, nb);
	}
}


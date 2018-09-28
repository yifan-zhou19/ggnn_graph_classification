package <missing>;

public class GlobalMembers
{
	public static void print(int[] a, int x)
	{
		int i;
		System.out.printf("%d",a[0]);
		for (i = 1;i < x;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}
	public static void paixu(int[] a, int x)
	{
		int i;
		int j;
		int m;
		for (i = 0;i < x;i++)
		{
			for (j = i + 1;j < x;j++)
			{
				if (a[i] > a[j])
				{
					m = a[i];
					a[i] = a[j];
					a[j] = m;
				}
			}
		}
		print(a, x);
	}
	public static void scan(int t)
	{
		int m;
		int n;
		int[] a = new int[10];
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
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		paixu(a, m);
		System.out.print(" ");
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
		}
		paixu(a, n);
	}
	public static void Main()
	{

		scan(0);
	}

}


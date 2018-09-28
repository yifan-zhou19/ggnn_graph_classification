package <missing>;

public class GlobalMembers
{
	public static void f0(int[] a, int x)
	{
		int i = 0;
		for (;i < x;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
	}
	public static void f1(int[] a, int x)
	{
		int i;
		int j;
		int s;
		for (i = 0;i < x - 1;i++)
		{
		for (j = 0;j < x - 1 - i;j++)
		{
			if (a[j] > a[j + 1])
			{
			s = a[j];
			a[j] = a[j + 1];
			a[j + 1] = s;
			}
		}
		}
	}
	public static void f2(int[] a, int[] b, int[] c, int m, int n)
	{
		int i = 0;
		while (i < m)
		{
			c[i] = a[i];
			i++;
		}
		while (i < m + n)
		{
			c[i] = b[i - m];
			i++;
		}
	}
	public static int Main()
	{
		int[] a = new int[50];
		int[] b = new int[50];
		int[] c = new int[100];
		int m;
		int n;
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
		f0(a, m);
		f0(b, n);
		f1(a, m);
		f1(b, n);
		f2(a, b, c, m, n);
		System.out.printf("%d",c[0]);
		for (i = 1;i < n + m;i++)
		{
		 System.out.printf(" %d",c[i]);
		}
		return 0;

	}

}


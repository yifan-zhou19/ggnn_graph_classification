package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		void f1(int x),f2(int x);
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
		f1(m);
		f2(n);
		return 0;
	}
	public static void f1(int x)
	{
		int i;
		int m;
		int j = 0;
		int[][] a = new int[2][100];
		for (i = 0;i < x;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0][i] = Integer.parseInt(tempVar);
		}
		}
		while (j < x)
		{
		m = a[0][0];
		for (i = 0;i < x;i++)
		{
		if (a[0][i] > m)
		{
		m = a[0][i];
		}
		}
		for (i = 0;i < x;i++)
		{
		if (a[0][i] == m)
		{
			a[1][j] = m;
			j++;
			a[0][i] = -1;
		}
		}
		}
		for (i = x - 1;i >= 0;i--)
		{
		if (i != x - 1)
		{

		System.out.printf(" %d",a[1][i]);
		}
		else
		{
			System.out.printf("%d",a[1][i]);
		}
		}
	}
	public static void f2(int x)
	{
		int i;
		int m;
		int j = 0;
		int[][] a = new int[2][100];
		for (i = 0;i < x;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0][i] = Integer.parseInt(tempVar);
		}
		}
		while (j < x)
		{
		m = a[0][0];
		for (i = 0;i < x;i++)
		{
		if (a[0][i] > m)
		{
		m = a[0][i];
		}
		}
		for (i = 0;i < x;i++)
		{
		if (a[0][i] == m)
		{
			a[1][j] = m;
			j++;
			a[0][i] = -1;
		}
		}
		}
		for (i = x - 1;i >= 0;i--)
		{
		System.out.printf(" %d",a[1][i]);
		}

	}
}


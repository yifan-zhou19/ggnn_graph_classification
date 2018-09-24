package <missing>;

public class GlobalMembers
{
	public static int way(int x, int[] a)
	{
		int i = 0;
		while (x > 0)
		{
			a[i] = x;
			x = x / 2;
			i++;
		}
		return (i);
	}
	public static int num(int[] a, int x, int[] b, int y)
	{
		int p = 0;
		int t = 0;
		int i;
		int j;
		for (i = x, j = y;i > 0 && j > 0;i--, j--)
		{
		if (a[i - 1] != b[j - 1])
		{
			t = a[i];
			p++;
			break;
		}
		}
		if (p == 0)
		{
		if (x > y)
		{
			t = b[0];
		}
		else
		{
			t = a[0];
		}
		}
		return (t);
	}
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[10];
		int[] b = new int[10];
		int m;
		int n;
		int t;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		m = way(x, a);
		n = way(y, b);
		t = num(a, m, b, n);
		System.out.printf("%d",t);
		return 0;
	}
}


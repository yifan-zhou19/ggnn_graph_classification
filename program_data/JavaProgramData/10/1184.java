package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int a[],int n);
		int[] a = new int[30];
		int n;
		int i;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		s = f(a, n);
		System.out.printf("%d",s);
	}

	public static int f(int[] a, int n)
	{
		int max = new int(int x,int y);
	int g = new int(int a[],int n,int b);
		if (n == 0)
		{
			return (0);
		}
		else
		{
	return (max(g(a + 1, n - 1, a[0]) + 1, f(a + 1, n - 1)));
		}
	}

	public static int g(int[] a, int n, int b)
	{
		int max = new int(int x,int y);
		if (n == 0)
		{
			return (0);
		}
		else
		{
		if (n == 1)
		{
		if (a[0] > b)
		{
		return (0);
		}
		else
		{
		return (1);
		}
		}
		else
		{
		if (a[0] > b)
		{
		return (g(a + 1, n - 1, b));
		}
		else
		{
			return (max(g(a + 1, n - 1, b), g(a + 1, n - 1, a[0]) + 1));
		}
		}
		}
	}
	public static int max(int x,int y)
	{
		return (x > y != 0?x:y);

	}
}


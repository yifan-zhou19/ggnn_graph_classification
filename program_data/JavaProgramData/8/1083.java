package <missing>;

public class GlobalMembers
{
	public static int input()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		return (i);
	}
	public static void shit(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = 1;i <= n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 2;i <= n;i++)
		{
			for (j = n;j >= i;j--)
			{
				if (a[j] < a[j - 1])
				{
					t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d ",a[i]);
		}
	}
	public static void damn(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = 1;i <= n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 2;i <= n;i++)
		{
			for (j = n;j >= i;j--)
			{
				if (a[j] < a[j - 1])
				{
					t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d",a[i]);
			if (i != n)
			{
				System.out.print(" ");
			}
		}
	}
	public static void Main()
	{
		int m = input();
		int n = input();
		int[] a = new int[1000];
		int[] b = new int[1000];
		shit(a, m);
		damn(b, n);
	}

}


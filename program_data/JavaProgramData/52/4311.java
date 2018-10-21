package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void move(int*,int,int);
		int n;
		int i;
		int m;
		int[] a = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		move(a, n, m);
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n;i++)
		{
		System.out.printf(" %d",a[i]);
		}
	}
	public static void move(int[] a, int n, int m)
	{
		int[] b = new int[N];
		int i;
		for (i = 1;i <= n - m;i++)
		{
		b[i + m] = a[i];
		}
		for (i = n - m + 1;i <= n;i++)
		{
		b[i + m - n] = a[i];
		}
		for (i = 1;i <= n;i++)
		{
		*(a + i) = b[i];
		}
	}
}


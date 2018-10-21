package <missing>;

public class GlobalMembers
{
	public static void move(int[] a, int n)
	{
		int t = a[n - 1];
		int i;
		for (i = n - 1;i > 0;i--)
		{
			a[i] = a[i - 1];
		}
		a[0] = t;
	}

	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;++i)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;++i)
		{
			move(a, n);
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;++i)
		{
			System.out.printf(" %d",a[i]);
		}
	}
}


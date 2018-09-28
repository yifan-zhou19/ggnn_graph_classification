package <missing>;

public class GlobalMembers
{
	public static void f(int[] a, int n, int m, int i)
	{
		if (i == n)
		{
			return;
		}
		int c;
		int j;
		if (i < m)
		{
			j = n - m + i;
		}
		else
		{
			j = i - m;
		}
		c = a[j];
		f(a, n, m, i + 1);
		a[i] = c;
		return;
	}
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int i;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		f(a, n, m, 0);
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[i]);
	}
}


package <missing>;

public class GlobalMembers
{
	public static void f(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
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
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		f(a, m);
		f(b, n);
		for (i = m;i < m + n;i++)
		{
			a[i] = b[i - m];
		}
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[m + n - 1]);
	}

}


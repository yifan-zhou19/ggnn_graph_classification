package <missing>;

public class GlobalMembers
{
	public static void f(int p, int n)
	{
		int i;
		int j;
		int[] a = new int[100];
		for (i = 0; i < n; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 1; i < n; i++)
		{
			for (j = 1; j < n - i + 1; j++)
			{
				if (a[j] < a[j - 1])
				{
					a[j - 1] = a[j] + a[j - 1];
					a[j] = a[j - 1] - a[j];
					a[j - 1] = a[j - 1] - a[j];
				}
			}
		}
		for (i = 0; i < n - 1; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.printf("%d", a[n - 1]);
		if (p > 0)
		{
			System.out.print(" ");
		}
	}
	public static int Main()
	{
		int i;
		int n1;
		int n2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		f(1, n1);
		f(0, n2);
		return 0;
	}
}


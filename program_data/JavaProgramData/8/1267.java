package <missing>;

public class GlobalMembers
{
	public static void f(int m,int n)
	{
		int i;
		int j;
		int temp;
		int[] a = new int[100];
		int[] b = new int[100];
		for (i = 0;i < m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}

		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[j] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}

		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j + 1];
					b[j + 1] = b[j];
					b[j] = temp;
				}
			}
		}


		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[n - 1]);
	}


	public static int Main()
	{
		int m;
		int n;
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

		f(m, n);
		return 0;

	}
}


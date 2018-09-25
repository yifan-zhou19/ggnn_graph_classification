package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void shit(int,int);
		int m;
		int n;
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
		shit(m, n);
		return 0;
	}
	public static void shit(int m,int n)
	{
		int i;
		int j;
		int temp;
		int[] a = new int[20];
		int[] b = new int[20];
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
			for (j = 0;j < m - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		temp = 0;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (j = 0;j < n - 1;j++)
		{
			System.out.printf("%d ",b[j]);
		}
		System.out.printf("%d",b[n - 1]);
	}
}


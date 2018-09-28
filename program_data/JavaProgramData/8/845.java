package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void print(int a[],int b[]);
		int[] a = new int[100];
		int[] b = new int[100];
		print(a, b);
		return 0;
	}

	public static void print(int[] a, int[] b)
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int l = 0;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					k = a[j];
					a[j] = a[j + 1];
					a[j + 1] = k;
				}
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					k = b[j];
					b[j] = b[j + 1];
					b[j + 1] = k;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d",b[i]);
			if (i == m - 1)
			{
				break;
			}
			System.out.print(" ");
		}
	}
}


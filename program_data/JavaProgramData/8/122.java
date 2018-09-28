package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void line(int a[],int b[],int m,int n);
		int m;
		int n;
		int i;
		int j;
		int t;
		int[] a = new int[1000];
		int[] b = new int[1000];
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
		for (i = 0;i < m;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		scanf("\n");
		for (i = 0;i < n;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
		}
		line(a, b, m, n);
	}
	public static void line(int[] a, int[] b, int m, int n)
	{
		int i;
		int j;
		int t;
		for (j = 0;j < m - 1;j++)
		{
			for (i = 0;i < m - j - 1;i++)
			{
				if (a[i] >= a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
				if (b[i] >= b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
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
}


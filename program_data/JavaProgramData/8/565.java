package <missing>;

public class GlobalMembers
{
	public static void order(int[] a, int n)
	{
		int i = 0;
		int j = 0;
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
	public static void print(int[] a, int n, int[] b, int m)
	{
		int i = 0;
		int j = 0;
		while (i < n)
		{
			System.out.printf("%d ",a[i]);
			i++;
		}
		while (j < m - 1)
		{
			System.out.printf("%d ",b[j]);
			j++;
		}
		System.out.printf("%d",b[m - 1]);
	}
	public static void Main()
	{
		void order(int a[],int n);
		void print(int a[],int n,int b[],int m);
		int[] x = new int[20];
		int[] y = new int[20];
		int n;
		int m;
		int i = 0;
		int j = 0;
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
		while (i < n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
			i++;
		}
		while (j < m)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				y[j] = Integer.parseInt(tempVar4);
			}
			j++;
		}
		order(x, n);
		order(y, m);
		print(x, n, y, m);
	}



}


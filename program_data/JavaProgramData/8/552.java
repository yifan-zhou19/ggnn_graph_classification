package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void read(int a[100],int b[100],int m,int n);
		void bubble(int a[100],int m);
		void print(int a[100],int b[100],int m,int n);
		int m;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
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
		read(a, b, m, n);
		bubble(a, m);
		bubble(b, n);
		print(a, b, m, n);
		return 0;
	}

	public static void read(int[] a, int[] b, int m, int n)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
	}
	public static void bubble(int[] a, int m)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - 1;j++)
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

	public static void print(int[] a, int[] b, int m, int n)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d\n",b[n - 1]);
	}
}


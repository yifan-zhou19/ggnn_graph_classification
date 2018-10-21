package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void y2(int a[],int b[],int m,int n);
		void y3(int a[],int b[],int m,int n);
		void y4(int a[],int m,int n);
		int m;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
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
		for (j = 0;j < n;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
		y2(a, b, m, n);
		y3(a, b, m, n);
		y4(a, m, n);
	}
	public static void y2(int[] a, int[] b, int m, int n)
	{
		int t;
		int i;
		int j;
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
				b[j] = b[j + 1];
				b[j + 1] = t;
				}
			}
		}
	}
	public static void y3(int[] a, int[] b, int m, int n)
	{
		int i;
		for (i = m;i <= m + n - 1;i++)
		{
			a[i] = b[i - m];
		}
	}
	public static void y4(int[] a, int m, int n)
	{
		int i;
		System.out.printf("%d",a[0]);
		for (i = 1;i <= m + n - 1;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}
}


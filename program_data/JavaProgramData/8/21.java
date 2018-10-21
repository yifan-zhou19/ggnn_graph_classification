package <missing>;

public class GlobalMembers
{
	public static void duqu(int m, int[] a)
	{
		int i;
		for (i = 1;i <= m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
	}
	public static void paixu(int m, int[] a)
	{
		int i;
		int j;
		int k;
		for (i = 1;i <= m;i++)
		{
		   for (j = 1;j <= m - i;j++)
		   {
			   if (a[j] > a[j + 1])
			   {
				   k = a[j];
				   a[j] = a[j + 1];
				   a[j + 1] = k;
			   }
		   }
		}
	}
	public static void hebing(int m, int n, int[] a, int[] b)
	{
	   int i;
	   for (i = m + 1;i <= m + n;i++)
	   {
		   a[i] = b[i - m];
	   }
	}
	public static void shuchu(int m, int n, int[] a)
	{
		int i;
		for (i = 1;i < m + n;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[m + n]);
	}
	public static void Main()
	{
		int[] x = new int[100];
		int[] y = new int[100];
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
		duqu(m, x);
		duqu(n, y);
		paixu(m, x);
		paixu(n, y);
		hebing(m, n, x, y);
		shuchu(m, n, x);
	}
}


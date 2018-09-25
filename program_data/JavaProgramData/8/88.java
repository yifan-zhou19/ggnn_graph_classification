package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] c = new int[50];
	public static int[] d = new int[50];
	public static void shuzu()
	{
		int i;
		int j;
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
				c[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d[j] = Integer.parseInt(tempVar4);
			}
		}
	}


	public static void paixu(int[] a, int[] b)
	{
		int i;
		int j;
		int s;
		int t;
		for (j = 0;j < m - 1;j++)
		{
			for (i = 0;i < m - j - 1;i++)
			{
				if (a[i] > a[i + 1])
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
				if (b[i] > b[i + 1])
				{
					s = b[i];
					b[i] = b[i + 1];
					b[i + 1] = s;
				}
			}
		}
	}

	public static void hebing(int[] a, int[] b)
	{

		int i;
		int j;
		int[] e = new int[100];
		for (i = 0;i < m;i++)
		{
			e[i] = a[i];
		}
		for (j = 0;j < n;j++)
		{
			e[m + j] = b[j];
		}
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",e[i]);
		}
		System.out.printf("%d",e[m + n - 1]);
	}

	public static void Main()
	{
		 shuzu();
		 paixu(c, d);
		 hebing(c, d);
	}

}


package <missing>;

public class GlobalMembers
{
	public static int[] a1 = new int[100];
	public static int[] a2 = new int[100];
	public static int n1;
	public static int n2;
	public static int[] a = new int[200];

	public static void shuru()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a2[i] = Integer.parseInt(tempVar4);
			}
		}

	}

	public static void paixu(int[] b1, int[] b2, int m1, int m2)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < m1 - 1;i++)
		{
			for (j = 0;j < m1 - 1 - i;j++)
			{
				if (b1[j] > b1[j + 1])
				{
					t = b1[j];
					b1[j] = b1[j + 1];
					b1[j + 1] = t;
				}
			}
		}
		for (i = 0;i < m2 - 1;i++)
		{
			for (j = 0;j < m2 - 1 - i;j++)
			{
				if (b2[j] > b2[j + 1])
				{
					t = b2[j];
					b2[j] = b2[j + 1];
					b2[j + 1] = t;
				}
			}
		}
	}

	public static void hebing(int[] c1, int[] c2, int m1, int m2)
	{
		int i;
		int j;
		for (i = 0;i < m1;i++)
		{
			a[i] = c1[i];
		}
		for (j = 0;j < m2;j++)
		{
			a[i] = c2[j];
			i++;
		}
	}

	public static void shuchu(int[] d, int m1, int m2)
	{
		int i;
		for (i = 0;i < (m1 + m2);i++)
		{
			if (i < m1 + m2 - 1)
			{
				System.out.printf("%d ",d[i]);
			}
			else
			{
				System.out.printf("%d\n",d[i]);
			}
		}
	}

	public static void Main()
	{
		shuru();
		paixu(a1, a2, n1, n2);
		hebing(a1, a2, n1, n2);
		shuchu(a, n1, n2);
	}

}


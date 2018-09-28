package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] a, int n)
	{
		int i;
		int j;
		int m;
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
					  if (a[i] > a[i + 1])
					  {
				 m = a[i];
				 a[i] = a[i + 1];
						a[i + 1] = m;
					  }
			}
		}


	}
	public static void shuchu1(int[] a, int n)
	{
		int i;
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);
	}
	public static void shuchu2(int[] b, int m)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			System.out.printf(" %d",b[i]);
		}
	}
	public static void Main()
	{
		int[] a = new int[10];
		int n;
		int[] b = new int[10];
		int m;
		int i;
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
			 scanf("\n");
		for (i = 0;i < n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  a[n - 1] = Integer.parseInt(tempVar4);
			  }
			  scanf("\n");
		for (i = 0;i < m - 1;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[i] = Integer.parseInt(tempVar5);
			}
		}
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 b[m - 1] = Integer.parseInt(tempVar6);
			 }
		paixu(a, n);
		paixu(b, m);
		shuchu1(a, n);
		shuchu2(b, m);
	}
}


package <missing>;

public class GlobalMembers
{
	public static void f1(int[] a, int x, int[] b, int y)
	{
		int m;
		int n;
		int i;

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
	//		printf("a[%d]=%d ",i,a[i]);
		}
		for (i = m;i < x;i++)
		{
			a[i] = -1;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
	//		printf("b[%d]=%d ",i,b[i]);
		}
		for (i = n;i < y;i++)
		{
			b[i] = -1;
		}
	}

	public static void f2(int[] a, int x, int[] b, int y)
	{
		int i;
		int j;
		int t;
		int m;
		int n;

		for (i = 0,m = 0;i < x;i++)
		{
			if (a[i] >= 0)
			{
				m++;
			}
		}

		for (i = 0,n = 0;i < y;i++)
		{
			if (b[i] >= 0)
			{
				n++;
			}
		}

		for (j = 0;j < m - 1;j++)
		{
			for (i = 0;i < m - 1 - j;i++)
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
			for (i = 0;i < n - 1 - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
	}

	public static void f3(int[] a, int x, int[] b, int y, int[] c, int z)
	{
		int i;
		int m;
		int n;

		for (i = 0,m = 0;i < x;i++)
		{
			if (a[i] >= 0)
			{
				m++;
			}
		}
		for (i = 0,n = 0;i < y;i++)
		{
			if (b[i] >= 0)
			{
				n++;
			}
		}

		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			c[m + i] = b[i];
		}
		for (i = n + m;i < z;i++)
		{
			c[i] = -1;
		}
	}

	public static void f4(int[] c, int x)
	{
		int i;
		int e;

		for (i = 0,e = 0;i < x;i++)
		{
			if (c[i] >= 0)
			{
				e++;
			}
		}
		for (i = 0;i < e;i++)
		{
			System.out.printf("%d",c[i]);
			if (i != e-1)
			{
				System.out.print(" ");
			}
		}
	}

	public static void Main()
	{
		int[] a = new int[30];
		int[] b = new int[30];
		int[] c = new int[60];
		int i;

		f1(a, 30, b, 30); // m,n,a,b

		f2(a, 30, b, 30); // a reconstr

	//	for(i=0;i<30;i++)
	//		if(a[i]>=0)
	//			printf("%d",a[i]);
	//	for(i=0;i<30;i++)
	//		if(b[i]>=0)
	//			printf("%d",b[i]);

		f3(a, 30, b, 30, c, 60); // b reconstr
	///	for(i=0;i<60;i++)
	///		if(c[i]>=0)
	///			printf("%d",c[i]);
		f4(c, 60);


	}


}


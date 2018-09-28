package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
		void read(int a[],int b[],int m,int n);
		void paixu(int a[],int b[],int m,int n);
		void combine(int c[],int a[],int b[],int m,int n);
		void type(int c[],int m,int n);
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
		paixu(a, b, m, n);
		combine(c, a, b, m, n);
		type(c, m, n);

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



	public static void paixu(int[] a, int[] b, int m, int n)
	{
		int i;
		int j;
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
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
	}


	public static void combine(int[] c, int[] a, int[] b, int m, int n)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			c[i + m] = b[i];
		}
	}


	public static void type(int[] c, int m, int n)
	{
		int num;
		int i;
		num = m + n;
		for (i = 0;i < num;i++)
		{
				  if (i < num - 1)
				  {
				  System.out.printf("%d ",c[i]);
				  }
				  else
				  {
					  System.out.printf("%d\n",c[i]);
				  }
		}
	}
}


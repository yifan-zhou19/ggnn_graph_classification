package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(int a[],int b[],int c,int d);
		int[] a = new int[25];
		int[] b = new int[25];
		int c;
		int d;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < c;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < d;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		f(a, b, c, d);
	}
	public static void f(int[] a, int[] b, int c, int d)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < c - 1;i++)
		{
			for (j = i + 1;j < c;j++)
			{
				if (a[j] < a[i])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = 0;i < d - 1;i++)
		{
			for (j = i + 1;j < d;j++)
			{
				if (b[j] < b[i])
				{
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
		for (i = 0;i < c;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < d - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d\n",b[d - 1]);
	}



}


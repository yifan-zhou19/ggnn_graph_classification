package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void read();
		read();
	}
	public static void read()
	{
		int a;
		int b;
		void shu(int x,int y);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		shu(a, b);
	}
	public static void shu(int x,int y)
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		void pai(int a[],int x,int b[],int y);
		for (i = 0;i < x;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < y;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		pai(a, x, b, y);
	}
	public static void pai(int[] a, int x, int[] b, int y)
	{
		int i;
		int k;
		int m;
		void pr(int a[],int x,int b[],int y);
		for (i = 0;i < x - 1;i++)
		{
			for (k = 0;k < x - 1 - i;k++)
			{
				if (a[k] > a[k + 1])
				{
					m = a[k + 1];
					a[k + 1] = a[k];
					a[k] = m;
				}
			}
		}
		for (i = 0;i < y - 1;i++)
		{
			for (k = 0;k < y - 1 - i;k++)
			{
				if (b[k] > b[k + 1])
				{
					m = b[k + 1];
					b[k + 1] = b[k];
					b[k] = m;
				}
			}
		}
		pr(a, x, b, y);
	}
	public static void pr(int[] a, int x, int[] b, int y)
	{
		int i;
		System.out.printf("%d",a[0]);
		for (i = 1;i < x;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf(" %d",b[i]);
		}
	}
}


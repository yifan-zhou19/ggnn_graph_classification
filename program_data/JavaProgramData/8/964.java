package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void sr(int a[100],int b[100],int x,int y);
		void px(int a[100],int x);
		void hb(int a[100],int b[100],int c[200],int x,int y);
		void sc(int a[200],int x);
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		sr(a, b, x, y);
		px(a, x);
		px(b, y);
		hb(a, b, c, x, y);
		sc(c, x + y);
		return 0;
	}
	public static void sr(int[] a, int[] b, int x, int y)
	{
		int i;
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
	}
	public static void px(int[] a, int x)
	{
		int i;
		int j;
		int temp;
		for (i = x - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static void hb(int[] a, int[] b, int[] c, int x, int y)
	{
		int i;
		for (i = 0;i < x + y;i++)
		{
			if (i < x)
			{
				c[i] = a[i];
			}
			else
			{
				c[i] = b[i - x];
			}
		}
	}
	public static void sc(int[] c, int x)
	{
		int i;
		for (i = 0;i < x;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",c[i]);
			}
			else
			{
				System.out.printf(" %d",c[i]);
			}
		}
	}

}


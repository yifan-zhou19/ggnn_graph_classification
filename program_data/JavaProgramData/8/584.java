package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		void func(int,int);
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
		func(a, b);
	}
	public static void func(int x,int y)
	{
		int i;
		int j;
		int t;
		int q;
		int[] a = new int[100];
		int[] b = new int[100];
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
		for (i = 1;i < x;i++)
		{
			for (j = 0;j < x - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 1;i < y;i++)
		{
			for (j = 0;j < y - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 0,q = 0;i < y;i++)
		{
			if (q < y - 1)
			{
				System.out.printf("%d ",b[i]);
				q = q + 1;
			}
			else
			{
				System.out.printf("%d",b[i]);
			}
		}
	}
}


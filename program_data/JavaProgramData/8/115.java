package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f2(int a[100],int b[100],int x,int y);
	void f(int a[100],int x);
		int i;
		int x;
		int y;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < y;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		f(a, x);
		f(b, y);
		f2(a, b, x, y);
		for (i = 0;i < x + y;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",a[i]);
		}
	}
	public static void f(int[] a, int x)
	{
		int i;
		int j;
		int t;
	for (i = 0;i < x - 1;i++)
	{
	for (j = 0;j < x - 1 - i;j++)
	{
	if (a[j] > a[j + 1])
	{
		t = a[j];
		a[j] = a[j + 1];
		a[j + 1] = t;
	}
	}
	}
	}
	public static void f2(int[] a, int[] b, int x, int y)
	{
		int i;
	for (i = 0;i < y;i++)
	{
	a[i + x] = b[i];
	}
	}
}


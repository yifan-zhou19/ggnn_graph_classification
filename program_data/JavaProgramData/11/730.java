package <missing>;

public class GlobalMembers
{
	public static int f1(int y,int r)
	{
		int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int k;
		int d = 0;
		for (i = 0;i < 12;i++)
		{
			if (y - 1 == i)
			{
				for (k = 0;k < i;k++)
				{
					d = d + a[k];
				}
			}
		}
		d = d + r;
		return d;
	}
	public static int f2(int y,int r)
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int k;
		int d = 0;
		for (i = 0;i < 12;i++)
		{
			if (y - 1 == i)
			{
				for (k = 0;k < i;k++)
				{
					d = d + a[k];
				}
			}
		}
		d = d + r;
		return d;
	}
	public static void Main()
	{
		int a;
		int y;
		int r;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = Integer.parseInt(tempVar3);
		}
		if ((a % 100 != 0 && a % 4 == 0) || (a % 400 == 0))
		{
			d = f1(y, r);
		}
		else
		{
			d = f2(y, r);
		}
		System.out.printf("%d",d);

	}

}


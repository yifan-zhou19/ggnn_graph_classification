package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int x;
	public static int y;
	public static int[] a = new int[10];
	public static int[] b = new int[10];
	public static int[] c = new int[20];
	public static void array()
	{
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
	}

	public static void row()
	{
		int t;
		for (i = 0;i < x;i++)
		{
			for (j = i;j < x;j++)
			{
				if (a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = 0;i < y;i++)
		{
			for (j = i;j < y;j++)
			{
				if (b[i] > b[j])
				{
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
	}

	public static void combine()
	{
		for (i = 0;i < x;i++)
		{
			c[i] = a[i];
		}
		for (i = x;i < (x + y);i++)
		{
			c[i] = b[i - x];
		}
	}

	public static void print()
	{
		for (i = 0;i < (x + y);i++)
		{
			if (i != (x + y - 1))
			{
				System.out.printf("%d ",c[i]);
			}
			else
			{
				System.out.printf("%d\n",c[i]);
			}
		}
	}

	public static void Main()
	{
		array();
		row();
		combine();
		print();
	}
}


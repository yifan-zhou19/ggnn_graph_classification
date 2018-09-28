package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int[] c = new int[100];
	public static int[] d = new int[100];
	public static int i;
	public static int j;
	public static int t;
	public static void c1()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < b;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void c2()
	{
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < a - i - 1;j++)
			{
				if (c[j] > c[j + 1])
				{
					t = c[j];
					c[j] = c[j + 1];
					c[j + 1] = t;
				}
			}
		}
		for (i = 0;i < b;i++)
		{
			for (j = 0;j < b - i - 1;j++)
			{
				if (d[j] > d[j + 1])
				{
					t = d[j];
					d[j] = d[j + 1];
					d[j + 1] = t;
				}
			}
		}
	}
	public static void c3()
	{
		for (i = 0;i < a;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		for (i = 0;i < b - 1;i++)
		{
			System.out.printf("%d ",d[i]);
		}
		System.out.printf("%d",d[b - 1]);
	}
	public static int Main()
	{
		c1();
		c2();
		c3();
		return 0;
	}

}


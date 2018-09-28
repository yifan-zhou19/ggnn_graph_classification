package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int[] c = new int[1000];
	public static int[] d = new int[1000];
	public static void scan1()
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
		int i;
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

	public static void order()
	{
		int i;
		int j;
		int k;
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < a - 1;j++)
			{
				if (c[j] > c[j + 1])
				{
					k = c[j];
					c[j] = c[j + 1];
					c[j + 1] = k;
				}
			}
		}
		for (i = 0;i < b;i++)
		{
			for (j = 0;j < b - 1;j++)
			{
				if (d[j] > d[j + 1])
				{
					k = d[j];
					d[j] = d[j + 1];
					d[j + 1] = k;
				}
			}
		}
	}
	public static void hebing()
	{
		int i;
		for (i = 0;i < b;i++)
		{
			c[a + i] = d[i];
		}
	}
	public static void shuchu()
	{
		int i;
		for (i = 0;i < a + b;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",c[i]);
		}
	}
	public static int Main()
	{
		scan1();
		order();
		hebing();
		shuchu();
	}

}


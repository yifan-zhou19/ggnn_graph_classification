package <missing>;

public class GlobalMembers
{
	public static void a()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x2[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void b()
	{
		int i;
		int j;
		int p;
		for (i = 0;i < n1 - 1;i++)
		{
			for (j = i + 1;j < n1;j++)
			{
				if (x1[i] > x1[j])
				{
					p = x1[i];
					x1[i] = x1[j];
					x1[j] = p;
				}
			}
		}
		for (i = 0;i < n2 - 1;i++)
		{
			for (j = i + 1;j < n2;j++)
			{
				if (x2[i] > x2[j])
				{
					p = x2[i];
					x2[i] = x2[j];
					x2[j] = p;
				}
			}
		}
	}
	public static void c()
	{
		int i;
		for (i = 0;i < n2;i++)
		{
			x1[n1 + i] = x2[i];
		}
	}
	public static void d()
	{
		int i;
		for (i = 0;i < n1 + n2;i++)
		{
			System.out.printf("%d",x1[i]);
			if (i < n1 + n2 - 1)
			{
			   System.out.print(" ");
			}
		}
	}
	public static int[] x1 = new int[1000];
	public static int[] x2 = new int[499];
	public static int n1;
	public static int n2;
	public static int Main()
	{

		a();
		b();
		c();
		d();

		return 0;
	}



}


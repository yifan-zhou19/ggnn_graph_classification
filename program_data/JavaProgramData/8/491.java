package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int c;
	public static int d;
	public static void kg()
	{
		System.out.print(" ");
	}
	public static void m(int s)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < s;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < s;i++)
		{
			for (j = 0;j < s - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < s;i++)
		{
			System.out.printf("%d",a[i]);
			if (i < s - 1)
			{
				kg();
			}
		}
	}
	public static void r()
	{
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
	}
	public static int Main()
	{
		r();
		m(c);
		kg();
		m(d);
	}
}


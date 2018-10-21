package <missing>;

public class GlobalMembers
{
	public static int d;
	public static int e;
	public static int f;
	public static int g;
		public static int[] a = new int[50];
		public static int[] b = new int[50];
		public static int[] c = new int[100];
	public static int get(int[] a, int[] b)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			f = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			g = Integer.parseInt(tempVar2);
		}
		 for (d = 0;d < f;d++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[d] = Integer.parseInt(tempVar3);
			 }
		 }
		 for (e = 0;e < g;e++)
		 {
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 b[e] = Integer.parseInt(tempVar4);
			 }
		 }
		 return 0;
	}
	public static int repick(int[] a, int[] b)
	{
		int h;
		for (d = 0;d < f;d++)
		{
			for (e = 0;e < (f - d - 1);e++)
			{
				if (a[e] > a[e+1])
				{
					  h = a[e+1];
					  a[e+1] = a[e];
					  a[e] = h;
				}
			}
		}
		for (d = 0;d < g;d++)
		{
			for (e = 0;e < (g - d - 1);e++)
			{
				if (b[e] > b[e+1])
				{
					   h = b[e+1];
					  b[e+1] = b[e];
					  b[e] = h;
				}
			}
		}
				return 0;
	}
	public static int hand(int[] a, int[] b, int[] c)
	{
		d = 0;
		while (d < f)
		{
			c[d] = a[d];
			d++;
		}
		while (d < (f + g))
		{
			c[d] = b[d - f];
			d++;
		}
		return 0;
	}
	public static int out(int[] c)
	{
		d = 0;
		System.out.printf("%d",c[d]);
		d++;
		while (d < (f + g))
		{
			System.out.printf(" %d",c[d]);
			d++;
		}
		return 0;
	}
	public static int Main()
	{
		get(a, b);
		repick(a, b);
		hand(a, b, c);
		out(c);
		return 0;
	}

}


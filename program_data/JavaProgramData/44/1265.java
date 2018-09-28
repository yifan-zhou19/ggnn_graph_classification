package <missing>;

public class GlobalMembers
{
	public static void reverse(int x)
	{
		int i;
		int[] b = new int[100];
		int p;
		int r;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		i = 0;
		if (x == 0 || x == (-0))
		{
		System.out.print("0");
		}
		if (x < 0)
		{
		p = 0;
		}
		else
		{
		p = 1;
		}
		y = Math.abs(x);
		while (y % 10 == 0)
		{
		  y = y / 10;
		}
		b[i] = y % 10;
		while (y / 10 != 0)
		{
		 y = y / 10;
		 b[i + 1] = y % 10;
		 i++;
		}
		if (p == 0)
		{
		System.out.print("-");
		}
		for (r = 0;r <= i;r++)
		{
		 System.out.printf("%d",b[r]);
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[i] = Integer.parseInt(tempVar);
		 }
		}
		for (i = 0;i < 6;i++)
		{
		 reverse(a[i]);
		}
		System.in.read();
		System.in.read();
	}

}


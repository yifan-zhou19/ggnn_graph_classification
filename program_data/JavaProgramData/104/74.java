package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int l2x;
		int l2y;
		int[] xx = new int[10];
		int[] yy = new int[10];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l2x = Math.log(x) / Math.log(2);
		l2y = Math.log(y) / Math.log(2);
		if (x == 8)
		{
			l2x = 3;
		}
		if (y == 8)
		{
			l2y = 3;
		}
		xx[l2x] = x - Math.pow(2,l2x);
		yy[l2y] = y - Math.pow(2,l2y);
		for (i = l2x - 1;i >= 0;i--)
		{
			xx[i] = xx[i + 1] / 2;
		}
		for (i = l2y - 1;i >= 0;i--)
		{
			yy[i] = yy[i + 1] / 2;
		}
		i = l2x;
		if (l2x > l2y)
		{
			i = l2y;
		}
		for (;i >= 0;i--)
		{
			if (xx[i] == yy[i])
			{
				System.out.print((Math.pow(2,i) + xx[i]));
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}
}


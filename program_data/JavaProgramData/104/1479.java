package <missing>;

public class GlobalMembers
{
	//???
	public static int Main()
	{
		int[] a = new int[11];
		int[] b = new int[11];
		int[] sum = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023};
		int x;
		int y;
		int i;
		int x0;
		int y0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 11;i++) //??x?y????
		{
			if (x > sum[i] && x <= sum[i + 1])
			{
				x0 = i + 1;
			}
			if (y > sum[i] && y <= sum[i + 1])
			{
				y0 = i + 1;
			}
		}
		a[x0] = x;
		b[y0] = y;
		for (i = x0 - 1;i > 0;i--) //??x???
		{
			a[i] = a[i + 1] / 2;
		}
		for (i = y0 - 1;i > 0;i--) //??y???
		{
			b[i] = b[i + 1] / 2;
		}
		if (x0 >= y0)
		{
			for (i = x0;i > 0;i--)
			{
				if (a[i] == b[i])
				{
					System.out.print(a[i]);
					System.out.print("\n");
					break;
				}
			}
		}
		else
		{
			for (i = y0;i > 0;i--)
			{
					if (a[i] == b[i])
					{
						System.out.print(a[i]);
						System.out.print("\n");
						break;
					}
			}
		}
		return 0;
	}
}


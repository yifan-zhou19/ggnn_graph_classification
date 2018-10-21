package <missing>;

public class GlobalMembers
{
	public static int two(int n) //?2?n??
	{
		int i;
		int sum = 1;
		for (i = 1;i <= n;i++)
		{
			sum = sum * 2;
		}
		return sum;
	}

	public static int pand(int x) //??x????
	{
		int i;
		int sign = 0;
		int m;
		for (i = 1;sign == 0;i++)
		{
			if (x >= two(i) != 0 && x < two(i + 1))
			{
				m = i + 1;
			 sign = 1;
			}
		}
		return m;
	}


	public static int Main()
	{
		int result;
		int i;
		int sign = 0;
		int x;
		int y;
		int lx;
		int ly;
		int[] xx = new int[20];
		int[] yy = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		if (x == 1 || y == 1)
		{
		result = 1;
		}
		else if (x == y)
		{
			result = x;
		}
		else
		{
			lx = pand(x);
			ly = pand(y);
			xx[lx - 1] = x;
			yy[ly - 1] = y;
			for (i = 2;i <= lx;i++)
			{
				xx[lx - i] = x / 2;
				x = x / 2;
			}
			for (i = 2;i <= ly;i++)
			{
				yy[ly - i] = y / 2;
				y = y / 2;
			}

			for (i = 0;sign == 0;i++)
			{
				if (xx[i] != yy[i])
				{
					sign = 1;
				 result = xx[i - 1];
				}
			}

		}

		System.out.printf("%d",result);

		return 0;
	}




}


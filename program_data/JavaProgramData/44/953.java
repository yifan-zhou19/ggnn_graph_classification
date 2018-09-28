package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] a = new int[6];
		int b;
		int reverse = int x;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i - 1] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i <= 5;i++)
		{
			b = reverse(a[i]);
			System.out.printf("%d\n",b);
		}
	}
		public static int reverse(int x)
		{
			int y;
			if (-9 <= x != 0 && x <= 9)
			{
				y = x;
			}
			else if (x >= 10 && x < 100)
			{
				y = x % 10 * 10 + (int)(x / 10);
			}
			else if (x >= 100 && x < 1000)
			{
				y = x % 10 * 100 + x / 100 + (x % 100 / 10) * 10;
			}
			else if (x >= 1000 && x < 10000)
			{
				y = x % 10 * 1000 + x / 1000 + (x % 100 / 10) * 100 + (x % 1000 / 100) * 10;
			}
			else if (x >= 10000)
			{
				y = x % 10 * 10000 + x / 10000 + (x % 100 / 10) * 1000 + (x % 1000 / 100) * 100 + (x % 10000 / 1000) * 10;
			}
			else if (x <= -10 && x>-100)
			{
				y = -((-x) % 10 * 10 + (int)((-x) / 10));
			}
	else if (x <= -100 && x>-1000)
	{

			y = -((-x) % 10 * 100 + (-x) / 100 + ((-x) % 100 / 10) * 10);
	}
	else if (x <= -1000 && x>-10000)
	{
				y = -((-x) % 10 * 1000 + (-x) / 1000 + ((-x) % 100 / 10) * 100 + ((-x) % 1000 / 100) * 10);
	}

	else if (x <= -10000)
	{
				y = -((-x) % 10 * 10000 + (-x) / 10000 + ((-x) % 100 / 10) * 1000 + ((-x) % 1000 / 100) * 100 + ((-x) % 10000 / 1000) * 10);
	}
	return (y);
		}

}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int fan = int x;
		int i;
		int a;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",fan(a));
		}
	}

	public static int fan(int x)
	{
		int i = 0;
		int s = 100000;
		int[] n = new int[5];
		int f = 0;
		int m = 0;
		int k;
		if (x > 0)
		{
			for (i = 0;i < 5;i++)
			{
				s = s / 10;
				if ((x / s) != 0)
				{
					k = i;
					break;
				}
				else
				{
					continue;
				}
			}


			for (i = k;i < 5;i++)
			{
				n[i - k] = x / s;
				if ((x / s) != 0)
				{
					x = x % s;
				}
				s = s / 10;
			}

			s = 1;

			for (i = 0;i < 5 - k;i++)
			{
				f = f + n[i] * s;
				s = s * 10;
			}

			return (f);
		}

		else if (x < 0)
		{
			x = -x;

			for (i = 0;i < 5;i++)
			{
				s = s / 10;
				if ((x / s) != 0)
				{
					k = i;
					break;
				}
				else
				{
					continue;
				}
			}


			for (i = k;i < 5;i++)
			{
				n[i - k] = x / s;
				if ((x / s) != 0)
				{
					x = x % s;
				}
				s = s / 10;
			}

			s = 1;

			for (i = 0;i < 5 - k;i++)
			{
				f = f + n[i] * s;
				s = s * 10;
			}

			return (-f);
		}

		else
		{
			return (0);
		}
	}
}


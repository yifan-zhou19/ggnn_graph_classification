package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int i;
		int result;
		int[] sz = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			result = reverse(sz[i]);
			System.out.printf("%d\n",result);
		}

		return 0;
	}

	public static int reverse(int num)
	{
		int g = 0;
		int s = 0;
		int b = 0;
		int q = 0;
		int w = 0;
		int a;
		int y;
		int goal;
		a = Math.abs(num);

		w = a / 10000;
		q = a / 1000 - w * 10;
		b = a / 100 - w * 100 - q * 10;
		s = a / 10 - w * 1000 - q * 100 - b * 10;
		g = a % 10;

		if (w != 0)
		{
			y = g * 10000 + s * 1000 + b * 100 + q * 10 + w;
		}
		if (w == 0 && q != 0)
		{
			y = g * 1000 + s * 100 + b * 10 + q;
		}
		if (w == 0 && q == 0 && b != 0)
		{
			y = g * 100 + s * 10 + b;
		}
		if (w == 0 && q == 0 && b == 0 && s != 0)
		{
			y = g * 10 + s;
		}
		if (w == 0 && q == 0 && b == 0 && s == 0)
		{
			y = g;
		}

		if (num < 0)
		{
			goal = y * (-1);
		}
		else
		{
			goal = y;
		}

		return (goal);
	}
}


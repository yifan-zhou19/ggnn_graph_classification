package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[N];
		int i;
		int reverse = int x;

		for (i = 0;i < N;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}

		for (i = 0;i < N;i++)
		{
			System.out.printf("%d\n",reverse(a[i]));
		}

		return 0;
	}

	public static int reverse(int x)
	{
		int y;
		int i;
		int j;
		int r;
		int[] a = new int[M];

		for (r = 0;x >= 10 || x <= -10;r++)
		{
			a[r] = x % 10;
			x = (x - x % 10) / 10;
		}
		a[r] = x;

		for (i = 0,y = 0;i <= r;i++)
		{
			for (j = 1;j <= r - i;j++)
			{
				a[i] = a[i] * 10;
			}
			y = y + a[i];
		}

		return y;
	}
}


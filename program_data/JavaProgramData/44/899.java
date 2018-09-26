package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[6];
		int i;
		int rvs = int x;
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
			a[i] = rvs(a[i]);
			System.out.printf("%d\n",a[i]);
		}
	}

	public static int rvs(int x)
	{
		int[] z = new int[5];
		int sign;
		int j;
		int y;
		if (x < 0)
		{
			sign = -1;
		}
		else if (x == 0)
		{
			sign = 0;
		}
		else
		{
			sign = 1;
		}
		x *= sign; //??x???
		for (j = 4;j >= 0;j--)
		{
			z[j] = x - x / 10 * 10; //????
			x /= 10;
		}
		y = sign * (10000 * z[4] + 1000 * z[3] + 100 * z[2] + 10 * z[1] + z[0]);
		for (j = 0;j < 5;j++)
		{
			if (z[j] == 0)
			{
				y /= 10; //?????0
			}
			if (z[j] != 0)
			{
				break; //??01230????2?10???????
			}
		}
		return (y);
	}

}


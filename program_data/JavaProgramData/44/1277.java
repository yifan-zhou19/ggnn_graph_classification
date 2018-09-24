package <missing>;

public class GlobalMembers
{
	public static int fanxu(int x)
	{
		int[] sz = new int[5];
		int y = 0;
		int i = 0;
		sz[0] = x % 10;
		sz[1] = (x % 100) / 10;
		sz[2] = (x % 1000) / 100;
		sz[3] = (x % 10000) / 1000;
		sz[4] = x / 10000;
		y = sz[0] * 10000 + sz[1] * 1000 + sz[2] * 100 + sz[3] * 10 + sz[4];
		for (i = 1;i <= 5;i++)
		{
			if (y % 10 == 0)
			{
				y = y / 10;
			}
		}
		return y;
	}
	public static void Main(String[] args)
	{
		int n = 0;
		int t = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n >= 0)
			{
				n = fanxu(n);
			}
			else
			{
				n = -1 * n;
				n = fanxu(n);
				n = -1 * n;
			}
			System.out.printf("%d\n",n);
			t++;
			if (t == 6)
			{
				break;
			}
		}
	}

}


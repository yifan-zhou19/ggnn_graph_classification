package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int[] mw = new int[8];
		int z;
		int k;
		int i;
		k = 8;
		z = 0;
		mw[7] = num / 10000000;
		mw[6] = (num / 1000000) % 10;
		mw[5] = (num / 100000) % 10;
		mw[4] = (num / 10000) % 10;
		mw[3] = (num / 1000) % 10;
		mw[2] = (num / 100) % 10;
		mw[1] = (num / 10) % 10;
		mw[0] = num % 10;
		for (i = 7;i >= 0;i--)
		{
			if (mw[i] == 0 || mw[i] == -0)
			{
				k--;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i <= k - 1;i++)
		{
			z = z + mw[i] * Math.pow(10,(k - 1 - i));
		}
		return z;
	}
	public static int Main()
	{
		int[] sz = new int[6];
		int[] rsz = new int[6];
		int i;
		for (i = 0;i <= 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				(sz[i]) = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i <= 5;i++)
		{
			rsz[i] = reverse(sz[i]);
		}
		for (i = 0;i <= 5;i++)
		{
			System.out.printf("%d\n",rsz[i]);
		}
		return 0;
	}


}


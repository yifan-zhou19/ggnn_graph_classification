package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int zheng = Math.abs(num);
		int[] sz = new int[10];
		int i;
		int wei = 0;
		for (i = 0;i < 10;i++)
		{
			sz[i] = zheng % 10;
			zheng = zheng / 10;
			wei++;
			if (zheng == 0)
			{
				break;
			}
		}
		int Reverse = 0;
		for (i = 0;i < wei;i++)
		{
			Reverse = Reverse * 10 + sz[i];
		}
		return Reverse;
	}
	public static int Main()
	{
		int n;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n > 0)
			{
				System.out.printf("%d\n",reverse(n));
			}
			else
			{
				System.out.printf("%d\n",-reverse(n));
			}
		}
		return 0;
	}

}


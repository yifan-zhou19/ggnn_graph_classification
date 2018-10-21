package <missing>;

public class GlobalMembers
{
	public static int p(int n, int heightLimit, int[] missileHeight, int missileNum)
	{
		int a;
		int b;

		//???????????????
		if (n == missileNum - 1)
		{
			if (missileHeight[n] <= heightLimit)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			if (missileHeight[n] <= heightLimit)
			{
				a = 1 + p(n + 1, missileHeight[n], missileHeight, missileNum);
				b = p(n + 1, heightLimit, missileHeight, missileNum);
				return a > b != 0?a:b;
			}
			else
			{
				return p(n + 1, heightLimit, missileHeight, missileNum);
			}
		}
	}

	public static void Main()
	{
			int n;
			int i;
			int j;
			int[] missileHeight;

			int highest = -1;


			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
	missileHeight = new int[n];

	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(missileHeight[i]) = Integer.parseInt(tempVar2);
		}
		if (missileHeight[i] > highest)
		{
			highest = missileHeight[i];
		}
	}
		System.out.printf("%d",p(0, highest, missileHeight, n));
	}
}


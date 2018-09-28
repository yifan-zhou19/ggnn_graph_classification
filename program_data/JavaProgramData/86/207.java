package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sum = new int[21];
		int n;
		int cishu;
		int standred;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				cishu = Integer.parseInt(tempVar2);
			}

			sum[cishu] = 60;
			for (int k = 0;k < cishu;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sum[k] = Integer.parseInt(tempVar3);
				}
			}
			for (int t = 0;t < cishu + 1;t++)
			{
				standred = 60 - sum[t] - 3 * t;
				if (standred < 0)
				{
					System.out.printf("%d\n",60 - 3 * t);
					break;
				}
				else if (standred > -1 && standred < 4)
				{
					System.out.printf("%d\n",sum[t]);
					break;
				}

			}
		}
		return 0;
	}

}


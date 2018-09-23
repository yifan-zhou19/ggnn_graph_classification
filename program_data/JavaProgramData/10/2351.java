package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num; //lj[ex-turn][turn]
		int[] h = {100000000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[][] lj = new int[27][27];
		int i;
		int j;
		int k;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = num;i >= 0;i--) //exturn
		{
			for (j = num;j > i;j--) //turn
			{
				if (h[i] >= h[j])
				{
					max = 0;
					for (k = j;k <= num;k++) //???j?
					{
						max = (max > lj[i][k])?max:lj[i][k];
					}
					for (k = j;k <= num;k++) //???
					{
						if (h[j] >= h[k])
						{
							max = (max > lj[j][k] + 1)?max:lj[j][k] + 1;
						}
					}
					lj[i][j] = max;
				}
			}
		}
		System.out.printf("%d\n",lj[0][1]);
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int[][] s = new int[8][8];
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		int[] max = new int[8];
		int[] mh = new int[8];
		int[] ml = new int[8];
		int f;
		for (i = 0;i < h;i++)
		{
			f = 1;
			for (k = 0;k < l;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][k] = Integer.parseInt(tempVar3);
				}
				if (f == 1)
				{
					max[i] = s[i][0];
					mh[i] = i;
					ml[i] = 0;
					f = 0;
				}
				if (f == 0 && max[i] < s[i][k])
				{
					max[i] = s[i][k];
					ml[i] = k;
				}
			}
		}
		int ff = 1;
		for (i = 0;i < h;i++)
		{
			for (k = 0;k < h;k++)
			{
				if (max[i] > s[k][(ml[i])])
				{
					break;
				}
				else
				{
					if (k == (h - 1))
					{
						System.out.printf("%d+%d",mh[i],ml[i]);
						ff = 0;
					}
				}
			}
			if (ff == 1 && i == (h - 1))
			{
				System.out.print("No");
			}
		}
		return 0;
	}

}


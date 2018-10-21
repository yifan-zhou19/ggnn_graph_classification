package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[100][21];
		int i;
		int t;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			int g = sz[i][0];
			for (t = 1;t <= g;t++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][t] = Integer.parseInt(tempVar3);
				}
			}
		}
		int time = 0;
		int sa = 0;
		int qs;
		for (i = 0;i < n;i++)
		{
			time = 0;
			qs = sz[i][0];
			sa = sz[i][qs] + 3 * sz[i][0];
			if (sa < 60)
			{
				time = 60 - 3 * sz[i][0];
				System.out.printf("%d\n",time);
			}
			else
			{
				for (t = 1;t <= sz[i][0];t++)
				{
				   time = sz[i][t] + t * 3;
				   if (time == 60)
				   {
						 System.out.printf("%d\n",sz[i][t]);
						break;
				   }
				   if (time > 60 && time <= 63)
				   {
						System.out.printf("%d\n",sz[i][t]);
						break;
				   }
				   if (time > 63)
				   {
						time = sz[i][t] - time+3 + 60;
						System.out.printf("%d\n",time);
						break;
				   }
				}
			}
		}
		return 0;
	}




}


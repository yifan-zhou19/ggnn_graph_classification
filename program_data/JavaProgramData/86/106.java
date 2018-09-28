package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int a;
		int time;
		int all;
		int ans;
		int alltime;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			alltime = 60;
			ans = 0;
			time = 0;
			for (k = 1;k <= a;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					all = Integer.parseInt(tempVar3);
				}
				if (all + k * 3 <= 60)
				{
					time = all + k * 3;
					ans = all;
				}
				if (all + k * 3 == 61)
				{
					alltime = alltime-2;
				}
				 if (all + k * 3 == 62)
				 {
					 alltime = alltime-1;
				 }
			}
			ans = ans + (alltime - time);
			System.out.printf("%d\n",ans);
		}
		return 0;
	}


}


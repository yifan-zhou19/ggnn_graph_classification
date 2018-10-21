package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //ps=systolic pressure,pd=diabolic pressure
		int[] sp = new int[101];
		int[] dp = new int[101];
		int[] d = new int[101];
		int h = 0;
		int max = 0;
		int i;
		int j;
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
				sp[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				dp[i] = Integer.parseInt(tempVar3);
			}
			if (sp[i] >= 90 && sp[i] <= 140 && dp[i] >= 60 && dp[i] <= 90)
			{
				h++;
				d[i] = h;
			}
			else
			{
				d[i] = h = 0;
			}
		}

	//now for the maximum of duration//

		for (j = 1;j <= n;j++)
		{
			if (max >= d[j])
			{
				continue;
			}
			else
			{
				max = d[j];
			}
		}
		System.out.printf("%d\n",max);
	}
}


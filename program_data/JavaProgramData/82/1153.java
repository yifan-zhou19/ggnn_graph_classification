package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int max = 0;
		int[][] pre = new int[101][2];
		int n;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pre[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pre[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((pre[i][0] >= 90) && (pre[i][0] <= 140) && (pre[i][1] >= 60) && (pre[i][1] <= 90))
			{
				sum++;
				if (sum > max)
				{
					max = sum;
				}
			}
			else
			{
				sum = 0;
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}

}


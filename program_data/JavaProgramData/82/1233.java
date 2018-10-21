package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int max = 0;
		int[] sum = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = j = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
			{
				sum[j]++;
			}
			else
			{
				if (sum[j] != 0)
				{
					j++;
				}
			}
		}
		for (i = 0;i < 50;i++)
		{
			if (max <= sum[i])
			{
				max = sum[i];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}

}


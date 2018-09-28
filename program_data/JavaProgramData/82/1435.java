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
		int[][] xueya = new int[100][2];
		int[] shijian = new int[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xueya[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				xueya[i][1] = Integer.parseInt(tempVar3);
			}
			if (xueya[i][0] >= 90 && xueya[i][0] <= 140 && xueya[i][1] >= 60 && xueya[i][1] <= 90)
			{
				shijian[i] = 1;
			}
			else
			{
				shijian[i] = 0;
			}
		}
		int[] duan = new int[100];
		for (i = 0;i < n;i++)
		{
			duan[i] = 0;
		}

		int j = 0;
		for (i = 0;i < n;i++)
		{
			if (shijian[i] == 1)
			{
				duan[j]++;
			}
			else if (shijian[i] == 0)
			{
				j++;
			}
		}
		int max = 0;
		for (i = 0;i < n;i++)
		{
			if (duan[i] > max)
			{
				max = duan[i];
			}
		}
		System.out.printf("%d",max);



		return 0;
	}
}


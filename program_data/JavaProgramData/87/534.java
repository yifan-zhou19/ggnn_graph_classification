package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] shuzu = new int[100][6];
		int[] zongshu = new int[100];
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			shuzu[i][0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			shuzu[i][1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			shuzu[i][2] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			shuzu[i][3] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			shuzu[i][4] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			shuzu[i][5] = Integer.parseInt(tempVar6);
		}
		while (!((shuzu[i][0] == 0) && (shuzu[i][1] == 0) && (shuzu[i][2] == 0) && (shuzu[i][3] == 0) && (shuzu[i][4] == 0) && (shuzu[i][5] == 0)))
		{
			shuzu[i][3] += 12;
			zongshu[i] = 60 - shuzu[i][2] + shuzu[i][5];
			   shuzu[i][2] = 0;
			shuzu[i][5] = 0;
			shuzu[i][1]++;
			zongshu[i] += 60 * shuzu[i][4] + (60 - shuzu[i][1]) * 60;
			shuzu[i][0]++;
			zongshu[i] += (shuzu[i][3] - shuzu[i][0]) * 3600;
			System.out.printf("%d\n",zongshu[i]);
			i++;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				shuzu[i][0] = Integer.parseInt(tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				shuzu[i][1] = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				shuzu[i][2] = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				shuzu[i][3] = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				shuzu[i][4] = Integer.parseInt(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				shuzu[i][5] = Integer.parseInt(tempVar12);
			}
		}
		return 0;
	}

}


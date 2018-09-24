public class stu
{
	public int num;
	public int score1;
	public int score2;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu[] damn = tangible.Arrays.initializeWithDefaultstuInstances(4);
		int n;
		int i;
		int j;
		int total;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 3;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				damn[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				damn[i].score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				damn[i].score2 = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < 2;i++)
		{
			for (j = 0;j < 2 - i;j++)
			{
				if (damn[j].score1 + damn[j].score2 < damn[j + 1].score1 + damn[j + 1].score2)
				{
					damn[3] = damn[j];
					damn[j] = damn[j + 1];
					damn[j + 1] = damn[3];
				}
			}
		}
		for (i = 0;i < n - 3;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				damn[3].num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				damn[3].score1 = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				damn[3].score2 = Integer.parseInt(tempVar7);
			}
			if (damn[3].score1 + damn[3].score2 < damn[2].score1 + damn[2].score2)
			{
				continue;
			}
			else if (damn[3].score1 + damn[3].score2 <= damn[1].score1 + damn[1].score2 && damn[3].score1 + damn[3].score2> damn[2].score1 + damn[2].score2)
			{
				damn[2] = damn[3];
			}
			else if (damn[3].score1 + damn[3].score2 <= damn[0].score1 + damn[0].score2 && damn[3].score1 + damn[3].score2> damn[1].score1 + damn[1].score2)
			{
				damn[2] = damn[1];
				damn[1] = damn[3];
			}
			else if (damn[3].score1 + damn[3].score2 > damn[0].score1 + damn[0].score2)
			{
				damn[2] = damn[1];
				damn[1] = damn[0];
				damn[0] = damn[3];
			}

		}
		for (i = 0;i < 2;i++)
		{
			total = damn[i].score1 + damn[i].score2;
			System.out.printf("%d %d\n",damn[i].num,total);
		}
		total = damn[i].score1 + damn[i].score2;
		System.out.printf("%d %d",damn[i].num,total);
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] p = new int[100];
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char name[20];
	//		int exscore;
	//		int clscore;
	//		char ganbu;
	//		char west;
	//		int lunwen;
	//	}
	//	st[100];

		int max = p[0];
		int k;

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
				st[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				st[i].exscore = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				st[i].clscore = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				st[i].ganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				st[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				st[i].lunwen = tempVar7;
			}
			if (st[i].exscore > 80 && st[i].lunwen >= 1)
			{
				p[i] += 8000;
			}
			if (st[i].exscore > 85 && st[i].clscore > 80)
			{
				p[i] += 4000;
			}
			if (st[i].exscore > 90)
			{
				p[i] += 2000;
			}
			if (st[i].exscore > 85 && st[i].west == 'Y')
			{
				p[i] += 1000;
			}
			if (st[i].clscore > 80 && st[i].ganbu == 'Y')
			{
				p[i] += 850;
			}
			sum += p[i];

			if (p[i] > max)
			{
			   max = p[i];
			   k = i;
			}

		}


		System.out.printf("%s\n",st[k].name);
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",sum);
		return 0;
	}


}


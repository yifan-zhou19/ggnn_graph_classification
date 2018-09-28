package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct money
	//	{
	//		char name[20];
	//		int score1,score2;
	//		char a[2],b[2];
	//		int paper;
	//		int all;
	//	};
		money[] p;
		int n;
		int m;
		int[] pp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = tangible.Arrays.initializeWithDefaultmoneyInstances(n);
		pp = new int[n];
		for (m = 0;m < n;m++)
		{
			pp[m] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[m].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[m].score1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p[m].score2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p[m].a = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p[m].b = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p[m].paper = tempVar7;
			}
			if (p[m].score1 > 80 && p[m].paper > 0)
			{
				pp[m] = pp[m] + 8000;
			}
			if (p[m].score1 > 85 && p[m].score2 > 80)
			{
				pp[m] = pp[m] + 4000;
			}
			if (p[m].score1 > 90)
			{
				pp[m] = pp[m] + 2000;
			}
			if (p[m].b[0] == 'Y' && p[m].score1 > 85)
			{
				pp[m] = pp[m] + 1000;
			}
			if (p[m].a[0] == 'Y' && p[m].score2 > 80)
			{
				pp[m] = pp[m] + 850;
			}
			p[m].all = pp[m];
		}
		int i;
		int j;
		int k;
		int q = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (pp[j] > pp[j + 1])
				{
					k = pp[j];
					pp[j] = pp[j + 1];
					pp[j + 1] = k;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			q = q + pp[i];
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].all == pp[n - 1])
			{
				System.out.printf("%s\n%d\n%d\n",p[i].name,p[i].all,q);
				break;
			}
		}

		p = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pp);
	}

}


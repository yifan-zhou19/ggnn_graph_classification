package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct data
	//	{
	//		char name[22];
	//		int score1;
	//		int score2;
	//		char mas;
	//		char dis;
	//		int paper;
	//		int sum;
	//	}
	//	p[100];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		for (i = 0 ; i < n ; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p[i].score1) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(p[i].score2) = tempVar4;
			}
			System.in.read();
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				(p[i].mas) = tempVar5;
			}
			System.in.read();
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				(p[i].dis) = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				(p[i].paper) = tempVar7;
			}
		}
		for (i = 0 ; i < n ; i++)
		{
			p[i].sum = 0;
		}
		int k = 0;
		int max = 0;
		int total = 0;
		for (i = 0 ; i < n ; i++)
		{
			if (p[i].score1 > 80 && p[i].paper >= 1)
			{
				p[i].sum += 8000;
			}
			if (p[i].score1 > 85 && p[i].score2 > 80)
			{
				p[i].sum += 4000;
			}
			if (p[i].score1 > 90)
			{
				p[i].sum += 2000;
			}
			if (p[i].score1 > 85 && p[i].dis == 'Y')
			{
				p[i].sum += 1000;
			}
			if (p[i].score2 > 80 && p[i].mas == 'Y')
			{
				p[i].sum += 850;
			}
			total += p[i].sum;
			if (p[i].sum > max)
			{
				max = p[i].sum;
				k = i;
			}
		}
		System.out.printf("%s\n",p[k].name);
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",total);
		return 0;
	}

}


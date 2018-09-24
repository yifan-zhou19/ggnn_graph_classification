package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct score
	//	{
	//		int n;
	//		int a;
	//		int b;
	//		int c;
	//	}
	//	score[5];
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		score[1].n = 0;
		score[1].c = 0;
		score[2].n = 0;
		score[2].c = 0;
		score[3].n = 0;
		score[3].c = 0;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				score[4].n = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[4].a = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				score[4].b = tempVar4;
			}
			score[4].c = score[4].a + score[4].b;
			if (score[4].c > score[1].c)
			{
				score[3] = score[2];
				score[2] = score[1];
				score[1] = score[4];
			}
			else if (score[4].c > score[2].c)
			{
				score[3] = score[2];
				score[2] = score[4];
			}
			else if (score[4].c > score[3].c)
			{
				score[3] = score[4];
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",score[1].n,score[1].c,score[2].n,score[2].c,score[3].n,score[3].c);
		return 0;
	}
}


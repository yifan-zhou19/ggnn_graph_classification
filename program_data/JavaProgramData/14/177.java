package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//	 int sc;
	//	 int sm;
	//	 int score;
	//	}
	//	student[100001];
		int n;
		int i;
		int j;
		int k;
		int m;
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
				student[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				student[i].sc = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				student[i].sm = tempVar4;
			}
		}
		for (i = 1;i <= n;i++)
		{
			student[i].score = (student[i].sc + student[i].sm);
		}
		int x;
		int y;
		int z;
		int r;
		int s;
		int t;
		int a;
		int b;
		int d;
		a = 1;
		b = 1;
		d = 1;
		for (i = n;i >= 1;i--)
		{
			if (student[i].score >= a)
			{
			a = student[i].score;
			x = i;
			}
		}
		for (i = n;i >= 1;i--)
		{
						  if ((i != x) && (student[i].score >= b))
						  {
							  b = student[i].score;
							  y = i;
						  }
		}
		for (i = n;i >= 1;i--)
		{
						  if ((i != x) && (i != y) && (student[i].score >= d))
						  {
							  d = student[i].score;
							  z = i;
						  }
		}

		System.out.printf("%d %d\n%d %d\n%d %d",student[x].num,student[x].score,student[y].num,student[y].score,student[z].num,student[z].score);
	}

}


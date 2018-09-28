package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[21];
	//		int score1;
	//		int score2;
	//		char leader;
	//		char west;
	//		int essay;
	//		struct student *next,*last;
	//	};
		student p;
		int n;
		int i;
		int sum = 0;
		int scholar;
		int max = 0;
		String goodstudent = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			p = new student();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.score1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.score2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.leader = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p.essay = tempVar7;
			}
			scholar = 0;
			if (p.score1 > 80 && p.essay >= 1)
			{
				scholar += 8000;
			}
			if (p.score1 > 85 && p.score2 > 80)
			{
				scholar += 4000;
			}
			if (p.score1 > 90)
			{
				scholar += 2000;
			}
			if (p.score1 > 85 && p.west == 'Y')
			{
				scholar += 1000;
			}
			if (p.score2 > 80 && p.leader == 'Y')
			{
				scholar += 850;
			}
			sum += scholar;
			if (scholar > max)
			{
				max = scholar;
				goodstudent = "";
				goodstudent = p.name;
			}
			p = null;
		}
		System.out.printf("%s\n%d\n%d",goodstudent,max,sum);
		return 0;
	}
}


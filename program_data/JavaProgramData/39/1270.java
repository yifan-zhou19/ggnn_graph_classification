package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[30]; //??????????\0
	//		int as;
	//		int cs;
	//		char pos;
	//		char xibu;
	//		int paper;
	//		int money;
	//	}
	//	stu[100],*p;
		p = stu;
		int i;
		int n;
		int sum = 0;
		int mark;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++,p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.as = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.cs = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.pos = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.xibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p.paper = tempVar7;
			}
			p.money = 0;
			if (p.as > 80 && p.paper >= 1)
			{
				p.money = p.money + 8000;
			}
			if (p.as > 85 && p.cs > 80)
			{
				p.money = p.money + 4000;
			}
			if (p.as > 90)
			{
				p.money = p.money + 2000;
			}
			if (p.as > 85 && p.xibu == 'Y')
			{
				p.money = p.money + 1000;
			}
			if (p.pos == 'Y' && p.cs > 80)
			{
				p.money = p.money + 850;
			}
			sum = sum + p.money;
		}
		p = stu; //????????
		for (i = 0;i < n - 1;i++,p++)
		{
			if (p.money > max)
			{
				max = p.money;
				mark = i;
			}
		}
		System.out.printf("%s\n%d\n%d",stu[mark].name,max,sum);

	}
}


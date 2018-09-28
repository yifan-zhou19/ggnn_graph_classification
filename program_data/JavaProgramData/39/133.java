package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int a;
	//		int b;
	//		char c;
	//		char d;
	//		int num;
	//		int money;
	//	}
	//	stu[100];
		int n;
		int i;
		int j = 0;
		int he = 0;
		int max = 0;
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
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].a = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].b = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].c = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].d = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].num = tempVar7;
			}
			stu[i].money = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].a > 80 && stu[i].num >= 1)
			{
				stu[i].money = stu[i].money + 8000;
			}
			if (stu[i].a > 85 && stu[i].b > 80)
			{
				stu[i].money = stu[i].money + 4000;
			}
			if (stu[i].a > 90)
			{
				stu[i].money = stu[i].money + 2000;
			}
			if (stu[i].a > 85 && stu[i].d == 'Y')
			{
				stu[i].money = stu[i].money + 1000;
			}
			if (stu[i].b > 80 && stu[i].c == 'Y')
			{
				stu[i].money = stu[i].money + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].money > max)
			{
				max = stu[i].money;
				j = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			he = he + stu[i].money;
		}
		System.out.printf("%s\n%d\n%d\n",stu[j].name,max,he);
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int score1;
	//		int score2;
	//		char c1;
	//		char c2;
	//		int paper;
	//		int bonus;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		int n;
		int i;
		int sum;
		int max;
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
				 stu[i].score1 = tempVar3;
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 stu[i].score2 = tempVar4;
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar5 != null)
			 {
				 stu[i].c1 = tempVar5;
			 }
			 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar6 != null)
			 {
				 stu[i].c2 = tempVar6;
			 }
			 String tempVar7 = ConsoleInput.scanfRead(" ");
			 if (tempVar7 != null)
			 {
				 stu[i].paper = tempVar7;
			 }
		}
		for (i = 0;i < n;i++)
		{
			stu[i].bonus = 0;
			if (stu[i].score1 > 80 && stu[i].paper >= 1)
			{
			  stu[i].bonus += 8000;
			}
			if (stu[i].score1 > 85 && stu[i].score2 > 80)
			{
			  stu[i].bonus += 4000;
			}
			if (stu[i].score1 > 90)
			{
			  stu[i].bonus += 2000;
			}
			if (stu[i].score1 > 85 && stu[i].c2 == 'Y')
			{
			  stu[i].bonus += 1000;
			}
			if (stu[i].score2 > 80 && stu[i].c1 == 'Y')
			{
			  stu[i].bonus += 850;
			}
		}
		max = 0;
		for (i = 1;i <= n;i++)
		{
		 if (stu[i].bonus > stu[max].bonus)
		 {
			 max = i;
		 }
		}
		System.out.printf("%s\n",stu[max].name);
		System.out.printf("%d\n",stu[max].bonus);
		sum = 0;
		for (i = 0;i < n;i++)
		{
		 sum += stu[i].bonus;
		}
		System.out.printf("%d",sum);
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	 struct student
	//	{
	//		   char name[21];
	//		   int final;
	//		   int cla;
	//		   char l;
	//		   char w;
	//		   int paper;
	//		   int total;
	//	};
		int k;
		int i;
		int t;
		int max;
		t = max = 0;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   stu[i].name = tempVar2;
						   }
						   String tempVar3 = ConsoleInput.scanfRead(" ");
						   if (tempVar3 != null)
						   {
							   stu[i].final = tempVar3;
						   }
						   String tempVar4 = ConsoleInput.scanfRead();
						   if (tempVar4 != null)
						   {
							   stu[i].cla = tempVar4;
						   }
						   String tempVar5 = ConsoleInput.scanfRead(" ", 1);
						   if (tempVar5 != null)
						   {
							   stu[i].l = tempVar5;
						   }
						   String tempVar6 = ConsoleInput.scanfRead(" ", 1);
						   if (tempVar6 != null)
						   {
							   stu[i].w = tempVar6;
						   }
						   String tempVar7 = ConsoleInput.scanfRead(" ");
						   if (tempVar7 != null)
						   {
							   stu[i].paper = tempVar7;
						   }
						   stu[i].total = 0;
						   if (stu[i].final > 80 && stu[i].paper >= 1)
						   {
							   stu[i].total = stu[i].total + 8000;
						   }
						   if (stu[i].final > 85 && stu[i].cla > 80)
						   {
							   stu[i].total = stu[i].total + 4000;
						   }
						   if (stu[i].final > 90)
						   {
							   stu[i].total = stu[i].total + 2000;
						   }
						   if (stu[i].final > 85 && stu[i].w == 'Y')
						   {
							   stu[i].total = stu[i].total + 1000;
						   }
						   if (stu[i].cla > 80 && (stu[i].l == 'Y'))
						   {
							   stu[i].total = stu[i].total + 850;
						   }
		}
		for (i = 0;i <= k - 1;i++)
		{
						   if (stu[i].total > max)
						   {
						   max = stu[i].total;
						   }
						   t = t + stu[i].total;
		}
		for (i = 0;i <= k - 1;i++)
		{
						   if (stu[i].total == max)
						   {
						   System.out.printf("%s\n",stu[i].name);
						   System.out.printf("%d\n",stu[i].total);
						   break;
						   }
		}
		System.out.printf("%d\n",t);
	return 0;
	}
}


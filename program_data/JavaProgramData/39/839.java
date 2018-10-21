package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		   char name[1000];
	//		   int final;
	//		   int clas;
	//		   char ganbu;
	//		   char west;
	//		   int paper;
	//	}
	//	stu[1000];

		for (i = 1;i <= n;i++)
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
						String tempVar4 = ConsoleInput.scanfRead(" ");
						if (tempVar4 != null)
						{
							stu[i].clas = tempVar4;
						}
						String tempVar5 = ConsoleInput.scanfRead(" ", 1);
						if (tempVar5 != null)
						{
							stu[i].ganbu = tempVar5;
						}
						String tempVar6 = ConsoleInput.scanfRead(" ", 1);
						if (tempVar6 != null)
						{
							stu[i].west = tempVar6;
						}
						String tempVar7 = ConsoleInput.scanfRead(" ");
						if (tempVar7 != null)
						{
							stu[i].paper = tempVar7;
						}
		}
		int[] total = new int[1000];
		for (i = 1;i <= n;i++)
		{
						 if (stu[i].final > 80 && stu[i].paper >= 1)
						 {
															 total[i] = total[i] + 8000;
						 }
						 if (stu[i].final > 85 && stu[i].clas > 80)
						 {
															total[i] = total[i] + 4000;
						 }
						 if (stu[i].final > 90)
						 {
															 total[i] = total[i] + 2000;
						 }
						 if (stu[i].final > 85 && stu[i].west == 'Y')
						 {
															  total[i] = total[i] + 1000;
						 }
						 if (stu[i].clas > 80 && stu[i].ganbu == 'Y')
						 {
															  total[i] = total[i] + 850;
						 }

		}

		int max = total[1];
		int sum = total[1];
		int k;
		for (i = 2;i <= n;i++)
		{
						 sum = sum + total[i];
						 if (total[i] > max)
						 {
										 max = total[i];
						 }
		}
		for (i = 1;i <= n;i++)
		{
						 if (total[i] == max)
						 {
										  System.out.printf("%s\n", stu[i].name);
										  break;
						 }
		}
		System.out.printf("%d\n", max);
		System.out.printf("%d", sum);



		return 0;
	}

}


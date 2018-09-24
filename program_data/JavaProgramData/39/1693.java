package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int price;
		int total = 0;
		int max = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		   char name[21];
	//		   int ave;
	//		   int comment;
	//		   char officer;
	//		   char province;
	//		   int paper;
	//		   }
	//		   stu[100];
		for (i = 0;i < N;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 stu[i].name = tempVar2;
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 stu[i].ave = tempVar3;
						 }
						 String tempVar4 = ConsoleInput.scanfRead(" ");
						 if (tempVar4 != null)
						 {
							 stu[i].comment = tempVar4;
						 }
						 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
						 if (tempVar5 != null)
						 {
							 stu[i].officer = tempVar5;
						 }
						 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
						 if (tempVar6 != null)
						 {
							 stu[i].province = tempVar6;
						 }
						 String tempVar7 = ConsoleInput.scanfRead(" ");
						 if (tempVar7 != null)
						 {
							 stu[i].paper = tempVar7;
						 }
		}
		for (i = 0;i < N;i++)
		{
						 price = 0;
						 if (stu[i].ave > 80 && stu[i].paper > 0)
						 {
							 price = price+8000;
						 }
						 if (stu[i].ave > 85 && stu[i].comment > 80)
						 {
							 price = price+4000;
						 }
						 if (stu[i].ave > 90)
						 {
							 price = price+2000;
						 }
						 if (stu[i].ave > 85 && stu[i].province == 'Y')
						 {
							 price = price+1000;
						 }
						 if (stu[i].comment > 80 && stu[i].officer == 'Y')
						 {
							 price = price+850;
						 }
						 total = total + price;
						 if (price > max)
						 {
									   max = price;
									   t = i;
						 }
		}
		System.out.printf("%s\n%d\n%d\n",stu[t].name,max,total);

		return 0;
	}

}


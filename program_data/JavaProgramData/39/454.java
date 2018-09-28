package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max = 0;
		int sum = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	   char name[20];
	//	   int ascore;
	//	   int bscore;
	//	   char good;
	//	   char west;
	//	   int work;
	//	   int money;
	//	 }
	//	 stu[100];
		 for (i = 0;i < n;i++)
		 {
			 stu[i].money = 0;
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
				 stu[i].ascore = tempVar3;
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 stu[i].bscore = tempVar4;
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar5 != null)
			 {
				 stu[i].good = tempVar5;
			 }
			 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar6 != null)
			 {
				 stu[i].west = tempVar6;
			 }
			 String tempVar7 = ConsoleInput.scanfRead(" ");
			 if (tempVar7 != null)
			 {
				 stu[i].work = tempVar7;
			 }
		 }
		  i = 0;
		  for (i = 0;i < n;i++)
		  {
			  if (stu[i].ascore > 80 && stu[i].work >= 1)
			  {
			  stu[i].money = stu[i].money + 8000;
			  }
			  if (stu[i].ascore > 85 && stu[i].bscore > 80)
			  {
			  stu[i].money = stu[i].money + 4000;
			  }
			  if (stu[i].ascore > 90)
			  {
			  stu[i].money = stu[i].money + 2000;
			  }
			  if (stu[i].ascore > 85 && stu[i].west == 'Y')
			  {
			  stu[i].money = stu[i].money + 1000;
			  }
			  if (stu[i].bscore > 80 && stu[i].good == 'Y')
			  {
			  stu[i].money = stu[i].money + 850;
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
		  sum = sum + stu[i].money;
		  }
		  i = 0;
		  for (i = 0;i < n - 1;i++)
		  {
			 if (stu[i].money > max)
			 {
				  max = stu[i].money;
				  t = i;
			 }
		  }
		   System.out.printf("%s\n%d\n%d\n",stu[t].name,stu[t].money,sum);
	}

}


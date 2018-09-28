package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//	char name[20];
	//	int a;
	//	int b;
	//	char x;
	//	char g;
	//	int lun;
	//	int money;
	//}
	//stu[103];


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
		   stu[i].g = tempVar5;
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar6 != null)
	   {
		   stu[i].x = tempVar6;
	   }
	   String tempVar7 = ConsoleInput.scanfRead(" ");
	   if (tempVar7 != null)
	   {
		   stu[i].lun = tempVar7;
	   }
	   stu[i].money = 0;
	}

	for (i = 0;i < n;i++)
	{
	 if (stu[i].a > 80 && stu[i].lun > 0)
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
	 if (stu[i].a > 85 && stu[i].x == 'Y')
	 {
	 stu[i].money = stu[i].money + 1000;
	 }
	 if (stu[i].b > 80 && stu[i].g == 'Y')
	 {
	 stu[i].money = stu[i].money + 850;
	 }
	 sum = sum + stu[i].money;
	}
	for (j = 1;j < n;j++)
	{
		for (i = 0;i < n - j;i++)
		{
			if (stu[i].money < stu[i + 1].money)
			{
				stu[102] = stu[i];
				stu[i] = stu[i + 1];
				stu[i + 1] = stu[102];
			}
		}
	}



	   System.out.printf("%s\n",stu[0].name);

	   System.out.printf("%d\n",stu[0].money);
	   System.out.printf("%d\n",sum);
	}
}


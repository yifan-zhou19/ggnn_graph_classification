package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int yuanshi;
		int wusi;
		int chengji;
		int xibu;
		int banji;
		int sum = 0;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct st
	//	{
	//				   char name[23];
	//					int score;
	//					int essay;
	//					int pingyi;
	//					char area;
	//					char position;
	//					int money;
	//	}
	//	stu[103];
		st s = new st();
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
			 stu[i].score = tempVar3;
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 stu[i].pingyi = tempVar4;
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar5 != null)
		 {
			 stu[i].position = tempVar5;
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar6 != null)
		 {
			 stu[i].area = tempVar6;
		 }
		 String tempVar7 = ConsoleInput.scanfRead(" ");
		 if (tempVar7 != null)
		 {
			 stu[i].essay = tempVar7;
		 }
		}
			for (i = 0;i < n;i++)
			{
			yuanshi = 0;
			wusi = 0;
			chengji = 0;
			xibu = 0;
			banji = 0;
				if (stu[i].score > 80 && stu[i].essay > 0)
				{
					yuanshi = 8000;
				}
			   if (stu[i].score > 85 && stu[i].pingyi > 80)
			   {
				   wusi = 4000;
			   }
			   if (stu[i].score > 90)
			   {
				   chengji = 2000;
			   }
			   if (stu[i].score > 85 && stu[i].area == 'Y')
			   {
				  xibu = 1000;
			   }
			   if (stu[i].pingyi > 80 && stu[i].position == 'Y')
			   {
				   banji = 850;
			   }
			   stu[i].money = yuanshi + wusi + chengji + xibu + banji;
			}

			for (i = 0,sum = 0;i < n;i++)
			{
				sum = sum + stu[i].money;
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n - i;j++)
				{
					if (stu[i].money > stu[j].money)
					{
						s = stu[i];
						stu[i] = stu[j];
						stu[j] = s;
					}
				}
			}
		System.out.printf("%s\n%d\n%ld\n",stu[0].name,stu[0].money,sum);


	}

}


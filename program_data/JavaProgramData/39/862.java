package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int qimo;
	//		int banji;
	//		char xibu;
	//		char ganbu;
	//		int lunwen;
	//		int fee;
	//	}
	//	stu[102];
		int i;
		int sum = 0;
		int n;
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
				stu[i].qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].banji = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lunwen = tempVar7;
			}
		}
		for (i = 0;i < 102;i++)
		{
			stu[i].fee = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].qimo > 80 && stu[i].lunwen > 0)
			{
				stu[i].fee += 8000;
			}
			if (stu[i].qimo > 85 && stu[i].banji > 80)
			{
				stu[i].fee += 4000;
			}
			if (stu[i].qimo > 90)
			{
				stu[i].fee += 2000;
			}
			if (stu[i].qimo > 85 && stu[i].xibu == 'Y')
			{
				stu[i].fee += 1000;
			}
			if (stu[i].banji > 80 && stu[i].ganbu == 'Y')
			{
				stu[i].fee += 850;
			}
			sum += stu[i].fee;
		}
		max = stu[0].fee;
		for (i = 1;i < n;i++)
		{
			if (stu[i].fee > max)
			{
				max = stu[i].fee;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].fee == max)
			{
				System.out.printf("%s\n%d\n%d",stu[i].name,stu[i].fee,sum);
			break;
			}
		}
		return 0;
	}





}


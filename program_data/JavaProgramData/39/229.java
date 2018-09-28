package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[21];
	//		int qimo;
	//		int banji;
	//		char ganbu;
	//		char xibu;
	//		int lunwen;
	//		int zongjiangjin;
	//	}
	//	stu[100];
		stu temp = new stu();
		int n;
		int i;
		int j;
		int sum;
		int total = 0;
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
			sum = 0;
			if (stu[i].qimo > 80 && stu[i].lunwen >= 1)
			{
				sum = sum + 8000;
			}
			if (stu[i].qimo > 85 && stu[i].banji > 80)
			{
				sum = sum + 4000;
			}
			if (stu[i].qimo > 90)
			{
				sum = sum + 2000;
			}
			if (stu[i].qimo > 85 && stu[i].xibu == 'Y')
			{
				sum = sum + 1000;
			}
			if (stu[i].banji > 80 && stu[i].ganbu == 'Y')
			{
				sum = sum + 850;
			}
			stu[i].zongjiangjin = sum;
			total = total + sum;
		}
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (stu[i].zongjiangjin < stu[i + 1].zongjiangjin)
				{
					temp = stu[i];
					stu[i] = stu[i + 1];
					stu[i + 1] = temp;
				}
			}
		}
		System.out.printf("%s\n",stu[0].name);
		System.out.printf("%d\n",stu[0].zongjiangjin);
		System.out.printf("%d\n",total);
	}
}


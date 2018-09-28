package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int k = 0;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char name[21],ganbu,xibu;
	//		int x,y,z,money;
	//	}
	//	stu[100];

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
				stu[i].x = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].y = tempVar4;
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
				stu[i].z = tempVar7;
			}
			stu[i].money = 0;
			if (stu[i].x > 80 && stu[i].z > 0)
			{
				stu[i].money += 8000;
				sum += 8000;
			}
			if (stu[i].x > 85 && stu[i].y > 80)
			{
				stu[i].money += 4000;
				sum += 4000;
			}
			if (stu[i].x > 90)
			{
				stu[i].money += 2000;
				sum += 2000;
			}
			if (stu[i].x > 85 && stu[i].xibu == 'Y')
			{
				stu[i].money += 1000;
				sum += 1000;
			}
			if (stu[i].y > 80 && stu[i].ganbu == 'Y')
			{
				stu[i].money += 850;
				sum += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].money > k)
			{
				k = stu[i].money;
				t = i;
			}
		}
		System.out.printf("%s\n",stu[t].name);
		System.out.printf("%d\n",stu[t].money);
		System.out.printf("%d",sum);
		return 0;
	}


}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu1
	//	{
	//		char name[30];
	//		int scor;
	//		int grad;
	//		char as;
	//		char xi;
	//		int num;
	//		int reward;
	//	}
	//	stu[100], temp;
		int n;
		int i;
		int re = 0;
			char hhh;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].scor = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].grad = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				hhh = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				stu[i].as = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(null, 1);
			if (tempVar7 != null)
			{
				stu[i].xi = tempVar7;
			}
			String tempVar8 = ConsoleInput.scanfRead(null, 1);
			if (tempVar8 != null)
			{
				stu[i].xi = tempVar8;
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				stu[i].num = tempVar9;
			}
			stu[i].reward = 0;
			if (stu[i].scor > 80 && stu[i].num >= 1)
			{
				stu[i].reward += 8000;
			}
			if (stu[i].scor > 85 && stu[i].grad > 80)
			{
				stu[i].reward += 4000;
			}
			if (stu[i].scor > 90)
			{
				stu[i].reward += 2000;
			}
			if (stu[i].scor > 85 && stu[i].xi == 'Y')
			{
				stu[i].reward += 1000;
			}
			if (stu[i].grad > 80 && stu[i].as == 'Y')
			{
				stu[i].reward += 850;
			}
		}
		temp = stu[0];
		for (i = 0;i < n;i++)
		{
			if (stu[i].reward > temp.reward)
			{
				temp = stu[i];
			}
		}
		for (i = 0;i < n;i++)
		{
				re += stu[i].reward;
		}

		System.out.printf("%s\n%d\n%d", temp.name, temp.reward, re);
		return 0;
	}

}


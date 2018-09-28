package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char nam[50];
	//		int ave;
	//		int ping;
	//		char gan;
	//		char xi;
	//		int wen;
	//		int total[5];
	//
	//		int all;
	//	}
	//	stu[100];
		int num;
		int i;
		int j;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].nam = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].ave = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].ping = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gan = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xi = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].wen = tempVar7;
			}
	stu[i].all = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	memset(stu[i].total, 0, sizeof(stu[i].total));
		}
		for (i = 0;i < num;i++)
		{

			if (stu[i].ave > 80 && stu[i].wen >= 1)
			{
				stu[i].total[0] = 8000;
			}
					if (stu[i].ave > 85 && stu[i].ping > 80)
					{
				stu[i].total[1] = 4000;
					}

			if (stu[i].ave > 90)
			{
				stu[i].total[2] = 2000;
			}
			if (stu[i].ave > 85 && stu[i].xi == 'Y')
			{
							stu[i].total[3] = 1000;
			}
			if (stu[i].ping > 80 && stu[i].gan == 'Y')
			{
					stu[i].total[4] = 850;
			}
		}
		for (i = 0;i < num;i++)
		{
			for (j = 0;j < 5;j++)
			{
				stu[i].all += stu[i].total[j]; //????????????.
			}
		}

		int max = 0;
		for (i = 0;i < num;i++)
		{
			if (stu[i].all > max)
			{
				max = stu[i].all; //????????,????????
				j = i;
			}
		}
		int whole = 0;
		for (i = 0;i < num;i++)
		{
			whole += stu[i].all;
		}
		System.out.printf("%s\n%d\n%d",stu[j].nam,max,whole);

		return 0;
	}
}


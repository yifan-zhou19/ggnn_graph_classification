package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char name[20];
	//		int f;
	//		int ping;
	//		char gan;
	//		char xi;
	//		int lun;
	//		int jiang;
	//	}
	//	stu[100];
		{
			int n;
			int i;
			int t;
			int s = 0;
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
					stu[i].f = tempVar3;
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
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
				String tempVar7 = ConsoleInput.scanfRead(" ");
				if (tempVar7 != null)
				{
					stu[i].lun = tempVar7;
				}
				stu[i].jiang = 0;
				if (stu[i].f > 80 && stu[i].lun > 0)
				{
					stu[i].jiang = stu[i].jiang + 8000;
				}
				if (stu[i].f > 85 && stu[i].ping > 80)
				{
					stu[i].jiang = stu[i].jiang + 4000;
				}
				if (stu[i].f > 90)
				{
					stu[i].jiang = stu[i].jiang + 2000;
				}
				if (stu[i].f > 85 && stu[i].xi == 'Y')
				{
					stu[i].jiang = stu[i].jiang + 1000;
				}
				if (stu[i].ping > 80 && stu[i].gan == 'Y')
				{
					stu[i].jiang = stu[i].jiang + 850;
				}
			}
			for (i = 0,t = stu[0].jiang;i < n - 1;i++)
			{
				s = s + stu[i].jiang;
				if (stu[i + 1].jiang > t)
				{
					t = stu[i + 1].jiang;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (stu[i].jiang == t)
				{
					System.out.printf("%s\n%d\n%d\n",stu[i].name,t,s + stu[n - 1].jiang);
					break;
				}
			}
	}
	}
}


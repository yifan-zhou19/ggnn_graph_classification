package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char xing[20];
	//		int qi;
	//		int ban;
	//		char gan;
	//		char xi;
	//		int lun;
	//		int qian;
	//	}
	//	stu[100],mid;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (b = 0;b < a;b++)
		{
			stu[b].qian = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[b].xing = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[b].qi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[b].ban = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[b].gan = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[b].xi = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[b].lun = tempVar7;
			}
			if (stu[b].qi > 80 && stu[b].lun >= 1)
			{
				stu[b].qian = stu[b].qian + 8000;
			}
			if (stu[b].qi > 85 && stu[b].ban > 80)
			{
				stu[b].qian = stu[b].qian + 4000;
			}
			if (stu[b].qi > 90)
			{
				stu[b].qian = stu[b].qian + 2000;
			}
			if (stu[b].qi > 85 && stu[b].xi == 'Y')
			{
				stu[b].qian = stu[b].qian + 1000;
			}
			if (stu[b].ban > 80 && stu[b].gan == 'Y')
			{
				stu[b].qian = stu[b].qian + 850;
			}
		}
		for (b = 0;b < a - 1;b++)
		{
			for (c = 0;c < a - b - 1;c++)
			{
				if (stu[c].qian < stu[c + 1].qian)
				{
					mid = stu[c];
					stu[c] = stu[c + 1];
					stu[c + 1] = mid;
				}
			}
		}
		c = 0;
		for (b = 0;b < a;b++)
		{
			c = c + stu[b].qian;
		}
		System.out.printf("%s\n%d\n%d",stu[0].xing,stu[0].qian,c);
	}


}


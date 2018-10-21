package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct std
	//	{
	//		char name[20];
	//		int qm,bp,lw,jj;
	//		char gb,xb;
	//	}
	//	stu[200];
		int n;
		int i;
		int s = 0;
		int max;
		String mn = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			stu[i].jj = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].qm = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].bp = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gb = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xb = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lw = tempVar7;
			}
			if (stu[i].qm > 80 && stu[i].lw > 0)
			{
				stu[i].jj += 8000;
			}
			if (stu[i].qm > 85 && stu[i].bp > 80)
			{
				stu[i].jj += 4000;
			}
			if (stu[i].qm > 90)
			{
				stu[i].jj += 2000;
			}
			if (stu[i].qm > 85 && stu[i].xb == 'Y')
			{
				stu[i].jj += 1000;
			}
			if (stu[i].bp > 80 && stu[i].gb == 'Y')
			{
				stu[i].jj += 850;
			}
			s = s + stu[i].jj;
		}
		max = stu[0].jj;
		mn = stu[0].name;
		for (i = 0;i < n;i++)
		{
			if (max < stu[i].jj)
			{
				max = stu[i].jj;
				mn = stu[i].name;
			}
		}
		System.out.printf("%s\n%d\n%d",mn,max,s);
		return 0;
	}
}


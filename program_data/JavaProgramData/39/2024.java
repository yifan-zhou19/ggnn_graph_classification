package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int total = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char s[20];
	//		int end;
	//		int class_marks;
	//		char c1;
	//		char c2;
	//		int com_num;
	//		int sum;
	//	}
	//	stu[100],max;
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
				stu[i].s = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(stu[i].end) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(stu[i].class_marks) = tempVar4;
			}
			System.in.read();
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				(stu[i].c1) = tempVar5;
			}
			System.in.read();
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				(stu[i].c2) = tempVar6;
			}
			System.in.read();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				(stu[i].com_num) = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].sum = 0;
			if (stu[i].end > 80 && stu[i].com_num >= 1)
			{
				stu[i].sum = 8000 + stu[i].sum;
			}
			if (stu[i].end > 85 && stu[i].class_marks > 80)
			{
				stu[i].sum = 4000 + stu[i].sum;
			}
			if (stu[i].end > 90)
			{
				stu[i].sum = 2000 + stu[i].sum;
			}
			if (stu[i].end > 85 && stu[i].c2 == 'Y')
			{
				stu[i].sum = 1000 + stu[i].sum;
			}
			if (stu[i].class_marks > 80 && stu[i].c1 == 'Y')
			{
				stu[i].sum = 850 + stu[i].sum;
			}
		}
		for (i = 0;i < n;i++)
		{
			total = stu[i].sum + total;
		}
		max.sum = 0;
		for (i = 0;i < n;i++)
		{
			if (max.sum < stu[i].sum)
			{
				max = stu[i];
			}
		}
		System.out.printf("%s\n%d\n%d",max.s,max.sum,total);
		return 0;
	}

}


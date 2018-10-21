package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//	 int qimo;
	//	 int banyi;
	//	 char ganbu;
	//	 char xibu;
	//	 int paper;
	//	}
	//	stu[100];
		int n;
		int i;
		int max;
		int p;
		int sum = 0;
		int[] sch = {8000, 4000, 2000, 1000, 850};
		int[] a = new int[100];
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
				stu[i].banyi = tempVar4;
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
				stu[i].paper = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].qimo > 80 && stu[i].paper >= 1)
			{
				a[i] += sch[0];
			}
			if (stu[i].qimo > 85 && stu[i].banyi > 80)
			{
				a[i] += sch[1];
			}
			if (stu[i].qimo > 90)
			{
				a[i] += sch[2];
			}
			if (stu[i].qimo > 85 && stu[i].xibu == 'Y')
			{
				a[i] += sch[3];
			}
			if (stu[i].banyi > 80 && stu[i].ganbu == 'Y')
			{
				a[i] += sch[4];
			}
		}
		max = a[0];
		p = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				p = i;
			}
			sum += a[i];
		}
		System.out.printf("%s\n%d\n%d",stu[p].name,max,sum);
	}


}


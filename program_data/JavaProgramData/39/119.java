package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int N;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//	char name[20];
	//	int qm;
	//	int py;
	//	char gb;
	//	char w;
	//	int lw;
	//	int jj;
	//}
	//stu[100];
	int i;
	for (i = 0;i < N;i++)
	{

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
			stu[i].py = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			stu[i].gb = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			stu[i].w = tempVar6;
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			stu[i].lw = tempVar7;
		}
		stu[i].jj = 0;
		if (stu[i].qm > 90)
		{
			stu[i].jj += 2000;
		}
		if (stu[i].qm > 80 && stu[i].lw >= 1)
		{
			stu[i].jj += 8000;
		}
		if (stu[i].qm > 85 && stu[i].w == 'Y')
		{
			stu[i].jj += 1000;
		}
		if (stu[i].qm > 85 && stu[i].py > 80)
		{
			stu[i].jj += 4000;
		}
		if (stu[i].py > 80 && stu[i].gb == 'Y')
		{
			stu[i].jj += 850;
		}
	}
	int trans1;
	String trans2 = new String(new char[20]);
	int total = 0;
	for (i = 0;i < N;i++)
	{
		total += stu[i].jj;
	}
	for (i = 0;i < N - 1;i++)
	{
		if (stu[i].jj >= stu[i + 1].jj)
		{
			trans1 = stu[i].jj;
			trans2 = stu[i].name;
			stu[i].name = stu[i + 1].name;
			stu[i].jj = stu[i + 1].jj;
			stu[i + 1].name = trans2;
			stu[i + 1].jj = trans1;
		}
	}

	 System.out.printf("%s\n%d\n%d\n",stu[N - 1].name,stu[N - 1].jj,total);
	}
}


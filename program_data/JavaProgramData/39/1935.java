package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	 struct student
	//	 {
	//		 char name[20];
	//		 int a,b,lunwen;
	//		 char ganbu,xibu;
	//	 int jiangjin;
	//	 }
	//	 stu[100];
		 int n;
		 int i;
		 int t = 0;
		 int sum = 0;
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
			stu[i].a = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			stu[i].b = tempVar4;
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
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			stu[i].lunwen = tempVar7;
		}
	}


	for (i = 0;i < n;i++)
	{
		stu[i].jiangjin = 0;


		if (stu[i].a > 80 && stu[i].lunwen > 0)
		{
			stu[i].jiangjin = stu[i].jiangjin + 8000;
		}
		if (stu[i].a > 85 && stu[i].b > 80)
		{
			stu[i].jiangjin = stu[i].jiangjin + 4000;
		}
		if (stu[i].a > 90)
		{
			stu[i].jiangjin = stu[i].jiangjin + 2000;
		}
		if (stu[i].a > 85 && stu[i].xibu == 'Y')
		{
			stu[i].jiangjin = stu[i].jiangjin + 1000;
		}
		if (stu[i].b > 80 && stu[i].ganbu == 'Y')
		{
			stu[i].jiangjin = stu[i].jiangjin + 850;
		}
	}
	for (i = 0;i < n;i++)
	{
		if (stu[i].jiangjin > stu[t].jiangjin)
		{
			t = i;
		}
	}
	for (i = 0;i < n;i++)
	{
		sum = sum + stu[i].jiangjin;
	}
	System.out.printf("%s\n%d\n%ld",stu[t].name,stu[t].jiangjin,sum);


				return 0;
	}
}


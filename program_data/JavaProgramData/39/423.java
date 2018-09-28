package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct person
	//{
	//	char name[20];
	//int pro1;
	//int pro2;
	//char c1;
	//char c2;
	//int papers;
	//int money;
	//} //stu[1]={"aA",87,82,'Y','N',0,0}//"bB",88,78,'N','Y',1,0,"cC",92,88,'N','N',0,0,"dD",83,87,'Y','N',1,0,"bb",92,80,'Y','Y',1,0}
	//;

	int i;
	int N;
	int max = 0;
	int all = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	person[] stu = tangible.Arrays.initializeWithDefaultpersonInstances(N);
	for (i = 0;i < N;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		stu[i].name = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		stu[i].pro1 = tempVar3;
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		stu[i].pro2 = tempVar4;
	}
	String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar5 != null)
	{
		stu[i].c1 = tempVar5;
	}
	String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar6 != null)
	{
		stu[i].c2 = tempVar6;
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		stu[i].papers = tempVar7;
	}
	stu[i].money = 0;
	if (stu[i].papers >= 1 && stu[i].pro1 > 80)
	{
		stu[i].money = stu[i].money + 8000;
	}
	if (stu[i].pro1 > 85 && stu[i].pro2 > 80)
	{
		stu[i].money = stu[i].money + 4000;
	}
	if (stu[i].pro1 > 90)
	{
		stu[i].money = stu[i].money + 2000;
	}
	if (stu[i].pro1 > 85 && stu[i].c2 == 'Y')
	{
		stu[i].money = stu[i].money + 1000;
	}
	if (stu[i].pro2 > 80 && stu[i].c1 == 'Y')
	{
		stu[i].money = stu[i].money + 850;
	}
	if (max < stu[i].money)
	{
		max = stu[i].money;
	}
	all = all + stu[i].money;
	}
	for (i = 0;i < N;i++)
	{
		if (stu[i].money == max)
		{
		System.out.printf("%s\n%d\n%d",stu[i].name,stu[i].money,all);
	break;
		}
	}
	return (0);
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//int num;
	//int yw;
	//int sx;
	//int all;
	//}
	//student[4]={0,0,0,0};
	student temp = new student(0,0,0,0);
	int i;
	int l;
	int n;
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
		student[3].num = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		student[3].yw = tempVar3;
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		student[3].sx = tempVar4;
	}
	student[3].all = student[3].yw + student[3].sx;

	if (student[2].all < student[3].all)
	{
	temp = student[2];
	student[2] = student[3];
	student[3] = temp;
	}
	if (student[1].all < student[2].all)
	{
	temp = student[1];
	student[1] = student[2];
	student[2] = temp;
	}
	if (student[0].all < student[1].all)
	{
	temp = student[0];
	student[0] = student[1];
	student[1] = temp;
	}
	}
	for (l = 0;l < 3;l++)
	{
	System.out.printf("%d %d\n",student[l].num,student[l].all);
	}
	}
}


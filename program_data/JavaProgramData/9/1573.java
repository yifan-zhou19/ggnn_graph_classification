package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//	char as[10];
	//	int ag;
	//};
	student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	student[] st = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	student temp = new student();
	int n;
	int i;
	int j;
	int k;
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
		stu[i].as = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		stu[i].ag = tempVar3;
	}
	}
	j = 0;
	for (i = 0;i < n;i++)
	{
		if (stu[i].ag > 59)
		{
			st[j] = stu[i];
			stu[i].ag = 0;
			j++;
		}
	}
	for (k = 1;k < j;k++)
	{
		for (i = 0;i < j - k;i++)
		{
			if (st[i].ag < st[i + 1].ag)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=st[i];
				temp.copyFrom(st[i]);
				st[i] = st[i + 1];
				st[i + 1] = temp;
			}
		}
	}
	for (i = 0;i < j;i++)
	{
	System.out.printf("\n%s",st[i].as);
	}
	for (i = 0;i < n;i++)
	{
		if (stu[i].ag != 0)
		{
		System.out.printf("\n%s",stu[i].as);
		}
	}
	return 0;
	}





}


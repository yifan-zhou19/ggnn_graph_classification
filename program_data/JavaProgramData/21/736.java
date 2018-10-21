package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//{
	//	double a;
	//	double b;
	//};
	student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(300);
	student temp = new student();
	int n;
	int i;
	int j;
	int t = 1;
	double s = 0.0;
	double max = 0.0;
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
			stu[i].a = tempVar2;
		}
		s += stu[i].a;
	}
	s = s / n;
	for (i = 0;i < n;i++)
	{
		stu[i].b = stu[i].a - s;
		if (stu[i].b < 0)
		{
			stu[i].b = -stu[i].b;
		}
	}
	for (j = 1;j < n;j++)
	{
		for (i = 0;i < n - j;i++)
		{
			if (stu[i].a > stu[i + 1].a)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i];
				temp.copyFrom(stu[i]);
				stu[i] = stu[i + 1];
				stu[i + 1] = temp;
			}
		}
	}
	for (i = 0;i < n;i++)
	{
	if (stu[i].b > max)
	{
	max = stu[i].b;
	}
	}
	for (i = 0;i < n;i++)
	{
		if (stu[i].b == max)
		{
			if (t == 1)
			{
			System.out.printf("%.0lf",stu[i].a);
			t = 2;
			}
			else
			{
				System.out.printf(",%.0lf",stu[i].a);
			}
		}
	}
		return 0;
	}


}


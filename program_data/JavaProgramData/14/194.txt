package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//	{
	//		int num;
	//		int yuwen;
	//		int math;
	//		int zong;
	//	};
	student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	student * p = new student();
	student p1;
	student p2;
	student p3;
	student p4;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (p = stu;p < stu + n;p++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.yuwen = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.math = tempVar4;
			}
	}
	for (p = stu;p < stu + n;p++)
	{
			(p.zong) = (p.yuwen) + (p.math);
	}
	p1 = stu[0];
	p2 = stu[1];
	p3 = stu[2];
	p4 = p1;
	if (p2.zong > p1.zong)
	{
		p4 = p1;
		p1 = p2;
		p2 = p4;
	}
	else
	{
	p1 = p1;
	}
	if (p3.zong > p1.zong)
	{
		p4 = p1;
		p1 = p3;
		p3 = p4;
	}
	else
	{
	p1 = p1;
	}
	if (p3.zong > p2.zong)
	{
	p4 = p2;
	p2 = p3;
	p3 = p4;
	}
	else
	{
	p1 = p1;
	}

	for (p = stu + 3;p < stu + n;p++)
	{
	if ((p.zong) > (p1.zong))
	{
		p3 = p2;
		p2 = p1;
		p1 = p;
	}
	else if (p.zong > p2.zong)
	{
		p3 = p2;
		p2 = p;
	}
	else if (p.zong > p3.zong)
	{
	p3 = p;
	}
	else
	{
	p1 = p1;
	}
	}
	System.out.printf("%d %d\n",p1.num,p1.zong);
	System.out.printf("%d %d\n",p2.num,p2.zong);
	System.out.printf("%d %d",p3.num,p3.zong);
	return 0;
	}
}


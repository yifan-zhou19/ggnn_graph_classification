public class student
{
	public String name = new String(new char[20]);
	public int a1;
	public int a2;
	public char w;
	public char m;
	public int e;
	public int sch;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		student p = new student();
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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].a1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].a2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].m = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].w = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].e = Integer.parseInt(tempVar7);
			}
			stu[i].sch = 0;
			if (stu[i].a1 > 80 && stu[i].e > 0)
			{
				stu[i].sch += 8000;
			}
			if (stu[i].a1 > 85 && stu[i].a2 > 80)
			{
				stu[i].sch += 4000;
			}
			if (stu[i].a1 > 90)
			{
				stu[i].sch += 2000;
			}
			if (stu[i].a1 > 85 && stu[i].w == 'Y')
			{
				stu[i].sch += 1000;
			}
			if (stu[i].a2 > 80 && stu[i].m == 'Y')
			{
				stu[i].sch += 850;
			}
			sum += stu[i].sch;
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=stu[0];
		p.copyFrom(stu[0]);
		for (i = 0;i < n;i++)
		{
		if (stu[i].sch > p.sch)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=stu[i];
			p.copyFrom(stu[i]);
		}
		}
		System.out.printf("%s\n%d\n%d",p.name,p.sch,sum);
	}


}


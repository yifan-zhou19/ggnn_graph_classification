public class student
{
	public String name = new String(new char[30]);
	public int exam;
	public int result;
	public String gan = new String(new char[2]);
	public String xibu = new String(new char[2]);
	public int lecture;
	public int bonus;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		student Max = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] stu;
		stu = tangible.Arrays.initializeWithDefaultstudentInstances(n);
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
				stu[i].exam = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].result = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				stu[i].gan = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lecture = Integer.parseInt(tempVar7);
			}

		}
		for (i = 0;i < n;i++)
		{
			stu[i].bonus = 0;
			if (((stu[i].exam) > 80) && ((stu[i].lecture) > 0))
			{
				stu[i].bonus += 8000;
			}
			if (((stu[i].exam) > 85) && ((stu[i].result) > 80))
			{
				stu[i].bonus += 4000;
			}
			if ((stu[i].exam) > 90)
			{
				stu[i].bonus += 2000;
			}
			if (((stu[i].exam) > 85) && ((stu[i].xibu.charAt(0)) == 'Y'))
			{
				stu[i].bonus += 1000;
			}
			if (((stu[i].result) > 80) && ((stu[i].gan.charAt(0)) == 'Y'))
			{
				stu[i].bonus += 850;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: Max=stu[0];
		Max.copyFrom(stu[0]);
		for (i = 1;i < n;i++)
		{
			if (stu[i].bonus > Max.bonus)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: Max=stu[i];
				Max.copyFrom(stu[i]);
			}
		}
		System.out.printf("%s\n",Max.name);
		System.out.printf("%d\n",Max.bonus);
		for (i = 0;i < n;i++)
		{
			sum += stu[i].bonus;
		}
		System.out.printf("%d\n",sum);
		stu = null;
	}


}


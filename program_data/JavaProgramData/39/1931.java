public class student
	{
		public String name = new String(new char[21]);
		public int gpa;
		public int c_gpa;
		public char official;
		public char west;
		public int paper;
	}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int process = struct student * p;

		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
		student P = null;
		int i = 0;
		int n;
		int TOTAL = 0;
		int max = 0;
		int MAX = 0;


//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=stu;
		p.copyFrom(stu);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.gpa = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.c_gpa = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.official = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.paper = Integer.parseInt(tempVar7);
			}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: max=process(p++);
			max = process(new student(p++));
			if (max > MAX)
			{
				MAX = max;
				P = p - 1;
			}
			TOTAL += max;
		}

		System.out.printf("%s\n%d\n%d", P.name,MAX,TOTAL);

	}

	public static int process(student p)
	{
		int prize = 0;
		if (p.gpa > 80 && p.paper >= 1)
		{
			prize += 8000;
		}
		if (p.gpa > 85 && p.c_gpa > 80)
		{
			prize += 4000;
		}
		if (p.gpa > 90)
		{
			prize += 2000;
		}
		if (p.gpa > 85 && p.west == 'Y')
		{
			prize += 1000;
		}
		if (p.c_gpa > 80 && p.official == 'Y')
		{
			prize += 850;
		}
		return prize;
	}

}


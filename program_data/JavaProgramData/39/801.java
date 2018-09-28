public class Student
{
	public String name = new String(new char[20]);
	public int marks1;
	public int marks2;
	public char a;
	public char b;
	public int paper;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static Student[] person = tangible.Arrays.initializeWithDefaultStudentInstances(100);
	public static Student best = new Student("\0",0,0,'\0','\0',0);
	public static int Main()
	{
		int n;
		int i;
		int total = 0;
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
				person[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				person[i].marks1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				person[i].marks2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				person[i].a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				person[i].b = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				person[i].paper = Integer.parseInt(tempVar7);
			}
			person[i].total = 0;
			if (person[i].marks1 > 80 && person[i].paper > 0)
			{
				person[i].total = person[i].total + 8000;
			}
			if (person[i].marks1 > 85 && person[i].marks2 > 80)
			{
				person[i].total = person[i].total + 4000;
			}
			if (person[i].marks1 > 90)
			{
				person[i].total = person[i].total + 2000;
			}
			if (person[i].marks1 > 85 && person[i].b == 'Y')
			{
				person[i].total = person[i].total + 1000;
			}
			if (person[i].marks2 > 80 && person[i].a == 'Y')
			{
				person[i].total = person[i].total + 850;
			}
			if (person[i].total > best.total)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: best=person[i];
				best.copyFrom(person[i]);
			}
			total = total + person[i].total;
		}
		System.out.printf("%s\n%d\n%d",best.name,best.total,total);
	}

}


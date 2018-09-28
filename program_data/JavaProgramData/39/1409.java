public class student
{
	public String name = new String(new char[20]);
	public int mark1;
	public int mark2;
	public char judge1;
	public char judge2;
	public int paper;
	public double total;
}

package <missing>;

public class GlobalMembers
{
	public static student stu = new student();
	public static double max = 0;

	public static void Main()
	{
		void compare(struct student temp);
		student stu1 = new student();
		int n;
		int i;
		stu1.total = 0;
		stu.total = 0;
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
				stu1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu1.mark1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu1.mark2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu1.judge1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu1.judge2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu1.paper = Integer.parseInt(tempVar7);
			}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: compare(stu1);
			compare(new student(stu1));
			//printf("%s\n%d\n%d\n%c\n%c\n%d\n",stu1.name,stu1.mark1,stu1.mark2,stu1.judge1,stu1.judge2,stu1.paper);
		}
		System.out.printf("%s\n%.0lf\n%.0lf\n",stu.name,stu.total,max);
	}
	public static void compare(student temp)
	{
		if (temp.mark1 > 80 && temp.paper > 0)
		{
			temp.total += 8000; //????????8000?
		}
		if (temp.mark1 > 85 && temp.mark2 > 80)
		{
			temp.total += 4000; //????????4000?
		}
		if (temp.mark1 > 90)
		{
			temp.total += 2000; //????????2000?
		}
		if (temp.mark1 > 85 && temp.judge2 == 'Y')
		{
			temp.total += 1000; //????????1000?
		}
		if (temp.mark2 > 80 && temp.judge1 == 'Y')
		{
			temp.total += 850; //????????850?
		}
		max += temp.total;
		if (temp.total > stu.total)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: stu=temp;
			stu.copyFrom(temp);
		}
	}
}


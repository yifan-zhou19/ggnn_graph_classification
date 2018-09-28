public class student
{
	public String name = new String(new char[20]);
	public int qimo;
	public int banji;
	public char ganbu;
	public char xibu;
	public int lunwen;
	public int qian;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

	public static void yunsuan(student a)
	{
		int sum = 0;
		if (a.qimo > 80 && a.lunwen >= 1)
		{
			sum += 8000;
		}
		if (a.qimo > 85 && a.banji > 80)
		{
			sum += 4000;
		}
		if (a.qimo > 90)
		{
			sum += 2000;
		}
		if (a.qimo > 85 && a.xibu == 'Y')
		{
			sum += 1000;
		}
		if (a.ganbu == 'Y' && a.banji > 80)
		{
			sum += 850;
		}
		a.qian = sum;
	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'pt', so pointers on this parameter are left unchanged:
	public static int max(student * pt, int n)
	{
		int max = 0;
		int i;
		int hz;
		for (i = 0;i < n;i++)
		{
			if (pt.qian > max)
			{
				max = pt.qian;
			hz = i;
			}
			pt++;
		}

		return hz;
	}


	public static int Main()
	{
		int n;
		int i;
		int m;
		int sum = 0;
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
				stu[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].banji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lunwen = Integer.parseInt(tempVar7);
			}
			yunsuan(stu[i]);
			sum += stu[i].qian;
		}

		m = max(stu, n);
		System.out.printf("%s\n%d\n%ld\n", stu[m].name,stu[m].qian, sum);
		return 0;
	}



}


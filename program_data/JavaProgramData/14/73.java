public class student
{
	public int id;
	public int chinese;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		student[] max =
		{
			new student(0, 0, 0, 0),
			new student(0, 0, 0, 0),
			new student(0, 0, 0, 0)
		};
		int n;
		int i;
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
				stu[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			stu[i].total = stu[i].chinese + stu[i].math;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].total > max[1].total)
			{
				max[1] = stu[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].total > max[2].total && stu[i].total <= max[1].total != 0 && stu[i].id != max[1].id)
			{
				max[2] = stu[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].total > max[3].total && stu[i].total <= max[2].total != 0 && stu[i].id != max[2].id && stu[i].id != max[1].id)
			{
				max[3] = stu[i];
			}
		}
		for (i = 1;i < 4;i++)
		{
			System.out.printf("%d %d\n",max[i].id,max[i].total);
		}
		return 0;
	}
}


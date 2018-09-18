public class Student
{
		public int no;
		public int chinese;
		public int math;
		public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100000);
		Student t = new Student();
		int n;
		int i;
		int j;
		int max;
		int order;
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
				stu[i].no = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			stu[i].total = stu[i].chinese + stu[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			max = stu[i].total;
			order = i;
			for (j = i + 1;j < n;j++)
			{
				if (stu[j].total > max)
				{
					max = stu[j].total;
					order = j;
				}
			}
			if (order != i)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=stu[i];
				t.copyFrom(stu[i]);
				stu[i] = stu[order];
				stu[order] = t;
			}
			System.out.printf("%d %d\n",stu[i].no,stu[i].total);
		}
		return 0;
	}
}


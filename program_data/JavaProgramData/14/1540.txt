public class student
{
	public int num;
	public int chinese;
	public int math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		student stud = new student();
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
				stu[i].num = Integer.parseInt(tempVar2);
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
			stu[i].sum = stu[i].chinese + stu[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (stu[i].sum < stu[j].sum)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: stud=stu[i];
					stud.copyFrom(stu[i]);
					stu[i] = stu[j];
					stu[j] = stud;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].num,stu[i].sum);
		}
	}

}


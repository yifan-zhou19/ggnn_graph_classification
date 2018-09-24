public class student
{
	public int No;
	public int chinese;
	public int math;
	public int all;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(STUDENT_NUM);
	public static student temp = new student();

	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int k;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].No = Integer.parseInt(tempVar2);
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
			stu[i].all = stu[i].chinese + stu[i].math;
		}
		for (k = 1;k < 4;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (stu[i].all >= stu[i + 1].all)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i+1];
					temp.copyFrom(stu[i + 1]);
					stu[i + 1] = stu[i];
					stu[i] = temp;
				}
			}
		}
		for (i = n - 1;i > n - 4;i--)
		{
			System.out.printf("%d %d\n",stu[i].No,stu[i].all);
		}
	}
}


public class student
{
	public int id;
	public int china;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(M);
	public static student temp = new student();
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].china = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			stu[i].total = stu[i].china + stu[i].math;
		}
		for (i = 0;i < 3;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i];
			temp.copyFrom(stu[i]);
			count = i;
			for (j = i + 1;j < n;j++)
			{
				if (stu[j].total > temp.total)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[j];
					temp.copyFrom(stu[j]);
					count = j;
				}
			}
			stu[count] = stu[i];
			stu[i] = temp;
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].id,stu[i].total);
		}
		return 0;
	}
}


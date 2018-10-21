public class student
{
	public int num;
	public int yuwen;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(4);
		student temp = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 3;i++)
		{
		stu[i].total = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[3].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[3].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[3].math = Integer.parseInt(tempVar4);
			}
			stu[3].total = stu[3].yuwen + stu[3].math;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[3];
			temp.copyFrom(stu[3]);
			for (j = 2;j >= 0;j--)
			{
			if (temp.total > stu[j].total)
			{
				stu[j + 1] = stu[j];
				stu[j] = temp;
			}
			else
			{
				stu[j + 1] = temp;
				break;
			}
			}
		}
		for (i = 0;i < 3;i++)
		{
		System.out.printf("%d %d\n",stu[i].num,stu[i].total);
		}
		return 0;
	}
}


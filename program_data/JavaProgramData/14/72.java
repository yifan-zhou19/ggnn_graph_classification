public class student
{
	public int num;
	public int score1;
	public int score2;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static student max = new student();
	public static student secondmax = new student();
	public static student thirdmax = new student();
	public static int Main()
	{
		max.sum = secondmax.sum = thirdmax.sum = 0;
		int i;
		int n;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].score2 = Integer.parseInt(tempVar4);
			}
			stu[i].sum = stu[i].score1 + stu[i].score2;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum > max.sum)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max=stu[i];
				max.copyFrom(stu[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum < max.sum && stu[i].sum> secondmax.sum)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: secondmax=stu[i];
				secondmax.copyFrom(stu[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum == max.sum && stu[i].num != max.num)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: secondmax=stu[i];
				secondmax.copyFrom(stu[i]);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum < secondmax.sum && stu[i].sum> thirdmax.sum)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: thirdmax=stu[i];
				thirdmax.copyFrom(stu[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum == secondmax.sum && stu[i].num != max.num && stu[i].num != secondmax.num)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: thirdmax=stu[i];
				thirdmax.copyFrom(stu[i]);
				break;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d",max.num,max.sum,secondmax.num,secondmax.sum,thirdmax.num,thirdmax.sum);
		return 0;
	}
}


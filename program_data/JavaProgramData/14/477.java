public class student
{
	public int num;
	public int Chinese;
	public int Maths;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		student tempt = new student();
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
				stu[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].Chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].Maths = Integer.parseInt(tempVar4);
			}
			stu[i].total = stu[i].Chinese + stu[i].Maths;
		}
		if (stu[2].total > stu[1].total)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tempt=stu[1];
			tempt.copyFrom(stu[1]);
			stu[1] = stu[2];
			stu[2] = tempt;
		}
		if (stu[1].total > stu[0].total)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tempt=stu[0];
			tempt.copyFrom(stu[0]);
			stu[0] = stu[1];
			stu[1] = tempt;
		}
		if (stu[2].total > stu[1].total)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tempt=stu[1];
			tempt.copyFrom(stu[1]);
			stu[1] = stu[2];
			stu[2] = tempt;
		}
		for (i = 3;i < n;i++)
		{
			if (stu[i].total > stu[2].total)
			{
				stu[2] = stu[i];
				if (stu[2].total > stu[1].total)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tempt=stu[1];
					tempt.copyFrom(stu[1]);
					stu[1] = stu[2];
					stu[2] = tempt;
					if (stu[1].total > stu[0].total)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tempt=stu[0];
						tempt.copyFrom(stu[0]);
						stu[0] = stu[1];
						stu[1] = tempt;
					}
				}
			}
		}
		System.out.printf("%d %d\n",stu[0].num,stu[0].total);
		System.out.printf("%d %d\n",stu[1].num,stu[1].total);
		System.out.printf("%d %d\n",stu[2].num,stu[2].total);
	}
}


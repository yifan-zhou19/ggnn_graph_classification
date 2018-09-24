// ????????.cpp : ??????????????
//


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
		int number;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= number;++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].id = Integer.parseInt(tempVar2);
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
		for (int i = 1;i <= 3;++i)
		{
			for (int j = i + 1;j <= number;++j)
			{
				if (stu[i].total < stu[j].total)
				{
					student temp = new student();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i];
					temp.copyFrom(stu[i]);
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}
			System.out.printf("%d %d\n",stu[i].id,stu[i].total);
		}
		return 0;
	}

}


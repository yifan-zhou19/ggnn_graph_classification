public class student
{
	public int id;
	public int chinese;
	public int math;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);

	public static void bubble(student[] stu, int n)
	{
		int pass;
		int i;
		student temp = new student();

		for (pass = n - 1;pass >= n - 3;pass--)
		{
			for (i = pass;i > 0;i--)
			{
				if (stu[i].chinese + stu[i].math > stu[i - 1].chinese + stu[i - 1].math)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i];
					temp.copyFrom(stu[i]);
					stu[i] = stu[i - 1];
					stu[i - 1] = temp;
				}
			}
		}
	}


	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
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
		}
		bubble(stu, n);
		for (p = stu;p < stu + 3;p++)
		{
			System.out.printf("%d %d%c",p.id,p.chinese + p.math,(p == stu + n - 1)?'\0':'\n');
		}
		return 0;
	}
}


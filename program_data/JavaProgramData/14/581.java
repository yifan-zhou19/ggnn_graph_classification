package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int number;
	//		int maths;
	//		int chinese;
	//		int sum;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		student t = new student();
		for (i = 0;i < n;i++) //???????
		{
				stu[i].number = ConsoleInput.readToWhiteSpace(true);
				stu[i].chinese = ConsoleInput.readToWhiteSpace(true);
				stu[i].maths = ConsoleInput.readToWhiteSpace(true);
			stu[i].sum = stu[i].chinese + stu[i].maths;
		}
		for (i = 0;i < 3;i++) //?????
		{
			for (j = n - 2;j >= i;j--)
			{
				if (stu[j].sum < stu[j + 1].sum)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=stu[j];
						t.copyFrom(stu[j]);
					stu[j] = stu[j + 1];
					stu[j + 1] = t;
				}
			}
		}
		if (n >= 3)
		{
		for (i = 0;i < 3;i++) //???3?
		{
			System.out.print(stu[i].number);
			System.out.print(' ');
			System.out.print(stu[i].sum);
			System.out.print("\n");
		}
		}
		else
		{
		for (i = 0;i < n;i++)
		{
			System.out.print(stu[i].number);
			System.out.print(' ');
			System.out.print(stu[i].sum);
			System.out.print("\n");
		}
		}
		return 0;
	}
}


public class Student
{
	public int ID;
	public int chinese;
	public int math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static Student[] topThree = tangible.Arrays.initializeWithDefaultStudentInstances(3);
	public static int studentNum;

	public static void initialise()
	{
		for (int i = 0; i < 3; i++)
		{
			topThree[i].sum = -1;
		}
	}

	public static void updateTopThree(Student stu)
	{
		for (int i = 0; i < 3; i++)
		{
			if (stu.sum > topThree[i].sum)
			{
				for (int j = 2; j > i; j--)
				{
					topThree[j] = topThree[j - 1];
				}

				topThree[i] = stu;

				break;
			}
		}
	}

	public static void getStudentData()
	{
		Student temp = new Student();

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			studentNum = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < studentNum; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp.ID = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				temp.chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				temp.math = Integer.parseInt(tempVar4);
			}
			temp.sum = temp.chinese + temp.math;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: updateTopThree(temp);
			updateTopThree(new Student(temp));
		}
	}

	public static void printStudentData()
	{
		for (int i = 0; i < 3 && i < studentNum; i++)
		{
			System.out.printf("%d %d\n", topThree[i].ID, topThree[i].sum);
		}
	}

	public static int Main()
	{
		initialise();
		getStudentData();
		printStudentData();

		return 0;
	}


}


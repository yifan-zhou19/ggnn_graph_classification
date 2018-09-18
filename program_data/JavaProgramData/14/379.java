package <missing>;

public class GlobalMembers
{
	/*
	 * score.cpp
	 *
	 *  Created on: 2010-12-24
	 *      Author: ???
	 *      function: ????????
	 */
	public static int Main()
	{
		int stuNum;
		int i;
		stuNum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int id,math,chinese,total;
	//	}; //??????student
	//	struct student stu[stuNum],first,second,third;
		for (i = 0;i < stuNum;i++)
		{ //???????????????
			stu[i].id = ConsoleInput.readToWhiteSpace(true);
			stu[i].chinese = ConsoleInput.readToWhiteSpace(true);
			stu[i].math = ConsoleInput.readToWhiteSpace(true);
			stu[i].total = stu[i].chinese + stu[i].math;
		}
		//????????????
		first = second = third = stu[0];
		for (i = 1;i < stuNum;i++)
		{
			if (stu[i].total > first.total)
			{
				first = stu[i];
			}
		}
		System.out.print(first.id);
		System.out.print(' ');
		System.out.print(first.total);
		System.out.print("\n");
		for (i = 1;i < stuNum;i++)
		{
			if (stu[i].total > second.total && stu[i].id != first.id)
			{
				second = stu[i];
			}
		}
		System.out.print(second.id);
		System.out.print(' ');
		System.out.print(second.total);
		System.out.print("\n");
		for (i = 1;i < stuNum;i++)
		{
			if (stu[i].total > third.total && stu[i].id != first.id && stu[i].id != second.id)
			{
				third = stu[i];
			}
		}
		System.out.print(third.id);
		System.out.print(' ');
		System.out.print(third.total);
		System.out.print("\n");
		return 0;
	}

}


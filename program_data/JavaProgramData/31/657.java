package <missing>;

public class GlobalMembers
{
	/*
	 * tongjixueshengxinxi.cpp
	 *
	 *  Created on: 2011-12-18
	 *      Author: 1100012857
	 */
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char stunum[100];
	//		char stuname[20];
	//		char sex;
	//		int age;
	//		char score[20];
	//		char location[20];
	//		//struct student *next;
	//	}
	//	stu[990];
		int i;
		for (i = 0;;i++)
		{
			stu[i].stunum = ConsoleInput.readToWhiteSpace(true);
			if (stu[i].stunum[0] == 'e')
			{
				break;
			}
			stu[i].stuname = ConsoleInput.readToWhiteSpace(true);
			stu[i].sex = ConsoleInput.readToWhiteSpace(true);
			stu[i].age = ConsoleInput.readToWhiteSpace(true);
			stu[i].score = ConsoleInput.readToWhiteSpace(true);
			stu[i].location = ConsoleInput.readToWhiteSpace(true);

		}
		i--;
		int n = i;
		for (i = n;i >= 0;i--)
		{
			System.out.print(stu[i].stunum);
			System.out.print(' ');
			System.out.print(stu[i].stuname);
			System.out.print(' ');
			System.out.print(stu[i].sex);
			System.out.print(' ');
			System.out.print(stu[i].age);
			System.out.print(' ');
			System.out.print(stu[i].score);
			System.out.print(' ');
			System.out.print(stu[i].location);
			System.out.print("\n");
		}
		return 0;
	}

}


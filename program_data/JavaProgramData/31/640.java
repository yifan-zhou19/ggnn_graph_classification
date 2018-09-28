package <missing>;

public class GlobalMembers
{
	/*
	 * 78.cpp
	 * ??????
	 *  Created on: 2011-12-11
	 * ??????????????????????????????????????????
	 */

	public static int Main()
	{
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char number[40];
	//		char name[40];
	//		char sex;
	//		int old;
	//		double point;
	//		char address[40];
	//	}
	//	student[1000];
		for (i = 0;i < 1000;i++)
		{
			student[i].number = ConsoleInput.readToWhiteSpace(true);
			if ((student[i].number[0] == 'e') && (student[i].number[1] == 'n') && (student[i].number[2] == 'd') && (student[i].number[3] == '\0'))
			{
				break;
			}
			student[i].name = ConsoleInput.readToWhiteSpace(true);
			student[i].sex = ConsoleInput.readToWhiteSpace(true);
			student[i].old = ConsoleInput.readToWhiteSpace(true);
			student[i].point = ConsoleInput.readToWhiteSpace(true);
			student[i].address = ConsoleInput.readToWhiteSpace(true);
		}
		for (j = i - 1;j >= 0;j--)
		{
			System.out.print(student[j].number);
			System.out.print(" ");
			System.out.print(student[j].name);
			System.out.print(" ");
			System.out.print(student[j].sex);
			System.out.print(" ");
			System.out.print(student[j].old);
			System.out.print(" ");
			System.out.print(student[j].point);
			System.out.print(" ");
			System.out.print(student[j].address);
			System.out.print("\n");
		}
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	/*
	 * justexp.cpp
	 *
	 *  Created on: 2011-11-18
	 *      Author: dell
	 */
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct data
	//	{
	//		char num[200];
	//		char name[200];
	//		char gender;
	//		int age;
	//		float score;
	//		char add[200];
	//	}
	//	student[2000];
		int count = 0;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			memset(student[count].num,'\0',sizeof(student[count].num));
			student[count].num = ConsoleInput.readToWhiteSpace(true);
			if (strcmp(student[count].num,"end") == 0)
			{
				break;
			}
			student[count].name = ConsoleInput.readToWhiteSpace(true);
			student[count].gender = ConsoleInput.readToWhiteSpace(true);
			student[count].age = ConsoleInput.readToWhiteSpace(true);
			student[count].score = ConsoleInput.readToWhiteSpace(true);
			student[count].add = ConsoleInput.readToWhiteSpace(true);
			count++;
		}
		while (count-- != 0)
		{
			System.out.print(student[count].num);
			System.out.print(" ");
			System.out.print(student[count].name);
			System.out.print(" ");
			System.out.print(student[count].gender);
			System.out.print(" ");
			System.out.print(student[count].age);
			System.out.print(" ");
			System.out.print(student[count].score);
			System.out.print(" ");
			System.out.print(student[count].add);
			System.out.print("\n");
		}
		return 0;
	}
}


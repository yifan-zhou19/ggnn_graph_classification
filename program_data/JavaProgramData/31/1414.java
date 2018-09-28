package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char No[100];
	//		char name[20];
	//		char sex;
	//		int age;
	//		float grade;
	//		char address[20];
	//	}
	//	stu[10000];
		int i;
		stu[0].No = ConsoleInput.readToWhiteSpace(true);
		stu[0].name = ConsoleInput.readToWhiteSpace(true);
		stu[0].sex = ConsoleInput.readToWhiteSpace(true);
		stu[0].age = ConsoleInput.readToWhiteSpace(true);
		stu[0].grade = ConsoleInput.readToWhiteSpace(true);
		stu[0].address = ConsoleInput.readToWhiteSpace(true);
		for (i = 1;stu[i - 1].No[0] != 'e';i++)
		{
			stu[i].No = ConsoleInput.readToWhiteSpace(true);
			if (stu[i].No[0] != 'e') //????end?????
			{
				stu[i].name = ConsoleInput.readToWhiteSpace(true);
				stu[i].sex = ConsoleInput.readToWhiteSpace(true);
				stu[i].age = ConsoleInput.readToWhiteSpace(true);
				stu[i].grade = ConsoleInput.readToWhiteSpace(true);
				stu[i].address = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = i - 2;i >= 0;i--) //????
		{
			System.out.print(stu[i].No);
			System.out.print(" ");
			System.out.print(stu[i].name);
			System.out.print(" ");
			System.out.print(stu[i].sex);
			System.out.print(" ");
			System.out.print(stu[i].age);
			System.out.print(" ");
			System.out.print(stu[i].grade);
			System.out.print(" ");
			System.out.print(stu[i].address);
			System.out.print("\n");
		}
		return 0;
	}
}


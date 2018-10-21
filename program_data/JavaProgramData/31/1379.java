package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct information
	//{
	//char num[20];
	//char name[20];
	//char sex;
	//int age;
	//char score[100];
	//char address[20];
	//}
	stu[1000]; //????
	for (i = 0;i < 1000;i++)
	{
		stu[i].num = ConsoleInput.readToWhiteSpace(true);
		if ((stu[i].num[0] == 'e') && (stu[i].num[1] == 'n') && (stu[i].num[2] == 'd'))
		{
			n = i - 1;
			break;
		} //???end?????
		else
		{
		stu[i].name = ConsoleInput.readToWhiteSpace(true);
		stu[i].sex = ConsoleInput.readToWhiteSpace(true);
		stu[i].age = ConsoleInput.readToWhiteSpace(true);
		stu[i].score = ConsoleInput.readToWhiteSpace(true);
		stu[i].address = ConsoleInput.readToWhiteSpace(true);
		}
	} //????
	for (i = n;i >= 0;i--)
	{
		System.out.print(stu[i].num);
		System.out.print(" ");
		System.out.print(stu[i].name);
		System.out.print(" ");
		System.out.print(stu[i].sex);
		System.out.print(" ");
		System.out.print(stu[i].age);
		System.out.print(" ");
		System.out.print(stu[i].score);
		System.out.print(" ");
		System.out.print(stu[i].address);
		System.out.print("\n");
	} //????
	return 0;
	}
}


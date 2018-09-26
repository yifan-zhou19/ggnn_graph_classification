package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char ID[30];
	//		char name[30];
	//		char sex;
	//		int age;
	//		float score;
	//		char address[20];
	//	}
	//	message[1000];
		int num = 0;

		for (;;num++)
		{
			message[num].ID = ConsoleInput.readToWhiteSpace(true);
			if (message[num].ID[0] != 'e') //??????
			{
				message[num].name = ConsoleInput.readToWhiteSpace(true);
				message[num].sex = ConsoleInput.readToWhiteSpace(true);
				message[num].age = ConsoleInput.readToWhiteSpace(true);
				message[num].score = ConsoleInput.readToWhiteSpace(true);
				message[num].address = ConsoleInput.readToWhiteSpace(true);
			}
			else
			{
				break;
			}
		}
		for (int i = num - 1;i >= 0;i--)
		{
			System.out.print(message[i].ID);
			System.out.print(' ');
			System.out.print(message[i].name);
			System.out.print(' ');
			System.out.print(message[i].sex);
			System.out.print(' ');
			System.out.print(message[i].age);
			System.out.print(' ');
			System.out.print(message[i].score);
			System.out.print(' ');
			System.out.print(message[i].address);
			System.out.print("\n");
		}
	return 0;
	}

}


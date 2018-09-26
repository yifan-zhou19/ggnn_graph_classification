package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char ch;
	//		int num;
	//	}
		student[100]; //?????????????????
		int sum = 0;
		char temp;
		while (true) //???????????
		{
			cin.get(temp);
			if (temp == '\n')
			{
				break;
			}
			student[sum].ch = temp;
			student[sum].num = sum;
			sum++;
		}
		char boy; //?????????????????
		char girl;
		boy = student[0].ch;
		girl = student[sum - 1].ch;
		for (int i = 0; i < sum / 2; i++) //????????????
		{
			for (int j = 0; j < sum - 1; j++)
			{
				int k = j + 1;
				while (student[k].ch == 0)
				{
					k++;
				}
				if (student[j].ch == boy && student[k].ch == girl)
				{
					System.out.print(student[j].num);
					System.out.print(" ");
					System.out.print(student[k].num);
					System.out.print("\n");
					student[j].ch = 0;
					student[k].ch = 0;
					break;
				}
			}
		}
		return 0;
	}
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int No;
	//		int Chinese;
	//		int Math;
	//		int Sum; //??
	//	}
		student[100000],t; //??????
		int i;
		int j;
		for (i = 0;i < num;i++)
		{
			student[i].No = ConsoleInput.readToWhiteSpace(true);
			student[i].Chinese = ConsoleInput.readToWhiteSpace(true);
			student[i].Math = ConsoleInput.readToWhiteSpace(true);
			student[i].Sum = student[i].Math + student[i].Chinese;
		}
		for (i = 0;i < 3;i++) //????
		{
			for (j = 0;j < num - 1 - i;j++)
			{
				if (student[j].Sum >= student[j + 1].Sum)
				{
					t = student[j];
					student[j] = student[j + 1];
					student[j + 1] = t;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.print(student[num - i - 1].No);
			System.out.print(" ");
			System.out.print(student[num - i - 1].Sum);
			System.out.print("\n");
		}
		return 0;
	}
}


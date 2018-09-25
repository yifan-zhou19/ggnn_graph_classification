package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int ID;
	//		int chinese;
	//		int math;
	//		int total;
	//	}
	//	score[100000];
		for (int i = 0;i < n;i++)
		{
			score[i].ID = ConsoleInput.readToWhiteSpace(true);
			score[i].chinese = ConsoleInput.readToWhiteSpace(true);
			score[i].math = ConsoleInput.readToWhiteSpace(true);
			score[i].total = score[i].chinese + score[i].math;
		}
		for (int i = 0;i < 3;i++)
		{
			for (int j = n - 1;j > 0;j--)
			{
				if (score[j].total > score[j - 1].total)
				{
					student temp = score[j];
					score[j] = score[j - 1];
					score[j - 1] = temp;
				}
			}
		}
		if (n == 2)
		{
				for (int i = 0;i < n;i++)
				{
					System.out.print(score[i].ID);
					System.out.print(score[i].total);
					System.out.print("\n");
				}
		}
		else
		{
		for (int i = 0;i < 3;i++)
		{
			System.out.print(score[i].ID);
			System.out.print(' ');
			System.out.print(score[i].total);
			System.out.print("\n");
		}
		}
	}

}


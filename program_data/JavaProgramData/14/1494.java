package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int id;
	//		int score;
	//	}
	//	stu[100000],t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			stu[i].id = ConsoleInput.readToWhiteSpace(true);
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].score = b + c;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (stu[j].score > stu[j - 1].score)
				{
					t = stu[j];
					stu[j] = stu[j - 1];
					stu[j - 1] = t;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.print(stu[i].id);
			System.out.print(' ');
			System.out.print(stu[i].score);
			System.out.print("\n");
		}
		return 0;
	}
}


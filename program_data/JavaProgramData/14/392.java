package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int number;
	//		float score1;
	//		float score2;
	//		float score3;
	//
	//	}
	//	stu[100000],temp;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			stu[i].number = ConsoleInput.readToWhiteSpace(true);
			stu[i].score1 = ConsoleInput.readToWhiteSpace(true);
			stu[i].score2 = ConsoleInput.readToWhiteSpace(true);
			stu[i].score3 = stu[i].score2 + stu[i].score1;
		}
		for (i = n - 1;i >= n - 3;i--)
		{
			for (j = n - 1;j >= n - i;j--)
			{
				if (stu[j - 1].score3 < stu[j].score3)
				{
					temp = stu[j];
					stu[j] = stu[j - 1];
					stu[j - 1] = temp;
				}
			}
		}
		System.out.print(stu[0].number);
		System.out.print(" ");
		System.out.print(stu[0].score3);
		System.out.print("\n");
		System.out.print(stu[1].number);
		System.out.print(" ");
		System.out.print(stu[1].score3);
		System.out.print("\n");
		System.out.print(stu[2].number);
		System.out.print(" ");
		System.out.print(stu[2].score3);
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int stuno;
	//		int score1;
	//		int score2;
	//		int score0;
	//	};
		int n;
		int i;
		int j;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		student[] num = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		for (i = 0;i < n;i++)
		{
			num[i].stuno = ConsoleInput.readToWhiteSpace(true);
			num[i].score1 = ConsoleInput.readToWhiteSpace(true);
			num[i].score2 = ConsoleInput.readToWhiteSpace(true);
			num[i].score0 = num[i].score1 + num[i].score2;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (num[i].score0 < num[j].score0)
				{
					temp = num[i].score0;
					num[i].score0 = num[j].score0;
					num[j].score0 = temp;
					temp = num[i].stuno;
					num[i].stuno = num[j].stuno;
					num[j].stuno = temp;
				}
			}
		}
		for (i = 0;i < 3 && i < n;i++)
		{
			System.out.print(num[i].stuno);
			System.out.print(" ");
			System.out.print(num[i].score0);
			System.out.print("\n");
		}
		return 0;
	}


}


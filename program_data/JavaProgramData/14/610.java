package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int id;
	//		int total;
	//	}; //?????
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(n + 1); //??????
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
		   stu[i].id = ConsoleInput.readToWhiteSpace(true);
		   c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   stu[i].total = c + m; //?????????
		}
		for (i = n - 1;i > n - 4;i--)
		{
			for (j = n - 1;j > n - i - 1;j--)
			{
				if (stu[j].total > stu[j - 1].total)
				{
					stu[n] = stu[j];
					stu[j] = stu[j - 1];
					stu[j - 1] = stu[n];
				}
			} //????
		}
		for (i = 0;i < 3;i++)
		{
			if (i < n)
			{
			System.out.print(stu[i].id);
			System.out.print(" ");
			System.out.print(stu[i].total);
			System.out.print("\n");
			}
		}
		return 0;
	}

}


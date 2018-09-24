package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int yuwen;
	//		int shuxue;
	//		int sum;
	//	}
	//	stu[100000];
		for (i = 0;i < n;i++)
		{
			stu[i].num = ConsoleInput.readToWhiteSpace(true);
			stu[i].yuwen = ConsoleInput.readToWhiteSpace(true);
			stu[i].shuxue = ConsoleInput.readToWhiteSpace(true);
			stu[i].sum = stu[i].yuwen + stu[i].shuxue;
		}
		int max = 0;
		int maxj = 0;
		if (n >= 3)
		{
		for (i = 0;i < n;i++)
		{
		if (stu[i].sum > max)
		{
			max = stu[i].sum;
			maxj = i;
		}
		}
		System.out.print(stu[maxj].num);
		System.out.print(' ');
		System.out.print(stu[maxj].sum);
		System.out.print("\n");
		stu[maxj].sum = 0;
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum > max)
			{
				max = stu[i].sum;
				maxj = i;
			}
		}
			System.out.print(stu[maxj].num);
			System.out.print(' ');
			System.out.print(stu[maxj].sum);
			System.out.print("\n");
			stu[maxj].sum = 0;
			max = 0;
			for (i = 0;i < n;i++)
			{
				if (stu[i].sum > max)
				{
					max = stu[i].sum;
					maxj = i;
				}
			}
				System.out.print(stu[maxj].num);
				System.out.print(' ');
				System.out.print(stu[maxj].sum);
				System.out.print("\n");
		}
		else
		{
			if (stu[0].sum > stu[1].sum)
			{
				System.out.print(stu[0].num);
				System.out.print(' ');
				System.out.print(stu[0].sum);
				System.out.print("\n");
				System.out.print(stu[1].num);
				System.out.print(' ');
				System.out.print(stu[1].sum);
			}
			else
			{
				System.out.print(stu[1].num);
				System.out.print(' ');
				System.out.print(stu[1].sum);
				System.out.print("\n");
				System.out.print(stu[0].num);
				System.out.print(' ');
				System.out.print(stu[0].sum);
			}
		}
				return 0;
	}
}


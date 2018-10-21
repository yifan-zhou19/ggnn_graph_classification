public class student
{
	public int number;
	public int chinese;
	public int math;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100001);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] max = new int[3][2];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //??????????
		{
			stu[i].number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].chinese = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].num = stu[i].chinese + stu[i].math;
		}
		for (j = 0;j < 3;j++) //??3??????
		{
			for (i = 0;i < n;i++)
			{
				if (stu[i].num > max[j][0])
				{
					max[j][0] = stu[i].num;
					max[j][1] = i + 1;
				}
			}
			stu[max[j][1] - 1].num = 0;
		}
		for (j = 0;j < 3;j++) //?????
		{
			System.out.print(max[j][1]);
			System.out.print(' ');
			System.out.print(max[j][0]);
			System.out.print("\n");
		}
		return 0;
	}
}


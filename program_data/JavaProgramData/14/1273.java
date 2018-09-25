package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int num;
	//		int chin;
	//		int math;
	//		int sum;
	//	}
	//	one[n+1];

		for (int i = 1;i <= n;i++)
		{
			one[i].num = ConsoleInput.readToWhiteSpace(true);
			one[i].chin = ConsoleInput.readToWhiteSpace(true);
			one[i].math = ConsoleInput.readToWhiteSpace(true);
			one[i].sum = one[i].chin + one[i].math;
		} //???????
		int t = 0;
		for (int i = 200;i >= 0;i--)
		{
			for (int j = 1;j <= n;j++)
			{
				if (one[j].sum == i)
				{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(one[j].sum);
					System.out.print("\n");
					t = t + 1;
				}
				if (t == 3)
				{
					i = -1;
					break;
				}
			} //????????
		}
		return 0;
	}
}


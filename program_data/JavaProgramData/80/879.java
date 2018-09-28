package <missing>;

public class GlobalMembers
{
	public static int judge(int y)
	{
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] mouth =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		}; //??????????????????
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s = 0;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y1 == y2) //???????
		{
			for (int i = m1;i < m2;i++)
			{
				s = s + mouth[judge(y1)][i]; //?????????
			}
			System.out.print(s + d2 - d1);
			System.out.print("\n");
		}
		else //??
		{
			for (int i = m1;i <= 12;i++)
			{
				s1 = s1 + mouth[judge(y1)][i]; //???????????
			}
			s1 = s1 - d1;
			for (int i = 1;i < m2;i++)
			{
				s2 = s2 + mouth[judge(y2)][i]; //???????????????
			}
			s2 = s2 + d2;
			for (int i = y1 + 1;i < y2;i++)
			{
				if (judge(i) == 1)
				{
					s3 = s3 + 366;
				}
				else
				{
					s3 = s3 + 365;
				}
			} //???????????
			s = s1 + s2 + s3; //?????
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}
}


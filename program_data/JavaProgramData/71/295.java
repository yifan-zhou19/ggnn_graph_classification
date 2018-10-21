package <missing>;

public class GlobalMembers
{
	public static int runnian(int nian)
	{
		if (nian % 100 == 0)
		{
			if (nian % 400 == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			if (nian % 4 == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
	public static int Main()
	{
		int n;
		int[] s1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] s2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int nian;
			int yue1;
			int yue2;
			int days = 0;
			nian = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			yue1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			yue2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (yue1 > yue2)
			{
				int temp;
				temp = yue1;
				yue1 = yue2;
				yue2 = temp;
			}
			if (runnian(nian) == 0)
			{
				for (int j = yue1 - 1;j < yue2 - 1;j++)
				{
					days += s1[j];
				}
				if (days % 7 == 0)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
			}
			else if (runnian(nian) == 1)
			{
				for (int j = yue1 - 1;j < yue2 - 1;j++)
				{
								days += s2[j];
				}
							if (days % 7 == 0)
							{
								System.out.print("YES");
								System.out.print("\n");
							}
							else
							{
								System.out.print("NO");
								System.out.print("\n");
							}
			}
		}
		return 0;
	}


}


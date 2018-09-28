package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????????   **
	//*????? 1300012707 **
	//*???2013.10.23  **
	//*******************************
	public static int Main()
	{
		int m;
		int s1;
		int s2;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 3; i <= m / 2; i = i + 2)
		{
			s1 = 0;
			s2 = 1;
			for (int j = 2; j <= Math.sqrt(i); j = j + 1)
			{
				if (i % j == 0)
				{
					s1 = 1;
					break;
				}
			}
			if (s1 == 0)
			{
				s2 = 0;
				for (int j = 2; j <= Math.sqrt(m - i); j = j + 1)
				{
					if ((m - i) % j == 0)
					{
						s2 = 1;
						break;
					}
				}
			}
			if (s2 == 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(m - i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}


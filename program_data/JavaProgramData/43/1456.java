package <missing>;

public class GlobalMembers
{
	//********************************
	//*???4.cpp   **
	//*?????????   **
	//*?????? 1300012838 **
	//*???2013.10.23  **
	//********************************

	public static int Main()
	{
		int m;
		int judge;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 3; i <= m / 2; i++)
		{
			judge = 1;
			for (int j = 2; j <= Math.sqrt((double)i); j++)
			{
				if (i % j == 0)
				{
					judge = 0;
					break;
				}
			}
			if (judge == 1)
			{
				k = m - i;
				judge = 1;
				for (int j = 2; j <= Math.sqrt((double)k); j++)
				{
					if (k % j == 0)
					{
						judge = 0;
						break;
					}
				}
				if (judge == 1)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(k);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}


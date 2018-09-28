package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????????   **
	//*?????? 1200012837 **
	//*???2012.10.22  **
	//********************************

	public static int Main()
	{
		int m;
		double x;
		double y;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 3; x <= m / 2; x += 2)
		{
			int i = 2;
			for (; i <= (int)Math.sqrt(x); i++)
			{
				if ((int)x % i == 0)
				{
					break;
				}
			}
			if (i == (int)Math.sqrt(x) + 1)
			{
				y = m - x;
				int k = 2;
				for (; k <= (int)Math.sqrt(y); k++)
				{
					if ((int)y % k == 0)
					{
						break;
					}
				}
				if (k == (int)Math.sqrt(y) + 1)
				{
					System.out.print(x);
					System.out.print(" ");
					System.out.print(y);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}


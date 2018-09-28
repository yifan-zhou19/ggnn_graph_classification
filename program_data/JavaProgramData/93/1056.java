package <missing>;

public class GlobalMembers
{
	//**************************************
	//     ??????3,5,7,????      *
	//     ??????                    *
	//     ???????????3,5,7?? *
	//     ?????2012.10               *
	//**************************************
	public static int Main() //?????
	{
		int m;
		int sum;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = (m % 3 == 0) + (m % 5 == 0) + (m % 7 == 0);
		if (sum == 3)
		{
			System.out.print("3 ");
			System.out.print("5 ");
			System.out.print("7");
			System.out.print("\n");
		}
		else
		{
			if (sum == 2)
			{
				if (m % 3 != 0)
				{
					System.out.print("5 ");
					System.out.print("7");
					System.out.print("\n");
				}
				else
				{
					if (m % 5 != 0)
					{
					System.out.print("3 ");
					System.out.print("7");
					System.out.print("\n");
					}
					else
					{
					System.out.print("3 ");
					System.out.print("5");
					System.out.print("\n");
					}
				}
			}
			else
			{
				if (sum == 1)
				{
				if (m % 3 == 0)
				{
					System.out.print("3");
					System.out.print("\n");
				}
				else
				{
					if (m % 5 == 0)
					{
					System.out.print("5");
					System.out.print("\n");
					}
					else
					{
					System.out.print("7");
					System.out.print("\n");
					}
				}
				}
				else
				{
					System.out.print("n");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}


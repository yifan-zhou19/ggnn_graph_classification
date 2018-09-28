package <missing>;

public class GlobalMembers
{
	//*************************************************
	//* file: 1000012912_006.cpp                      *
	//* author : ???                               *
	//* date : 2010.11.24                             *
	//* function : ????                           *
	//*************************************************
	public static int Main()
	{
		int n; //n????m?????
		int m;
		int i;
		int j;
		int[] count = new int[20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			for (j = 0; j < m; j++)
			{
				count[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = m - 1; j >= 0; j--)
			{
				if (count[j] + 3 * (j + 1) <= 60) //?60s????
				{
					System.out.print(60 - 3 * (j + 1));
					System.out.print("\n");
					break;
				}
				else
				{
					if (count[j] + 3 * (j + 1) <= 63) //?60s???3s?
					{
						System.out.print(count[j]);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}


}


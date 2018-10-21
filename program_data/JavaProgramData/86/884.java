package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] jump = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int m;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1 ; i <= n ; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(jump, 0, (Integer.SIZE / Byte.SIZE));

			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (j = 0 ; j < m ; j++)
				{
					jump[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}

				if (3 * m + jump[m - 1] <= 60)
				{
					System.out.print(60 - 3 * m);
					System.out.print("\n");
				}
				else
				{
					j = 0;

					for (j = 0 ; 3 * (j + 1) + jump[j] <= 60 ; j++)
					{
						;
					}

				//	cout << "j=" << j << endl ;

					if (3 * (j + 1) + jump[j] > 63)
					{
						System.out.print(60 - 3 * j);
						System.out.print("\n");
					}
					else
					{
						System.out.print(jump[j]);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}


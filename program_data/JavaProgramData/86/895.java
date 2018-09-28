package <missing>;

public class GlobalMembers
{
	/*????:????
	 *??:???
	 *??:2010/11/26
	 *??:1000010449
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count;
		int[] x = new int[20];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			count = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (count == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				x[0] = 0;
				for (j = 0; j < count; j++)
				{
					x[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}

				for (j = 0; j < count; j++)
				{
					if (x[j] + 3 * j > 60)
					{
						break;
					}
				}
				j--;

				if (60 - x[j] - 3 * (j + 1) <= 0)
				{
					System.out.print(x[j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(60 - 3 * (j + 1));
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[] num = new int[100];
		int[] result = new int[100];
		int temp;

		i = 0;
		j = 0;
		while (true)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num[i] == -1)
			{
				break;
			}

			while (true)
			{
				if (num[i] == 0)
				{
					temp = 0;
					for (m = 0; m < i; m++)
					{
						for (n = 0; n < i; n++)
						{
							if (num[m] == 2 * num[n])
							{
								temp++;
							}
						}
					}
					result[j] = temp;

					i = 0;
					j++;
					break;
				}
				else
				{
					i++;
					num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}

		for (m = 0; m < j; m++)
		{
			System.out.print(result[m]);
			System.out.print("\n");
		}
		return 0;
	}
}


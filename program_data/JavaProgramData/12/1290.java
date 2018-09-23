package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[17];
		int n;
		int count = 1;
		int result = 0;
		while ((n) != 0 && (n != -1 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n != 0)
			{
				num[count] = n;
				count++;
			}
			else
			{
				for (int i = 1; i < count; i++)
				{
					for (int j = 1; j < count; j++)
					{
						if (num[i] == 2 * num[j])
						{
							result++;
						}
					}
				}
				System.out.print(result);
				System.out.print("\n");
				result = 0;
				count = 1;
			}
		}

		return 0;
	}
}


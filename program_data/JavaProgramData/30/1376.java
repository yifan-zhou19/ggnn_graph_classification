package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			if (i % 7 == 0)
			{

			continue;
			}

			else
			{
				if (i % 10 == 7)
				{

				continue;
				}

				else
				{
					if (i / 10 == 7)
					{

					continue;
					}
				}
			}

			sum = sum + i * i;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}


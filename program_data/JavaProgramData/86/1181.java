package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] result = new int[300];

		for (int i = 0;i < n;i++)
		{

			int[] s = new int[30];
			int k = 0;
			int times = 0;
			int sum = 60;

			do
			{
				s[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				k += 1;
			} while (System.in.read() != '\n');

			for (int j = 1;j <= s[0];j++)
			{
				int sup = 60 - 3 * times - s[j];
				if (sup > 0)
				{
					times += 1;
					if (sup < 3)
					{
						sum -= sup;
					}
					else
					{
						sum -= 3;
					}
				}
				else
				{
				break;
				}
			}

			result[i] = sum;

		}

		for (int i = 0;i < n;i++)
		{
			System.out.print(result[i]);
			if (i < n - 1)
			{
			System.out.print("\n");
			}
		}

		return 0;

	}
}


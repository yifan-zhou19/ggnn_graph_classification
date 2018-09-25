package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] number = new int[16];
		int n;
		for (; ;)
		{
			n = 0;
			number[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (number[0] == -1)
			{
				break;
			}
			int i;
			for (i = 1; i < 16; i++)
			{
				number[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (number[i] == 0)
				{
					break;
				}
			}
			for (int j = 0; j < i; j++)
			{
				for (int k = 0; k < i; k++)
				{
					if (number[k] == 2 * number[j])
					{
						n++;

					}
				}
			}
			System.out.print(n);
			System.out.print("\n");
		}

		return 0;
	}
}


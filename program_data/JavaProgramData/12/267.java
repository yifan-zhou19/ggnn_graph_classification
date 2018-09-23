package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int count = 0;
		while (true)
		{
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break;
			}
			i = 1;
			while (true)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
				i++;
			}

			count = 0;
			for (i = 0; a[i] != 0; i++)
			{
				for (j = 0; a[j] != 0; j++)
				{
					if (a[i] * 2 == a[j])
					{
						count++;
					}
				}
			}

			System.out.print(count);
			System.out.print("\n");
		}

		return 0;
	}
}


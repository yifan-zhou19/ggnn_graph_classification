package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int count;
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a[0] != -1)
		{
			count = 0;
			for (i = 1; ; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
			}
			for (i = 0; a[i] != 0; i++)
			{
				for (j = 0; a[j] != 0; j++)
				{
					if (a[i] == 2 * a[j])
					{
						count++;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		return 0;
	}

}


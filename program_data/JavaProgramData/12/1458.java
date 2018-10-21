package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x;
		int y;
		int count = 0;
		int[] a = new int[16];
		for (i = 1;;i++)
		{
			count = 0;
			for (j = 0;;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if ((a[j] == 0) || (a[j] == -1))
				{
				break;
				}
			}

			for (x = 0;x <= j - 1;x++)
			{
				for (y = 0;y <= j - 1;y++)
				{
					if (a[y] == a[x] * 2)
					{
					count = count + 1;
					}
				}
			}
			if (a[j] != -1)
			{
			System.out.print(count);
			System.out.print("\n");
			}
		}
		return 0;
	}

}


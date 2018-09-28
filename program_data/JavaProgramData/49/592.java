package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "0"; //??????
		int r;
		int i;
		int j;
		int k;
		int m;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; a.charAt(i); i++)
		{
		}
		r = i;
		for (i = 2; i <= r; i++)
		{
			if (i % 2 == 0)
			{
				for (j = i / 2 - 1; j <= r - i / 2; j++)
				{
					for (k = 1; k <= i / 2; k++)
					{
						if (a.charAt(j - k + 1) != a.charAt(j + k)) //???????
						{
							break;
						}
						else
						{
							continue;
						}
					}
					if (k == i / 2 + 1)
					{
						for (m = -i / 2 + 1; m <= i / 2; m++)
						{
							System.out.print(a.charAt(j + m));
						}
						System.out.print("\n");
					}
				}
			} //??????
			if (i % 2 == 1)
			{
				for (j = i / 2; j < r - i / 2; j++)
				{
					for (k = 1; k <= i / 2; k++)
					{
						if (a.charAt(j - k) != a.charAt(j + k))
						{
							break;
						}
						else
						{
							continue;
						}
					}
					if (k == i / 2 + 1)
					{
						for (m = -i / 2; m <= i / 2; m++)
						{
							System.out.print(a.charAt(j + m));
						}
						System.out.print("\n");
					} //??????
				}
			}
		}
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		char[][] words = new char[50][30];
		int[] len = new int[50];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				words[a] = tempVar2.charAt(0);
			}
		}

		for (a = 0;a < n;a++)
		{
			len[a] = String.valueOf(words[a]).length();
		}

		for (a = 0;a < n;a++)
		{
			if (words[a][len[a] - 2] == 'e')
			{
				if (words[a][len[a] - 1] == 'r')
				{
					for (b = 0;b < len[a] - 2;b++)
					{
						System.out.printf("%c",words[a][b]);

					}
					System.out.print("\n");
				}
			}
			else if (words[a][len[a] - 2] == 'l')
			{
				if (words[a][len[a] - 1] == 'y')
				{
					for (b = 0;b < len[a] - 2;b++)
					{
						System.out.printf("%c",words[a][b]);

					}
					System.out.print("\n");
				}
			}
			else if (words[a][len[a] - 3] == 'i')
			{
				if (words[a][len[a] - 2] == 'n')
				{
					if (words[a][len[a] - 1] == 'g')
					{
						for (b = 0;b < len[a] - 3;b++)
						{
							 System.out.printf("%c",words[a][b]);

						}
						System.out.print("\n");
					}
				}
			}
		}
	}

}


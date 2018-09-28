package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] len = new int[100];
		char[][] word = new char[100][20];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(word[i]).length();

		}
		int j;


		for (j = 0;j < n;j++)
		{
			if (word[j][len[j] - 2] == 'e' && word[j][len[j] - 1] == 'r')
			{
				for (i = 0;i < (len[j] - 2);i++)
				{
					System.out.printf("%c",word[j][i]);
				}
				System.out.print("\n");
			}
			else
			{
				if (word[j][len[j] - 2] == 'l' && word[j][len[j] - 1] == 'y')
				{
					for (i = 0;i < (len[j] - 2);i++)
					{
						System.out.printf("%c",word[j][i]);
					}
					System.out.print("\n");
				}
				else
				{
					if (word[j][len[j] - 3] == 'i' && word[j][len[j] - 2] == 'n' && word[j][len[j] - 1] == 'g')
					{
						for (i = 0;i < (len[j] - 3);i++)
						{
							System.out.printf("%c",word[j][i]);
						}
						System.out.print("\n");
					}
					else
					{
					}
				}
			}
		}

		return 0;
	}
}


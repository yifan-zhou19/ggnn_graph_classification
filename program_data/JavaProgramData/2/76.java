package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int booknumber;
		int[] order = new int[1000];
		char[][] author = new char[1000][27];
		char[] single_author = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int[] author_booknumber = new int[26];
		int i;
		int j;
		int k;
		int tmp;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			booknumber = Integer.parseInt(tempVar);
		}

		for (i = 0;i < booknumber;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				order[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				author[i] = tempVar3.charAt(0);
			}
			for (j = 0;j < String.valueOf(author[i]).length();j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (author[i][j] == single_author[k])
					{
						author_booknumber[k]++;
						break;
					}
				}
			}
		}
		tmp = 0;

		for (i = 1;i < 26;i++)
		{
			if (author_booknumber[i] > author_booknumber[tmp])
			{
				tmp = i;
			}
		}
		System.out.printf("%c\n",single_author[tmp]);
		System.out.printf("%d\n",author_booknumber[tmp]);

		for (i = 0;i < booknumber;i++)
		{
			for (j = 0;j < String.valueOf(author[i]).length();j++)
			{
				if (author[i][j] == single_author[tmp])
				{
					System.out.printf("%d\n",order[i]);
					break;
				}
			}
		}


		return 0;
	}







}


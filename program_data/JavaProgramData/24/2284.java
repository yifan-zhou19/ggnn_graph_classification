package <missing>;

public class GlobalMembers
{
	/*
	 *??????????.cpp
	 *?????
	 *????: 2012-12-24
	 *????????????
	 */


	public static int Main()
	{
		char[][] word = new char[210][30];
		int[] len = new int[210];
		int i = 0;
		int j;
		int max = -101;
		int min = 100010;
		int pmax;
		int pmin;

		while ((word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			i++;
		}
		for (j = 0; j < i; j++)
		{
			len[j] = String.valueOf(word[j]).length();
		}
		for (j = 0; j < i; j++)
		{
			if (len[j] > max)
			{
				max = len[j];
				pmax = j;
			}
			if (len[j] < min)
			{
				min = len[j];
				pmin = j;
			}
		}
		for (j = 0; j < len[pmax]; j++)
		{
			System.out.print(word[pmax][j]);
		}
		System.out.print("\n");
		for (j = 0; j < len[pmin]; j++)
		{
			System.out.print(word[pmin][j]);
		}
		return 0;

	}

}


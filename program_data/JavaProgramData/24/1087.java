package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = 0;
		int min = 100;
		int pos1;
		int pos2;
		char[][] words = new char[50][100];
		int[] len = new int[50];
		int i = 0;
		int j;

		while (scanf("%s", words[i]) != EOF)
		{
			len[i] = String.valueOf(words[i]).length();
			i++;
		}

		for (j = 0; j < i; j++)
		{
			if (len[j] < min)
			{
				min = len[j];
				pos1 = j;
			}
			if (len[j] > max)
			{
				max = len[j];
				pos2 = j;
			}
		}

		System.out.printf("%s\n%s\n", words[pos2], words[pos1]);

		return 0;
	}


}

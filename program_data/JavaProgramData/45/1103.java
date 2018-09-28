package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] len = new int[2];
		char[][] word = new char[2][50];
		for (i = 0;i < 2;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word[i] = tempVar.charAt(0);
			}
			len[i] = String.valueOf(word[i]).length();
		}
		int n = 100;
		j = 0;
		k = 0;
		while (j < len[1] && k < len[0])
		{
			if (word[1][j] == word[0][k])
			{
					n = j;
					j++;
					k++;
			}
			else
			{
				k = 0;
				j++;
				n = 100;
			}
		}
		if (n != 100)
		{
			System.out.printf("%d\n",n - len[0] + 1);
		}
		return 0;
	}

}


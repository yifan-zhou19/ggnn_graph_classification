package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[50][30];
		int[] length = new int[50];
		int i;
		int j;
		int wordnum;
		int p;
		int maxlength;
		int minlength;
		int max;
		int min;
		for (i = 0;i <= 49;i++)
		{
			for (j = 0;j <= 11;j++)
			{
				word[i][j] = '\0';
			}
		}
		for (i = 0;i <= 49;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word[i] = tempVar.charAt(0);
			}
			if (System.in.read() == '\n')
			{
				wordnum = i;
				break;
			}
		}
		for (i = 0;i <= wordnum;i++)
		{
			length[i] = String.valueOf(word[i]).length();
		}
		max = 0;
		min = 0;
		maxlength = length[0];
		minlength = length[0];
		for (i = 0;i <= wordnum;i++)
		{
			if (length[i] > maxlength)
			{
				max = i;
				maxlength = length[i];
			}
			if (length[i] < minlength)
			{
				min = i;
				minlength = length[i];
			}
		}
		System.out.printf("%s\n%s\n",word[max],word[min]);
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] len = new int[50];
		int i;
		char[][] str = new char[50][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(str[i]).length();
			if (str[i][len[i] - 1] == 'r' && str[i][len[i] - 2] == 'e')
			{
				str[i][len[i] - 2] = 0;
			}
			else if (str[i][len[i] - 1] == 'y' && str[i][len[i] - 2] == 'l')
			{
				str[i][len[i] - 2] = 0;
			}
			else if (str[i][len[i] - 1] == 'g' && str[i][len[i] - 2] == 'n' && str[i][len[i] - 3] == 'i')
			{
				str[i][len[i] - 3] = 0;
			}
			System.out.printf("%s\n",str[i]);
		}
		return 0;
	}

}


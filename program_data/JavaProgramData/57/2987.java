package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] len = new int[50];
		char[][] s = new char[50][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(s[i]).length();
			if (s[i][len[i] - 2] == 'e' && s[i][len[i] - 1] == 'r')
			{
				s[i][len[i] - 2] = '\0';
			}
			else if (s[i][len[i] - 2] == 'l' && s[i][len[i] - 1] == 'y')
			{
				s[i][len[i] - 2] = '\0';
			}
			else if (s[i][len[i] - 3] == 'i' && s[i][len[i] - 2] == 'n' && s[i][len[i] - 1] == 'g')
			{
				s[i][len[i] - 3] = '\0';
			}
			else
			{
				;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}
		return 0;
	}

}


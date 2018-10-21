package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		char[][] word = new char[100][30];
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
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			int flag = 1;
			for (j = 0;j < String.valueOf(word[i]).length();j++)
			{
				if (((word[i][0] <= 'Z' && word[i][0] >= 'A') || (word[i][0] <= 'z' && word[i][0] >= 'a') || word[i][0] == '_') != 1)
				{
					flag = 0;
				break;
				}
				else if (((word[i][j] <= 'Z' && word[i][j] >= 'A') || (word[i][j] <= 'z' && word[i][j] >= 'a') || word[i][j] == '_' || (word[i][j] >= '0' && word[i][j] <= '9')) != 1 && word[i][j] != '\0')
				{
					flag = 0;
				break;
				}
			}
			if (flag == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
			System.out.print("no\n");
			}
		}
	}
}


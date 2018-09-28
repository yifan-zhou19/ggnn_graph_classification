package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int len;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] str =
		{
			{(" "," "), '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		final String str2 = " ";
		final String str3 = " ";
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
		}
			for (i = 0;i < n;i++)
			{
			len = String.valueOf(str[i]).length();
			for (j = len - 1;j >= len - 2;j--)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, len - 1 - j, str[i][j]);
			}
			if (strcmp(str2,"re") == 0)
			{
				flag = 1;
				for (j = 0;j < len - 2;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
			}
			else if (strcmp(str2,"yl") == 0)
			{
				flag = 1;
				for (j = 0;j < len - 2;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
			}
			for (j = len - 1;j >= len - 3;j--)
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, len - 1 - j, str[i][j]);
			}
			if (strcmp(str3,"gni") == 0)
			{
				flag = 1;
				for (j = 0;j < len - 3;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
			}
			if (flag == 1)
			{
			  System.out.print("\n");
			}
			}
	}
}


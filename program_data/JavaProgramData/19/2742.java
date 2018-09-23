package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[50][100];
		int i;
		int j;
		int l = 0;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while ((s[l++] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			;
		}
		l--;
		for (i = 0;i < l - 2;i++)
		{
			if (strcmp(s[i],s[l - 2]) == 0) //??????????????
			{
				for (j = 0;j <= String.valueOf(s[l - 1]).length();j++)
				{
				s[i][j] = s[l - 1][j]; //??????????
				}
			}
		}
		for (i = 0;i < l - 3;i++)
		{
			System.out.print(s[i]);
			System.out.print(' ');
		}
		System.out.print(s[l - 3]);
		return 0;
	}
}


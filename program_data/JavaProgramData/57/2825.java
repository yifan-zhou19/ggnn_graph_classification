package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		char[][] s = new char[50][15];
		String b = new String(new char[2]);
		String c = new String(new char[3]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
						a = String.valueOf(s[i]).length();
						for (j = 0;j < 3;j++)
						{
							c = tangible.StringFunctions.changeCharacter(c, j, s[i][a - 3 + j]);
						}
						if (s[i][a - 2] == 'l' && s[i][a - 1] == 'y')
						{
							s[i][a - 2] = '\0';
						}
						else if (s[i][a - 2] == 'e' && s[i][a - 1] == 'r')
						{
							s[i][a - 2] = '\0';
						}
						else if (strcmp(c,"ing") == 0)
						{
							s[i][a - 3] = '\0';
						}
						System.out.printf("%s\n",s[i]);
		}
	}

}


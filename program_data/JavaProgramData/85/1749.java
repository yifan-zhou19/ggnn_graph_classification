package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		char[][] s = new char[2020][20];
		String b = new String(new char[20]);
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
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0,m = 0;i < n;i++,m++)
		{
			for (j = 0;s[i][j] != '\0';j++)
			{
				if (s[i][j] <= 57 && s[i][j] >= 48 || s[i][j] <= 90 && s[i][j] >= 65 || s[i][j] == 95 || s[i][j] <= 122 && s[i][j] >= 97)
				{
					if (s[i][0] <= 90 && s[i][0] >= 65 || s[i][0] <= 122 && s[i][0] >= 97 || s[i][0] == 95)
					{
					b = b.substring(0, m);
					}
					else
					{
						b = tangible.StringFunctions.changeCharacter(b, m, 1);
						break;
					}
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, m, 1);
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b.charAt(i) == 1)
			{
				System.out.print("no\n");
			}
			if (b.charAt(i) == 0)
			{
				System.out.print("yes\n");
			}
		}
			return 0;
	}

}


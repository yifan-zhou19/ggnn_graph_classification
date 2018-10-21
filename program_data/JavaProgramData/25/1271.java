package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int n;
		int c;
		int len;
		int j;
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = tangible.StringFunctions.changeCharacter(a, 0, '1');
		a = tangible.StringFunctions.changeCharacter(a, 1, '\0');
		for (i = 1; i <= n; i++)
		{
			c = 0;
			len = a.length();
			for (j = 0; j <= len - 1; j++)
			{
				if (a.charAt(j) - '0' < 5)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, (a.charAt(j) - '0') * 2 + '0' + c);
					c = 0;
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, (a.charAt(j) - '0') * 2 + '0' + c - 10);
					c = 1;
				}
			}
			a = tangible.StringFunctions.changeCharacter(a, j, c + '0');
			if (a.charAt(j) != '0')
			{
				a = tangible.StringFunctions.changeCharacter(a, j + 1, '\0');
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			}
		}
		len = a.length();
		for (k = len - 1; k >= 0; k--)
		{
			System.out.print(a.charAt(k));
		}
		return 0;
	}







}


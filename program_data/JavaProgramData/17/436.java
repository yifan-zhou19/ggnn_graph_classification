package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int[] c = new int[200];
		int len;
		int k;
		for (int i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			k = 0;
			int j = 0;
			for (j = 0; j < len; j++)
			{
				if (a.charAt(j) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '$');
					c[k] = j;
					k = k + 1;
				}
				else if (a.charAt(j) == ')')
				{
					if (j == 0)
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '?');
					}
					else
					{
						if (k > 0 && b.charAt(c[k - 1]) == '$')
						{
							b = tangible.StringFunctions.changeCharacter(b, c[k - 1], ' ');
							b = tangible.StringFunctions.changeCharacter(b, j - 1, ' ');
							b = tangible.StringFunctions.changeCharacter(b, j, ' ');
							k = k - 1;
						}
						else
						{
							b = tangible.StringFunctions.changeCharacter(b, j, '?');
							c[k] = j;
							k = k + 1;
						}
					}
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, j, ' ');
				}
			}
			b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			System.out.printf("%s\n", a);
			System.out.printf("%s\n", b);
		}
		return 0;
	}
}


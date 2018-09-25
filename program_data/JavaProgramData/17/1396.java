package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		String c = new String(new char[110]);
		while (gets(a))
		{
			b = a;
			c = a;
			int i;
			int j;
			int n = a.length();
			int ju = 0;
			for (i = n - 1;i >= 0;i--)
			{
				if (a.charAt(i) == '(')
				{
					for (j = i;j < n;j++)
					{
						if (a.charAt(j) == ')')
						{
							a = tangible.StringFunctions.changeCharacter(a, j, 99);
							b = tangible.StringFunctions.changeCharacter(b, i, b[j] = 32);
							break;
						}
					}
					if (j == n)
					{
						b = tangible.StringFunctions.changeCharacter(b, i, '$');
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				if (b.charAt(i) != 32 && b.charAt(i) != ')' && b.charAt(i) != '$')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, 32);
				}
				else if (b.charAt(i) == ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '?');
				}
			}
			System.out.printf("%s\n",c);
			System.out.printf("%s\n",b);
		}
		return 0;
	}




}


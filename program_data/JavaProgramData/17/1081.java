package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		while (gets(a) != null)
		{
			int i = 0;
			int j = 0;
			int k = 0;
			int n;
			n = a.length();
			for (i = 0;i < n;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				c = tangible.StringFunctions.changeCharacter(c, i, ' ');
			}


			for (i = n - 1;i >= 0;i--)
			{
				if (a.charAt(i) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == ')')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
				}
			}
			for (i = n - 1;i >= 0;i--)
			{
				if (b.charAt(i) == '(')
				{
					for (j = i + 1;j < n;j++)
					{
					if (c.charAt(j) == ')')
					{
						c = tangible.StringFunctions.changeCharacter(c, j, ' ');
					 b = tangible.StringFunctions.changeCharacter(b, i, ' ');
						break;
					}
					}
				}
			}
			System.out.printf("%s\n",a);
			for (i = 0;i < n;i++)
			{
				if (b.charAt(i) != ' ')
				{
				   a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
				 if (c.charAt(i) != ' ')
				 {
					 a = tangible.StringFunctions.changeCharacter(a, i, '?');
				 }
				if (b.charAt(i) == ' ' && c.charAt(i) == ' ')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
			}
			System.out.printf("%s\n",a);
		}






	}

}


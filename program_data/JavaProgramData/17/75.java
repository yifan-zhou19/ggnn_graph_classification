package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		int l;
		int i;
		int j;
		int p = 0;
		while (scanf("%s",a) != EOF)
		{

			System.out.printf("%s\n",a);
			l = a.length();
			for (i = 0;i < l;i++)
			{
				p = 0;
				if (a.charAt(i) == '(')
				{
					for (j = i;j < l;j++)
					{
						if (a.charAt(j) == '(')
						{
							p++;
						}
						if (a.charAt(j) == ')')
						{
							p--;
						}
						if (p == 0)
						{
							break;
						}
					}
					if (p != 0)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '$');
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
					}
				}
			}
			for (i = l - 1;i >= 0;i--)
			{
				p = 0;
				if (a.charAt(i) == ')')
				{

					for (j = i;j >= 0;j--)
					{

						if (a.charAt(j) == ')')
						{
							p++;
						}
						if (a.charAt(j) == ' ')
						{
							p--;
						}
						if (p == 0)
						{
							break;
						}
					}
					if (p != 0)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '?');
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
					}
				}
			}
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) != '?' && a.charAt(i) != '$')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
			}


			System.out.println(a);
		}
		return 0;
	}
}


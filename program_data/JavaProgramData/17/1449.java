package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String a = new String(new char[101]);
		int l;
		int i;
		int j;
		int n;
	while (scanf("%s",a) != EOF)
	{

		l = a.length();
		System.out.println(a);
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != '(' && a.charAt(i) != ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
			else
			{
				if (a.charAt(i) == ')')
				{
					n = 0;
					for (j = i - 1;j >= 0;j--)
					{
						if (a.charAt(j) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, j, ' ');
							n++;
							break;
						}
					}
					if (n == 0)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '?');
					}
				}
			}
		}
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == '(')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '$');
			}
		}
		System.out.println(a);
	}
		return 0;
	}

}


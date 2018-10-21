String s1 = new String(new char[101]);
String s2 = new String(new char[101]);
int f = int;

int main()
{
	while (scanf("%s",s1) != EOF)
	{
		f(0);
		System.out.print(s1);
		System.out.print("\n");
		System.out.print(s2);
		System.out.print("\n");
	}
	return 0;
}

int f(int k)
{
	if (s1.charAt(k) == '\0')
	{
		s2 = tangible.StringFunctions.changeCharacter(s2, k, '\0');
		return 0;
	}

	if (s1.charAt(k) == ')')
	{
		s2 = tangible.StringFunctions.changeCharacter(s2, k, '?');
		f(k + 1);
		return 0;
	}

	if (s1.charAt(k) == '(')
	{
		for (int i = k + 1;i > 0;i++)
		{
			if (s1.charAt(i) == '\0')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, '\0');
				i = -1;
			}

			else if (s1.charAt(i) == '(')
			{
				i = f(i);
			}

			else if (s1.charAt(i) == ')')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, k, ' ');
				s2 = tangible.StringFunctions.changeCharacter(s2, i, ' ');
				f(i + 1);
				return i;
			}

			else
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, ' ');
			}
		}
		s2 = tangible.StringFunctions.changeCharacter(s2, k, '$');
		return -1;
	}

	s2 = tangible.StringFunctions.changeCharacter(s2, k, ' ');
	f(k + 1);
	return 0;
}


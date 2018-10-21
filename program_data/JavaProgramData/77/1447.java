String a = new String(new char[1000]);
int match = new int(char,char);
int main()
{
	char b;
	char g;
	int i;
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = a.charAt(0);
	for (i = 0; i <= 999; i++)
	{
		if (a.charAt(i) != b)
		{
			g = a.charAt(i);
			break;
		}
	}
	match(b, g);
	return 0;
}

int match(char b, char g)
{
	int i;
	int j;
	for (i = 0; a.charAt(i) != '\0'; i++)
	{
		if (a.charAt(i) == g)
		{
			break;
		}
	}
	if (a.charAt(i) == '\0')
	{
		return 0;
	}
	for (j = i; j >= 0; j--)
	{
		if (a.charAt(j) == b)
		{
			System.out.print(j);
			System.out.print(' ');
			System.out.print(i);
			System.out.print("\n");
				break;
		}
	}
	a = tangible.StringFunctions.changeCharacter(a, j, '*');
	a = tangible.StringFunctions.changeCharacter(a, i, '*');
	match(b,g);
}


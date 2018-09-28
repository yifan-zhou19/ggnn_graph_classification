int f = (char)num[];
int main()
{
	int len;
	int i;
	int j;
	int k;
	String str = new String(new char[500]);
	String real = new String(new char[500]);
	str = ConsoleInput.readToWhiteSpace(true).charAt(0);
	len = str.length();
	for (i = 2 ; i <= len ; i++)
	{
		for (j = 0 ; j < len - i + 1 ; j++)
		{
				for (k = 0 ; k < i ; k++)
				{
					real = tangible.StringFunctions.changeCharacter(real, k, str.charAt(j + k));
				}
				real = tangible.StringFunctions.changeCharacter(real, i, '\0');
				if (f(real))
				{
					System.out.print(real);
					System.out.print("\n");
				}
		}
	}
	return 0;
}
int f((char)num[])
{
	int len;
	int i;
	String another = new String(new char[500]);
	len = num.length();
	for (i = 0 ; i < len ; i++)
	{
		another = tangible.StringFunctions.changeCharacter(another, i, num[len - 1 - i]);
	}
	another = tangible.StringFunctions.changeCharacter(another, len, '\0');
	if (strcmp(another,num) == 0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}


int reverse = char * ;
int main(int argc, char * argv[])
{
	int i;
	char[][] a = new char[6][10];
	for (i = 0;i < 6;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = tempVar.charAt(0);
		}
	}
	for (i = 0;i < 6;i++)
	{
		System.out.printf("%d\n",reverse(a[i]));
	}
	return 0;
}
int reverse(char * n)
{
	String a = new String(new char[10]);
	String b = new String(new char[10]);
	String c = new String(new char[10]);
	int m;
	int i;
	a = n;
	m = a.length();
	for (i = 0;i < m;i++)
	{
		b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(m - i - 1));
	}
	b = tangible.StringFunctions.changeCharacter(b, m, '\0');
	if (b.charAt(m - 1) == '-')
	{
		c = tangible.StringFunctions.changeCharacter(c, 0, '-');
		for (i = 1;i < m;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, b.charAt(i - 1));
		}
		c = tangible.StringFunctions.changeCharacter(c, m, '\0');
	}
	else
	{
		c = b;
	}
	return Integer.parseInt(c);
}


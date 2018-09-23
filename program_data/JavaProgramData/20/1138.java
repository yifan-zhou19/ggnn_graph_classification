int findmax = new int(char [],int);
int main()
{
	int i;
	int len;
	int k;
	int j;
	final String str = "";
	final String substr = "";
	while (scanf("%s %s",str,substr) != EOF)
	{
		len = str.length();
		i = findmax(str,len);
		for (j = len - 1;j > i;j--)
		{
			str = tangible.StringFunctions.changeCharacter(str, j + 3, str.charAt(j));
		}
		for (j = i + 1,k = 0;j < i + 4;j++,k++)
		{
			str = tangible.StringFunctions.changeCharacter(str, j, substr.charAt(k));
		}
		System.out.printf("%s\n",str);
		for (i = 0;i < 15;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '\0');
		}
		for (i = 0;i < 4;i++)
		{
			substr = tangible.StringFunctions.changeCharacter(substr, i, '\0');
		}
	}
	return 0;
}
int findmax(char str[],int len)
{
	int i;
	char t;
	t = str[0];
	for (i = 0;i < len - 1;i++)
	{
		if (t < str[i + 1])
		{
			t = str[i + 1];
		}
	}
	for (i = 0;i < len;i++)
	{
		if (str[i] == t)
		{
			return i;
		}
	}
}


void convert(char *);
int main()
{
	String str1 = new String(new char[85]);
	String str2 = new String(new char[85]);
	int result;
	str1 = new Scanner(System.in).nextLine();
	str2 = new Scanner(System.in).nextLine();
	convert(str1);
	convert(str2);
	result = strcmp(str1,str2);
	if (result == 0)
	{
		System.out.print('=');
	}
	else
	{
		if (result > 0)
		{
			System.out.print('>');
		}
		else
		{
			System.out.print('<');
		}
	}
	return 0;
}
void convert(char * p)
{
	while (*p)
	{
		if (*p >= 'A' && *p <= 'Z')
		{
			*p += 32;
		}
		p++;
	}
}

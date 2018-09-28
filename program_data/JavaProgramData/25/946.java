//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *mul(char *, char *);
char mul = new char(char *, char *);

int main()
{
	final String str1 = "1";
	String str2 = new String(new char[100000]);
	int n;
	int i;
	int length = str2.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * q = str1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p = str2;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
		q = str1;
		p = mul(str1, str2);
		p--;
		for (; p >= str2; p--)
		{
			*q = p;
			q++;
		}
	}
	System.out.print(str1);
	System.out.print("\n");
	return 0;
}
char * mul(char * num, char * str2)
{
	int length = num.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * q;
	p = num + length - 1;
	q = str2;
	int i;
	int n = 0;
	int m = 0;
	int k = 0;
	for (i = 0; i < length; i++)
	{
		n = p - '0';
		n = n * 2 + m;
		k = n % 10;
		m = n / 10;
		*q = k + '0';
		if (i != length - 1)
		{
			p--;
		}
		q++;
	}
	if (m != 0)
	{
		*q = m + '0';
		q++;
	}
	*q = '\0';
	return q;
}


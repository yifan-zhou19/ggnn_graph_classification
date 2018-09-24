void increase(char []);
int main()
{
	int N;
	int sum = 0;
	int i;
	int j;
	String num = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(num, '\0',100);
	num = tangible.StringFunctions.changeCharacter(num, 0, '1');
	N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < N; i++)
	{
		increase(num);
	}
	i = 0;
	while (num.charAt(i) != '\0')
	{
		++i;
	}
	for (j = i - 1; j >= 0; j--)
	{
		System.out.print(num.charAt(j));
	}
	return 0;
}
int mid = 0;
void increase(char num[100])
{
	int n = 0;
	while (num[n] != '\0' || mid != 0)
	{
		if (num[n] != '\0')
		{
		mid += (num[n] - '0') * 2;
		}
		if (mid < 10)
		{
			num[n] = mid + '0';
			mid = 0;
		}
		else
		{
			num[n] = mid % 10 + '0';
			mid = 1;
		}
		++n;
	}
}


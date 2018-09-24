int power = new int(int,int);
int main()
{
	String number1 = new String(new char[100]);
	String number2 = new String(new char[100]);
	int i;
	int first;
	int second;
	int ten = 0;
	int l1;
	int l2 = 0;
	int remain;
	first = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.in.read();
	cin.getline(number1,100,' ');
	second = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	l1 = number1.length();
	for (i = 0;i < l1;i++)
	{
		if (number1.charAt(i) >= 'a' && number1.charAt(i) <= 'z')
		{
			ten = (number1.charAt(i) - 'a' + 10) * (int)(power(first,l1 - i - 1)) + ten;
		}
		if (number1.charAt(i) >= 'A' && number1.charAt(i) <= 'Z')
		{
			ten = (number1.charAt(i) - 'A' + 10) * (int)(power(first,l1 - i - 1)) + ten;
		}
		if (number1.charAt(i) >= '0' && number1.charAt(i) <= '9')
		{
			ten = (number1.charAt(i) - '0') * (int)(power(first,l1 - i - 1)) + ten;
		}
	} //??????
	remain = ten;
	while (remain != 0)
	{
		remain = remain / second;
		l2++;
	}
	if (ten == 0)
	{
		l2 = 1;
	}
	for (i = 0;i < l2;i++)
	{
		number2 = tangible.StringFunctions.changeCharacter(number2, i, ten / (int)(power(second,l2 - i - 1)));
		ten = ten - number2.charAt(i) * (int)(power(second,l2 - i - 1));
		if (number2.charAt(i) >= 10)
		{
			number2 = tangible.StringFunctions.changeCharacter(number2, i, number2.charAt(i) - 10 + 'A');
		}
		else
		{
			number2 = tangible.StringFunctions.changeCharacter(number2, i, number2.charAt(i) + '0');
		}
	}
	number2 = tangible.StringFunctions.changeCharacter(number2, l2, '\0');
	System.out.print(number2);
	System.out.print("\n");
	return 0;
}
int power(int a,int b)
{
	int i;
	int sum = 1;
	for (i = 1; i <= b; i++)
	{
		sum = sum * a;
	}
	return sum;
}



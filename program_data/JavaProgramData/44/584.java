int reverse = int;
int main()
{
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int num6;
	num1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	num2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	num3 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	num4 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	num5 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	num6 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(reverse(num1));
	System.out.print("\n");
	System.out.print(reverse(num2));
	System.out.print("\n");
	System.out.print(reverse(num3));
	System.out.print("\n");
	System.out.print(reverse(num4));
	System.out.print("\n");
	System.out.print(reverse(num5));
	System.out.print("\n");
	System.out.print(reverse(num6));
	System.out.print("\n");
	return 0;
}
int reverse(int num)
{
	int sum = 0;
	while (num)
	{
		sum = sum * 10 + num % 10;
		num = num / 10;
	}

	return sum;
}



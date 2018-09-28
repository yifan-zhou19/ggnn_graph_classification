int pan = int;
int main()
{
	int a;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (a != 1)
	{
		a = pan(a);
	}
	System.out.print("End");
	return 0;
}
int pan(int a)
{
	int b;
	if (a % 2 == 0)
	{
		b = a / 2;
		System.out.print(a);
		System.out.print("/2=");
		System.out.print(b);
		System.out.print("\n");
	}
	else
	{
		b = a * 3 + 1;
		System.out.print(a);
		System.out.print("*3+1=");
		System.out.print(b);
		System.out.print("\n");
	}
	return b;
}




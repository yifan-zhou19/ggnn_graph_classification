void d(int);
int main()
{
	int a;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d(a);
	return 0;
}
void d(int a)
{
	while (a != 1)
	{
		if (a % 2 == 0)
		{
			System.out.print(a);
			System.out.print("/2=");
			System.out.print(a / 2);
			System.out.print('\n');
			a = a / 2;
		}
		else
		{
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print(a * 3 + 1);
			System.out.print('\n');
			a = a * 3 + 1;
		}
	}
	System.out.print("End");
	System.out.print("\n");
}



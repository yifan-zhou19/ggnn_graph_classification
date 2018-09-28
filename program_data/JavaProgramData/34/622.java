// ????.cpp : ??????????????
//



void out(int);

int main()
{
	int n = 0;

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	out(n);

	return 0;
}


void out(int n)
{
	if (n == 1)
	{
		System.out.print("End");
		System.out.print("\n");
	}
	else
	{
		if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/");
			System.out.print(2);
			System.out.print("=");
			System.out.print(n / 2);
			System.out.print("\n");
			out(n / 2);
		}
		if (n % 2 != 0)
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(3 * n + 1);
			System.out.print("\n");
			out(3 * n + 1);
		}
	}

}



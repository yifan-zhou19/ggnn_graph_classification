int f = int; //????
int g = int;

int main()
{
	int n;
	int result;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 1) //???????1?????End
	{
		System.out.print("End");
		System.out.print("\n");
	}
	else //????????1
	{
		do
		{
			if (n % 2 != 0) //???????3?1
			{
				result = f(n);
				System.out.print(n);
				System.out.print("*");
				System.out.print(3);
				System.out.print("+");
				System.out.print(1);
				System.out.print("=");
				System.out.print(result);
				System.out.print("\n");
			}
			else //????????2
			{
				result = g(n);
				System.out.print(n);
				System.out.print("/");
				System.out.print(2);
				System.out.print("=");
				System.out.print(result);
				System.out.print("\n");
			}
			n = result; //????????1
		}while (n != 1);
		System.out.print("End");
		System.out.print("\n");
	}

	return 0;
}

int f(int a)
{
	int m;
	m = a * 3 + 1; //?3?1

	return m;
}

int g(int a)
{
	int m;
	m = a / 2; //??2

	return m;
}



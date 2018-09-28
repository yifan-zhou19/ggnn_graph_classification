int reverse = int;
int main()
{
	int i;
	int x;
	for (i = 1;i <= 6;i++) //???6???
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		reverse(x);
		System.out.print("\n");
	}
	return 0;
}

int reverse(int x) //??????
{
	int i;
	int y = 0;
	if (x == 0)
	{
		System.out.print(x);
	}
	if (x > 0)
	{

		for (i = 0;x > 0;i++) //??????????????0
		{
			if (x % 10 != 0 || y != 0)
			{
				System.out.print(x % 10);
				y = 1;
			}
			x = x / 10;
		}
	}
	if (x < 0) //???????????????????????
	{
		System.out.print("-");
		for (i = 0; - x > 0;i++)
		{
			if (x % 10 != 0 || y != 0)
			{
				System.out.print((-x) % 10);
				y = 1;
			}
			x = x / 10;
		}
	}
	return 0;
}









int fenjie = new int(int,int);

int main()
{
	int times;
	int k;
	int num;
	times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (k = 1;k <= times;k++)
	{
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(fenjie(num,1));
		System.out.print("\n");
	}

	return 0;
}

int fenjie(int x,int y)
{
	int i;
	int a = 1;
	if (x < y)
	{
		return 0;
	}
	if (x == y)
	{
		return 1;
	}
	if (x > y)
	{
		if (y == 1)
		{
			for (i = y + 1;i <= x;i++)
			{
				if (x % i == 0)
				{
					a = a + fenjie(x / i,i);
				}
			}
		}
		else
		{
			for (i = y;i <= x;i++)
			{
				if (x % i == 0)
				{
					a = a + fenjie(x / i,i);
				}
			}
		}
		return a;
	}

}



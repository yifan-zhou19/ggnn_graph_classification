int step = new int(int,int);
int main()
{
	int x;
	int y;
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(step(x,y));
	System.out.print("\n");
}
int step(int a, int b)
{
	if (a > b)
	{
		if (a % 2 == 0)
		{
			return step(a / 2, b);
		}
		else
		{
			return step((a - 1) / 2, b);
		}
	}
	else if (a < b)
	{
		if (b % 2 == 0)
		{
			return step(a, b / 2);
		}
		else
		{
			return step(a, (b - 1) / 2);
		}
	}
	else
	{
		return a;
	}
}


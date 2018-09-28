int apple = new int(int,int);
int main()
{
	int t;
	int n;
	int m;
	int i;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < t;i++)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(apple(m,n));
		System.out.print("\n");
	}
	return 0;
}
	int apple(int x,int y) //????
	{
		int number;
		if (x > y && y != 1)
		{
			number = apple(x - y,y) + apple(x,y - 1); //??
		}
		if (x <= y && x != 1)
		{
			number = 1 + apple(x,x - 1); //??
		}
		if (x == 1)
		{
			return 1; //??
		}
		if (y == 1)
		{
			return 1; //??
		}
		else
		{
			return number;
		}
	}



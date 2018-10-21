int c = new int(int, int);
int main()
{
	int a;
	int b;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(c(a,b));
	System.out.print("\n");
	return 0;
}
int c(int x, int y)
{
	if (x % y == 0)
	{
		return y;
	}
	if (x > y)
	{
		return c(x / 2,y);
	}
	if (x < y)
	{
		return c(x,y / 2);
	}
}


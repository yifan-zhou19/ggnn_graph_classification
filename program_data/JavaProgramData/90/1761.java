int way = new int(int,int);
int main()
{
	int n;
	int[] t = new int[2];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n-- != 0)
	{
		t[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(way(t[0],t[1]));
		System.out.print("\n");
	}
}
int way(int a,int b)
{
	if (b == 1 || a == 1 || a == 0)
	{
		return 1;
	}
	if (a >= b)
	{
		return way(a, b - 1) + way(a - b, b);
	}
	if (a < b)
	{
		return way(a, a);
	}
}


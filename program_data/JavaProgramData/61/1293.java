void xun(int);
int main()
{
	int n;
	int a;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		xun(a);
	}
	return 0;
}
void xun(int a)
{
	int i;
	int b = 1;
	int c = 1;
	int d;
	if (a == 1 || a == 2)
	{
		System.out.print("1");
		System.out.print("\n");
	}
	else
	{
		a--;
		for (i = 1; i < a; i++)
		{
			d = b;
			b = b + c;
			c = d;
		}
		System.out.print(b);
		System.out.print("\n");
	}
	return;
}


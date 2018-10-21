int s = new int(int, int);
int main()
{
	int n;
	int i;
	int a;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(s(a, 2));
		System.out.print("\n");
	}
	return 0;
}
int s(int a, int b)
{
	int i;
	int t = 0;
	for (i = b;i < a;i++)
	{
		if (a % i == 0 && a / i >= i) // ????????????????
		{
			t = t + s(a / i, i); // ????????????
		}
	}
	return t + 1;
}


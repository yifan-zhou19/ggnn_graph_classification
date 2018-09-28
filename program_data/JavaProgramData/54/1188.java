int origin = new int(int, int);
int n;
int k;
int main()
{
	int last = 1;
	int x;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while ((x = origin(last * n + k, n)) == 0)
	{
		last++;
	}
	System.out.print(x);
	return 0;
}
int origin(int left, int num)
{
	if (num == 1)
	{
		return left;
	}
	else if (left % (n - 1) == 0)
	{
		return origin(left / (n - 1) * n + k, num - 1);
	}
	else
	{
		return 0;
	}
}



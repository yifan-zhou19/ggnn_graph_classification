int count = new int(int,int);
int main()
{

	int num;
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < num;i++)
	{
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(count(m,n));
			System.out.print("\n");
	}
	return 0;
}
int count(int m,int n)
{
	if (n == 1 || m == 0)
	{
		return 1;
	}
	if (n > m)
	{
		return count(m,m);
	}
	return count(m,n - 1) + count(m - n,n);
}


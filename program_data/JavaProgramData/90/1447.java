int an = new int(int,int);
int main()
{
	int m;
	int n;
	int t;
	int i;
	int j;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	if (t > 0)
	{
		for (i = 0;i < t;i++)
		{
			  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  System.out.print(an(m,n));
			  System.out.print("\n");
		}
	}
	return 0;
}


int an(int m,int n)
{
	if ((m == 0) || (n == 1))
	{
		return 1;
	}

	if (m >= n)
	{
		return an(m - n,n) + an(m,n - 1);
	}
	else
	{
		return an(m,n - 1);
	}
}


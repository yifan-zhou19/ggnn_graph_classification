int[] a = new int[100];
int l;
void count(int);
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 0)
	{
		System.out.print("1");
		System.out.print("\n");
	}
	else
	{
		if (n == 1)
		{
			System.out.print("2");
			System.out.print("\n");
		}
		else
		{
			a[0] = 2;
			count(n - 1);
			l = 99;
			while (a[l] == 0)
			{
				l--;
			}
			for (;l >= 0;l--)
			{
				System.out.print(a[l]);
			}
			System.out.print("\n");
		}
	}
	return 0;
}
void count(int n)
{
	int i;
	if (n == 0)
	{
		return;
	}
	else
	{
		for (i = 0;i < 99;i++)
		{
			a[i] = a[i] * 2;
		}
		for (i = 0;i < 99;i++)
		{
			if (a[i] >= 10)
			{
				a[i + 1] += a[i] / 10;
				a[i] = a[i] % 10;
			}
		}
	}
	count(n - 1);
}




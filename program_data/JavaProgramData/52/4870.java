void change(int *,int *);
int main()
{
	int[] a = new int[999];
	int n;
	int m;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

	change(a, a + n - 1);
	change(a, a + m - 1);
	change(a + m,a + n - 1);


	for (i = 0;i < n;i++)
	{
		if (i == n - 1)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		}
		else
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
	}
	return 0;
}


void change(int * a,int * b)
{
	int t;
	for (;a < b;a++,b--)
	{
		t = a;
		*a = *b;
		*b = t;
	}
}


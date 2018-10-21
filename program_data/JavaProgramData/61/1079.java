int F = new int(int,int);
int F(int a, int b)
{
	int c = a + b;
	a = b;
	b = c;
	return b;
}


int main()
{
	int n;
	int i;
	int j;
	int[] x = new int[101];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1 ; i <= n ; i++)
	{
		x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x[i] == 1)
		{
			System.out.print("1");
			System.out.print("\n");
			continue;
		}
		if (x[i] == 2)
		{
			System.out.print("1");
			System.out.print("\n");
			continue;
		}
		int a = 1;
		int t;
		int b = 1;
		int sum = 2;
		do
		{
			t = b;
			b = F(a,b);
			a = t;
			sum++;
		}while (sum < x[i]);
		System.out.print(b);
		System.out.print("\n");
	}
}


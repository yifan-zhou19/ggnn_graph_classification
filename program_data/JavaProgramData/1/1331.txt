void count(int, int);
int k;

int main()
{
	int n;
	int i;
	int j;
	int m;
	int num;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
		k = 0;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Math.sqrt(num) + 1;
		for (j = 2; j < m; j++)
		{
			if (num % j == 0)
			{
				k++;
				count(num / j, j);
			}
		}
		System.out.print(k + 1);
		System.out.print("\n");
	}
	return 0;
}
void count(int num, int i)
{
	int j;
	int n = Math.sqrt(num);
	for (j = i; j <= n; j++)
	{
		if (num % j == 0)
		{
			k++;
			count((num / j), j);
		}
	}
}


int[] a = new int[1000];
int sum = 1;
void mi(int);
int main()
{
	int n;
	int i;
	int j = 1;
	a[0] = 4;
	a[1] = 2;
	a[2] = 0;
	a[3] = 1;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 0)
	{
		System.out.print(1);
		System.out.print("\n");
	}
	else if (n <= 10)
	{
		for (i = 0;i < n;i++)
		{
			j *= 2;
		}
		System.out.print(j);
		System.out.print("\n");
	}
	else
	{
		mi(n - 10);
	}
	return 0;
}
void mi(int n)
{
	int i;
	int j;
	int len = 0;
	if (n == 0)
	{
		for (i = 999;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		for (j = i;j >= 0;j--)
		{
			System.out.print(a[j]);
		}
	}
	else
	{
		for (len = 999;len >= 0;len--)
		{
			if (a[len] != 0)
			{
				break;
			}
		}
		for (i = 0;i <= len;i++)
		{
			a[i] *= 2;
		}
		for (i = 0;i <= len;i++) //????????????????
		{
			if (a[i] > 9)
			{
				a[i + 1]++;
				a[i] -= 10;
			}
		}
		mi(n - 1);
	}
}


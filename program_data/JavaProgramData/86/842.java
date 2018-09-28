int s = int;
int main()
{
	int n;
	int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n-- != 0)
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(s(k));
		System.out.print("\n");
	}
	return 0;
}
int s(int k)
{
	int i;
	int j;
	int[] a = new int[15];
	int total = 0;
	for (i = 0; i <= k - 1; i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	int t = 0;
	for (i = 0; i <= k - 1; i++)
	{
		if (t < 60)
		{
			t = a[i] + 3 * (i + 1);
		}
		else
		{
			break;
		}
	}
	j = i - 1;
	if (t <= 60) //t<=60????????????
	{
		total = 60 - 3 * (j + 1);
	}
	else
	{
		if (a[j] + 3 * j > 63)
		{
			total = 60 - 3 * j;
		}
		else
		{
			total = a[j];
		}
	}
	return total;
}


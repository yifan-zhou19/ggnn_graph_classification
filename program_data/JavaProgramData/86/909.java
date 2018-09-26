int num = new int(int [], int);
int main()
{
	int n;

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (int i = 0; i < n; i++)
	{
		int m;
		int[] count = new int[100];

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m == 0)
		{
			System.out.print("60");
			System.out.print("\n");
		}
		else
		{
			for (int j = 0; j < m; j++)
			{
				count[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			System.out.print(num(count, m));
			System.out.print("\n");
		}
	}

	return 0;
}

int num(int count[], int n)
{
	int i = 0;
	if (count[n - 1] + 3 * n <= 60)
	{
		return 60 - n * 3;
	}
	else if ((count[n - 1] + 3 * n) > 60 && (count[n - 1] + 3 * n) <= 63)
	{
		return count[n - 1];
	}
	else
	{
		while ((count[i] + 3 * i) <= 60)
		{
			i++;
		}
		return num(count, i);
	}
}


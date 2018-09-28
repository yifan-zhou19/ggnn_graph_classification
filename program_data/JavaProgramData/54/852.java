int fei = int;
int main()
{
	int n;
	int k;
	int flag = 0;
	int a = 1;
	int i;
	int sum = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (flag == 0)
	{
		sum = n * a + k;
		for (i = 2;i <= n;i++)
		{
			if (sum % (n - 1) != 0)
			{
				break;
			}
			else
			{
				sum = sum / (n - 1) * n + k;
			}
		}
		if (i == n + 1)
		{
			System.out.print(sum);
			System.out.print("\n");
			flag = 1;
		}
		a++;
	}
	return 0;
}


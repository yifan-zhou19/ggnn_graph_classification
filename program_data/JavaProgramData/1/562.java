int disassamble = new int(int, int);
int main()
{
	int n;
	int i = 1;
	int a;
	int result;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (i <= n)
	{
			i++;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			result = disassamble(a, 2);
			System.out.print(result);
			System.out.print("\n");
	}

	return 0;
}
int disassamble(int a, int y)
{
	int i;
	int count = 1;
	if (a == 1)
	{
		 return 0;
	}
	if (a == 2)
	{
		 return 1;
	}
	for (i = y; i * i <= a; i++)
	{
		  if (a % i == 0)
		  {
				count = disassamble(a / i, i) + count;
		  }
	}
	return count;
}


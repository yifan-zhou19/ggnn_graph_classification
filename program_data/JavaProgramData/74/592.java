int huiwen = int;

int zhishu = int;

int main(int argc, char * argv[])
{
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	int i;
	int first = 1;
	int flag = 1;
	for (i = m;i <= n;i++)
	{
		if (huiwen(i) && zhishu(i))
		{
			if (first != 0)
			{
				System.out.printf("%d",i);
				first = 0;
			}
			else
			{
				System.out.printf(",%d",i);
			}
			flag = 0;
		}
	}
	if (flag != 0)
	{
		System.out.print("no");
	}

	return 0;
}

int zhishu(int n)
{
	int c;
	for (c = 2;c < n;c++)
	{
		if (n % c == 0)
		{
			return 0;
		}
	}
	return 1;
}

int huiwen(int n)
{
	int s = n;
	int j = 0;
	while (s > 0)
	{
		j = j * 10 + s % 10;
		s /= 10;
	}
	if (n == j)
	{
		return 1;
	}
	return 0;
}



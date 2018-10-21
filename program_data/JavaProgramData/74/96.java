int zhi = int;
int hui = int;
void main()
{
	int m;
	int n;
	int p;
	int w = 0;
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
	for (p = m;p <= n;p++)
	{
		if (zhi(p) && hui(p))
		{
			if (w == 0)
			{
				System.out.printf("%d",p),w++;
			}
			else
			{
				System.out.printf(",%d",p);
			}
		}
	}
	if (w == 0)
	{
		System.out.print("no");
	}
	System.out.print('\n');
}
int zhi(int p)
{
	int i;
	int z = 0;
	if (p == 1)
	{
		z = 0;
	}
	else if (p == 2)
	{
		z = 1;
	}
	else
	{
		for (i = 2;i <= p;i++)
		{
			if (p % i == 0)
			{
				break;
			}
		}
		if (p == i)
		{
			z = 1;
		}
	}
	return z;
}
int hui(int p)
{
	int n = p;
	int sum = 0;
	while (n / 10 > 0)
	{
		sum = sum * 10 + n % 10;
		n /= 10;
	}
	sum = sum * 10 + n;
	if (sum == p)
	{
		return (1);
	}
	else
	{
		return (0);
	}
}


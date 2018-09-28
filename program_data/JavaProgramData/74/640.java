int jiaohuan = int;
int ss = int;
int main()
{
	int n;
	int m;
	int c = 0;
	int i;
	int[] h = new int[q];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = n;i <= m;i++)
	{
		if (jiaohuan(i) == i && ss(i))
		{
			h[c] = i;
			c++;
		}
	}
	if (c == 0)
	{
		System.out.print("no\n");
	}
	else
	{
		for (i = 0;i < c;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",h[i]);
			}
			else
			{
				System.out.printf(",%d",h[i]);
			}
		}
		System.out.print("\n");
	}

	return 0;
}



int jiaohuan(int a)
{
	int[] h = new int[w];
	int i;
	int c = 0;
	for (i = 0;i < w;i++)
	{
		h[i] = a % 10;
		a = a / 10;
		c++;
		if (a == 0)
		{
			break;
		}
	}
	for (i = 0;i < c;i++)
	{
		a = a + h[i] * (int)Math.pow(10,c - i - 1);
	}
	return a;
}
int ss(int b)
{
	int i = 2;
	while (b % i != 0)
	{
		i++;
	}
	if (i == b)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}





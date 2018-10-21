int huiwen = int;
int sushu = int;
int main()
{
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	int i;
	int k;
	int[] sz = new int[(n - m)];
	k = 0;
	for (i = m;i <= n;i++)
	{
		if (huiwen(i))
		{
			if (sushu(i))
			{
			sz[k] = i;
			k++;
			}
		}
	}
	if (k == 0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.printf("%d",sz[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(",%d",sz[i]);
		}
	}
	return 0;
}
int huiwen(int x)
{
	int z = 0;
	int y;
	int[] wei = new int[10];
	for (y = x;y > 0;y = y / 10)
	{
		wei[z] = y % 10;
		z++;
	}
	for (y = 0;y < z / 2;y++)
	{
		if (wei[y] != wei[z - 1 - y])
		{
			return 0;
		}
	}
	return 1;
}
int sushu(int w)
{
	if (w == 2)
	{
		return 1;
	}
	int u;
	int v = 0;
	for (u = 2;u < w;u++)
	{
		if (w % u == 0)
		{
			v++;
		}
	}
	if (v == 0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}


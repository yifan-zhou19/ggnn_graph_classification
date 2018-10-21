int func = n;
int funk = n;
void main()
{
	int a;
	int b;
	int k;
	int j;
	int i;
	int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = a;i <= b;i++)
	{
		k = func(i);
		j = funk(i);
		if (k == 1 && j == 1 && t == 0)
		{
			t = 1;
			System.out.printf("%d",i);
			continue;
		}
		if (k == 1 && j == 1 && t == 1)
		{
			System.out.printf(",%d",i);
		}
	}
	if (t == 0)
	{
		System.out.print("no");
	}
}
int func(n)
{
	int i;
	int j = 9;
	int k = 1;
	int[] a = new int[10];
	for (i = 0;i < 10;i++)
	{
		a[i] = n % 10;
		n = n / 10;
	}
	for (i = 9;;i--)
	{
		if (a[i] != 0)
		{
			j = i;
			break;
		}
	}
	for (i = 0;i <= j;i++)
	{
		if (a[i] != a[j - i])
		{
			k = 0;
			;
			break;
		}
	}
	return (k);
}
int funk(n)
{
	int i;
	int j = 1;
	for (i = 2;i < Math.sqrt(n) + 1;i++)
	{
		if (n % i == 0)
		{
			j = 0;
			break;
		}
	}
	return (j);
}




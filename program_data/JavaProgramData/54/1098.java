int f_1 = int;
int f_2 = new int(int,int);

int main()
{
	int n;
	int k;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	if (f_1(n - 1) > k)
	{
		m = f_1(n) - f_2(n,k);
	}
	else
	{
		m = f_1(n) * n - f_2(n,k);
	}
	System.out.printf("%d\n",m);
	return 0;
}

int f_1(int n)
{
	int i;
	int output = 1;
	for (i = 0;i < n;i++)
	{
		output *= n;
	}
	return output;
}

int f_2(int n,int k)
{
	int output;
	output = (n - 1) * k;
	return output;
}


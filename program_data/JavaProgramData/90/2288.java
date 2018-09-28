int full = new int(int,int);
int empty = new int(int,int);
int apple = new int(int,int);

int apple(int m,int n)
{
	return full(m,n) + empty(m,n);
}


int full(int m,int n)
{
	if (m == n)
	{
		return 1;
	}
	else if (m < n)
	{
		return 0;
	}
	else
	{
		return apple(m - n,n);
	}
}

int empty(int m,int n)
{
	if (n <= 1)
	{
		return 0;
	}
	else if (m < 1)
	{
		return 0;
	}
	else if (m == 1)
	{
		return 1;
	}
	else
	{
		return apple(m,n - 1);
	}
}
//i love you

int main()
{
	//printf("%d",apple(7,3));
	int t;
	int i;
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	for (i = 0;i < t;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d\n",apple(m,n));
	}
	//return 0;
}


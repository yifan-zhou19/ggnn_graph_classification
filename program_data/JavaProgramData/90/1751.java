int method = new int(int,int);
int main()
{
	int n;
	int[] M = new int[20];
	int[] N = new int[20];
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			M[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			N[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		System.out.printf("%d\n",method(M[i],N[i]));
	}
	return 0;
}
int method(int M,int N)
{
	int j = 0;
	if (M < 0)
	{
		j = 0;
	}
	else if (M == 0)
	{
		j = 1;
	}
	else if (N == 1)
	{
		j = 1;
	}
	else
	{
		j = method(M - N,N) + method(M,N - 1);
	}
	return j;
}




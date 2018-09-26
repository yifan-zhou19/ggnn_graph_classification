int F = int;
void main()
{
	int i;
	int n;
	int f1;
	int k;
	int f2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (k = 6;k <= n;k = k + 2)
	{
		for (i = 2;i < n;i++)
		{
			f1 = F(i);
			f2 = F(k - i);
			 if (f1 != 0 && f2 != 0)
			 {
				System.out.printf("%d=%d+%d\n",k,i,k - i);
				break;
			 }
		}
	}
}
int F(int t)
{
	int i;
	int p = 1;
	for (i = 2;i <= Math.sqrt(t);i++)
	{
		if (t % i == 0)
		{
			p = 0;
			break;
		}
	}
	return p;
}



int fun = int;
void main()
{
	int i;
	int n;
	int a;
	int j;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 6;j <= n;j += 2)
	{
		for (i = 2;;i++)
		{
			a = fun(i);
			b = fun(j - i);
			 if (a != 0 && b != 0)
			 {
				System.out.printf("%d=%d+%d\n",j,i,j - i);
				break;
			 }
		}
	}
}
int fun(int t)
{
	int i;
	int p = 1;
	for (i = 2;i <= (int)Math.sqrt(t);i++)
	{
		if (t % i == 0)
		{
			p = 0;
			break;
		}
	}
	return p;
}



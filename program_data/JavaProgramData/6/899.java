void m(int,int);
int main()
{
	int a;
	int b;
	int c;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (i = 0;i < a;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		m(b,c);
	}
}
void m(int q,int w)
{
	int a;
	int i;
	int j;
	int sum;
	sum = 0;
	for (i = 1;i <= q;i++)
	{
		for (j = 1;j <= w;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			if (i == 1 || j == 1 || i == q || j == w)
			{
				sum += a;
			}
		}
	}
	System.out.printf("%ld\n",sum);
}



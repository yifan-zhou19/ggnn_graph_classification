void jiaohuan(int*,int*);
int main()
{
	int[] yuan = new int[101];
	int i;
	int n;
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
			(yuan[i]) = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n / 2;i++)
	{
		jiaohuan((yuan[i]), (yuan[n - 1 - i]));
	}
	for (i = 0;i < n - 1;i++)
	{
		System.out.printf("%d ",yuan[i]);
	}
	System.out.printf("%d",yuan[n - 1]);
	return 0;
}
void jiaohuan(int * a,int * b)
{
	int e = a;
		*a = *b;
		*b = e;
}


int a = new int(int,int);
int main()
{
	int x;
	int y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	System.out.printf("%d",a(Math.max(x,y),Math.min(x,y)));
}
int a(int m,int n)
{
	while (m > n)
	{
		m /= 2;
	}
	if (m == n)
	{
		return m;
	}
	else
	{
		return a(n,m);
	}
}



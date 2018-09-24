int find = new int(int,int);
int find(int x,int y)
{
	int a;
	if (x > y)
	{
		a = find(x / 2,y);
	}
	else if (x < y)
	{
		a = find(x,y / 2);
	}
	else
	{
		a = x;
	}
	return a;
}
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
	System.out.printf("%d",find(x,y));
	return 0;
}


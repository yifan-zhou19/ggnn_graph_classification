int find = new int(int,int);
int main()
{
	int ans;
	int x;
	int y;
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	ans = find(x,y);
	System.out.print(ans);
	System.out.print("\n");
	return 0;
}
int find(int x,int y)
{
	if (x == y)
	{
		return x;
	}
	if (x > y)
	{
		return find(y,x);
	}
	else
	{
		return find(x,y / 2);
	}
}



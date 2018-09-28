int divide = new int(int,int);
int main()
{
	int group;
	int platenum;
	int applenum;
	int i;
	group = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < group;i++)
	{
		applenum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		platenum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(divide(applenum,platenum));
		System.out.print("\n");
	}
	return 0;
}
int divide(int a,int p)
{
	if (a == 0)
	{
		return 1;
	}
	else if (p == 1)
	{
		return 1;
	}
	else if (a >= p)
	{
		return divide(a,p - 1) + divide(a - p,p);
	}
	else
	{
		return divide(a,p - 1);
	}
}



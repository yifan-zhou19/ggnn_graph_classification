void account(int,int);
int p;
int main()
{
	int m;
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n > 0)
	{
		p = 0;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
account(m,1);
System.out.print(p);
System.out.print("\n");
n--;
	}
return 0;
}
void account(int m,int i)
{
if (m == 1)
{
	p++;
}
else
{
	for (int j = 2;j <= m;j++)
	{
	if ((m % j == 0) && (j >= i))
	{
	 account(m / j,j);
	}
	}
}
}


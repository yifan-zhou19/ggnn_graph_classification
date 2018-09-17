void f(int,int);
int sum = 0;
int res = 1;
int main()
{
	int n;
	int a;
	int i;
	int j;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++) //n???
	{
		res = 1; //??????a=a
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 2;j <= (int)Math.sqrt((float)a);j++) //??????
		{
			if (a % j == 0)
			{
				sum = 0;
				f(a / j,j); //????????
				res += sum;
			}
		}
		System.out.print(res);
		System.out.print("\n");
	}
	return 0;
}
void f(int x,int y)
{
	if (x == 1)
	{
		sum++;
	}
	while (y <= x) //?????????????
	{
		if (x % y == 0)
		{
			f(x / y,y);
		}
		y++;
	}
	return;
}



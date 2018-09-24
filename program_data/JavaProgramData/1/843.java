int fenjie = new int(int,int);
int main()
{
	int i;
	int n;
	int t;
	int r;
	int num;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		r = fenjie(num,2);
		System.out.print(r);
		System.out.print("\n");
	}
	return 0;
}
int fenjie(int num,int min)
{
	int i;
	int j;
	int k;
	int r = 0;
	for (i = min;i <= num;i++)
	{
		if (num % i == 0)
		{
			r = r + fenjie(num / i,i);
		}
		if (i == num)
		{
			r++;
		}
	}
	return r;
}


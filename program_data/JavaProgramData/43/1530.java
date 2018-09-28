int judge = int;

int main()
{
	int num;
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int a = 2;a <= num / 2;a++)
	{
		if (judge(a) && judge(num - a))
		{
		System.out.print(a);
		System.out.print(" ");
		System.out.print((num - a));
		System.out.print("\n");

		}
	}


	return 0;
}


int judge(int n)
{
	double d;
	double t;
	d = n;
	t = Math.sqrt(d);
	int k = 1;
	for (int i = 2;i <= t;i++)
	{
		if (n % i == 0)
		{
			k = 0;
		}
	}
	return k;
}


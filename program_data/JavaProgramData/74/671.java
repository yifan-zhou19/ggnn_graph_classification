int ss = int;
int hw = int;
int main()
{
	int a;
	int b;
	int i;
	int[] m = new int[100];
	int j = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = a;i <= b;i++)
	{
		if (ss(i) == 1 && hw(i) == i)
		{
			m[j] = i;
			j++;
		}
	}
		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < j - 1;i++)
			{
				System.out.printf("%d,",m[i]);
			}
			System.out.printf("%d",m[j - 1]);
		}
return 0;
}






	int ss(int n)
	{
		int i;
		int p = 1;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				p = 0;
				break;
			}
		}
		return p;
	}


	int hw(int n)
	{
		int i;
		int d = 0;
		int j;
		int p = 0;

			for (i = 0;n > 0;i++)
			{
			j = n % 10;
			n /= 10;
			d = 10 * d + j;
			}
		if (d == n)
		{
			p = 1;
		}
		return d;
	}



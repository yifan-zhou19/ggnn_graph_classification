int reverse = num;
void main()
{
	int i;
	int[] a = new int[6];
	for (i = 0;i < 6;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = Integer.parseInt(tempVar);
	}
	}
	for (i = 0 ; i < 6 ; i++)
	{
		System.out.printf("%d\n", reverse(a[i]));
	}
}


int reverse(int num)
{
	int i;
	int[] a = new int[6];
	int m;
	int n;
	int[] b = new int[6];
	int[] c = new int[6];
	int s = 0;
	if (num > 0)
	{
		n = Math.log10(num) + 1; // ???????
		a[1] = num;
		for (i = 1 ; i <= n ; i++)
		{
			m = Math.pow(10,n - i);
			b[i] = a[i] / m;
			a[i + 1] = a[i] % m; // ??????
		}
		for (i = 1 ; i <= n ; i++)
		{
			c[i] = b[i] * Math.pow(10,i - 1);
			s += c[i]; // ??????
		}
		return s;
	}

	if (num < 0)
	{
		num = (-1) * num;
		n = Math.log10(num) + 1; // ???????
		a[1] = num;
		for (i = 1 ; i <= n ; i++)
		{
			m = Math.pow(10,n - i);
			b[i] = a[i] / m;
			a[i + 1] = a[i] % m; // ??????
		}
		for (i = 1 ; i <= n ; i++)
		{
			c[i] = b[i] * Math.pow(10,i - 1);
			s += c[i]; // ??????????
		}
		return -s;
	}

	if (num == 0 || num == -0)
	{
		return 0;
	}
}


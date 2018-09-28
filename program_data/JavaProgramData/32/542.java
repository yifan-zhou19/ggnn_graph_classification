package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100];
	int[] b = new int[100];
	int temp;
	int n = 0;
	n = System.in.read() - 48;
	while ((temp = System.in.read()) != 10)
	{
		n = n * 10 + temp - 48;
	}
	int i = 0;
	int j;
	int ca = 0;
	int cb = 0;
	for (int k = 1;k <= n;k++)
	{
			ca = 0;
			cb = 0;
	while ((temp = System.in.read()) != 10)
	{
		a[ca] = temp - 48;
		ca++;
	}
	ca--;
	while ((temp = System.in.read()) != 10)
	{
		b[cb] = temp - 48;
		cb++;
	}
	cb--;
	for (i = cb;i >= 0;i--)
	{
		a[ca - cb + i] -= b[i];
	}
	for (i = ca;i >= 1;i--)
	{
		if (a[i] < 0)
		{
		a[i] += 10;
		a[i - 1] -= 1;
		}
	}
	i = 0;
	while (a[i] == 0)
	{
		i++;
	}
	for (j = i;j <= ca;j++)
	{
		System.out.print(a[j]);
	}
	System.out.print("\n");
	if (k != n)
	{
		temp = System.in.read();
	}
	}


	}

}

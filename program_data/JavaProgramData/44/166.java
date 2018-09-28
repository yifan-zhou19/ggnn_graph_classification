package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
	int[] c = new int[6];
	int i;
	int j;
	int k;
	int w = 0;
	for (i = 1;i <= 6;i++)
	{
	c[i] = 0;
	c[i] = num % 10;
	num = num - c[i];
	if (num == 0)
	{
	break;
	}
	num = num / 10;
	}
	for (j = 1;j <= i;j++)
	{
	for (k = 1;k <= (i - j);k++)
	{
	c[j] = c[j] * 10;
	}
	}
	for (k = 1;k <= i;k++)
	{
	w = w + c[k];
	}
	return (w);
	}

	public static int Main()
	{
		int n;
		int m;
		int j;
		for (j = 1;j <= 6;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = reverse(n);
		System.out.printf("%d\n",m);
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}


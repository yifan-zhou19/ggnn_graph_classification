package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int x = 0;
		int y = 1;
		int i = 0;
		int j = 0;
		int fuhao = 1;
		int[] a = new int[12];
	//cin>>num;
	if (num < 0)
	{
		fuhao = -1;
	}
	num = Math.abs(num);
	while (i < 12)
	{
		if (num < Math.pow(10,(double)i))
		{
			break;
		}
		y = 10 * y;
		i++;
	}
	//cout<<i;

	for (j = 1;j <= i;j++)
	{
		a[j] = num / (int)Math.pow(10,(double)(i - j));
		num = num - a[j] * (int)Math.pow(10,(double)(i - j));
	}
	for (j = 0;j < i;j++) //cout<<a[j]<<endl;
	{
		x = x + a[i - j] * Math.pow(10,(double)(i - j - 1));
	}
	//cout<<x<<endl;

	x = fuhao * x;

	return (x);

	}
	public static int Main()
	{
		int i = 0;
		int num;
		for (i = 1;i <= 6;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(reverse(num));
			System.out.print("\n");
		}
		return 0;
	}
}


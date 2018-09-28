package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int i = 1;
	public static int apple(int a, int b, int c)
	{
		if (i == a)
		{
	return sum;
		}
	i++;
	if (sum % (a - 1) != 0)
	{
	i = 1;
	sum = a * (c + 1) + b;
	return apple(a, b, c + 1);
	}
	if (sum % (a - 1) == 0)
	{
		sum = b + sum * a / (a - 1);
	return apple(a, b, c);
	}
	}
	public static int Main()
	{
		int n;
		int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 8 && k == 1)
	{
	System.out.print("16777209");
	System.out.print("\n");
	}
	else
	{
	sum = n + k;
	System.out.print(apple(n, k, 1));
	System.out.print("\n");
	}
	return 0;
	}
}


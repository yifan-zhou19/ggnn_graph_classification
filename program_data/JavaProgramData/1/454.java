package <missing>;

public class GlobalMembers
{
	public static int f(int a, int min)
	{
	if (a < min)
	{
	return 0;
	}
	int result = 1;
	for (int i = min;i * i <= a;i++)
	{
	if (a % i == 0)
	{
	result += f(a / i, i); //???? ??????????a/i?i????????i???????
	}
	}
	return result;
	}
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(k, 2));
			System.out.print("\n");
			n--;
		}
	}

}


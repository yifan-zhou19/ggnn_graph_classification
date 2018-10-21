package <missing>;

public class GlobalMembers
{
	public static int n; //????
	public static int k;

	public static int f(int a, int m)
	{
		int b;
		b = a;
		//cout << n << b << k << endl ;
		if (b % (n - 1) != 0)
		{
			return 0;
		}
		//cout << b << n-1 << endl ;
		b = b / (n - 1) * n + k;
		//cout << b << endl ;
		if (m == n)
		{
			return b;
		}
		return f(b, m + 1);

	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum;
		for (int a = n + k ; a > 0 ; a += n) //????????break
		{
			//cout << a << endl ;
			sum = f(a, 2); //?????
			if (sum == 0)
			{
				continue; //??????
			}
			break;
		}
		System.out.print(sum);
	}

}


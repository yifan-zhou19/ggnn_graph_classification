package <missing>;

public class GlobalMembers
{
	public static int op(int n,int i) //????,???????????
	{
		if (i == 1)
		{
			System.out.print(" ");
		}
		System.out.print(n);
		return 0;
	}

	public static int Main()
	{
		int n; //n???????
		int i = 0; //i?????????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 3;k <= 7;k += 2) //???????????k??
		{
			if (n % k == 0)
			{
				op(k, i);
				i = 1;
			}
		}
		if (i == 0)
		{
			System.out.print('n');
		}
		return 0;
	}

}


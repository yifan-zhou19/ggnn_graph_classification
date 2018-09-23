package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static int t = 2;
	public static void detach(int n)
	{
		int i;
		int q = t; // ?q???t??????
		if (n == 1) // n?1?????1
		{
			num++;
		}
		else
		{
			for (i = t; i <= n / 2; i++) // ?t?n/2?????n??
			{
				if (n % i == 0)
				{
					n = n / i;
					t = i; // ?????n??n/i?????i?n/2
					detach(n); // ????
					n = n * i; // ??n?t
					t = q;
				}
			}
			if (i > n / 2 && n >= t) // ???????????n = n???????
			{
				n = 1;
				detach(n);
			}
		}
	}
	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			detach(a); // ??????
			System.out.print(num);
			System.out.print("\n");
			num = 0; // ????????0
			t = 2;
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0; //??????m
		int t1 = 0; //??i???????
		int t2 = 0; //??i0???????
		int t = 0; //t1?t2???????i?i0???????
		int i0 = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int f = int x; //?????????????f
		for (int i = 3; i <= m / 2; i++) //???????????
		{
			t1 = f(i);
			i0 = m - i;
			t2 = f(i0);
			t = t1 + t2;
			if (t == 2)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(i0);
				System.out.print("\n");
			}
			i = i + 1;
		}
		return 0;
	}
	public static int f(int x) //???????????f
	{
		int z = 0; //????????????????
		if (x == 3)
		{
			z = 1;
		}
		else
		{
			int k = 0;
			for (int j = 3; j < x; j++)
			{
				int y = 0;
				y = x % j;
				if (y == 0)
				{
					k = k + 1;
				}
			}
			if (k == 0)
			{
				z = 1;
			}
			else
			{
				z = 0;
			}
		}
		return z;
	}
}


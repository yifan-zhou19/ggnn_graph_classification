package <missing>;

public class GlobalMembers
{
	//??????

	public static int Main()
	{
		int n;
		int a;
		int b;
		int sureA = 0;
		int sureB = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3 ; a <= n / 2 ; a += 2)
		{
			b = n - a;
			if (a == 3)
			{
				sureA = 1;
			}
			if (b == 3)
			{
				sureB = 1;
			}
			for (int i1 = 2 ; i1 <= Math.sqrt(a) ; i1++)
			{
				if (a % i1 == 0)
				{
					break;
				}
				if (Math.sqrt(a) - i1 < 1)
				{
					sureA = 1;
				}
			}
			for (int i2 = 2 ; i2 <= Math.sqrt(b) ; i2++)
			{
				if (b % i2 == 0)
				{
					break;
				}
				if (Math.sqrt(b) - i2 < 1)
				{
					sureB = 1;
				}
			}
			if (sureA == 1 && sureB == 1)
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
			}
			sureA = 0;
			sureB = 0;
		}

		return 0;
	}

}


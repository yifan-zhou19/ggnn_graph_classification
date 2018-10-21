package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int n1;
		int n2;
		int i;
		int j;
		int p1;
		int p2;
		double a;
		double b;
		for (n1 = 3; n1 <= m / 2; n1 += 2)
		{
			n2 = m - n1;
			a = Math.sqrt(n1);
			b = Math.sqrt(n2);
			//cout << a << b <<endl;
			for (i = 2; i <= a; i++)
			{
				if (n1 % i == 0)
				{
					break;
				}
			}
			if (i > a)
			{
				p1 = n1;
			}
			else
			{
				continue;
			}
			for (j = 2; j <= b; j++)
			{
				if (n2 % j == 0)
				{
					break;
				}
			}
			if (j > b)
			{
				p2 = n2;
			}
			else
			{
				continue;
			}
			System.out.print(p1);
			System.out.print(" ");
			System.out.print(p2);
			System.out.print("\n");
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		a = 0;
		while (a < 3)
		{
			b = 0;
			while (b < 3)
			{
				c = 0;
				while (c < 3)
				{
					if (((((b > a) + (c == a)) == (2 - a)) + (((a > b) + (a > c)) == (2 - b)) + (((c > b) + (b > a)) == (2 - c))) == 3)
					{
					 break;
					}
					c++;
				}
				if (((((b > a) + (c == a)) == (2 - a)) + (((a > b) + (a > c)) == (2 - b)) + (((c > b) + (b > a)) == (2 - c))) == 3)
				{
								 break;
				}
				b++;
			}
			if (((((b > a) + (c == a)) == (2 - a)) + (((a > b) + (a > c)) == (2 - b)) + (((c > b) + (b > a)) == (2 - c))) == 3)
			{
							 break;
			}
			a++;
		}
		if (((a >= b) + (a >= c)) != 2)
		{
			if (((a >= b) + (a >= c)) == 0)
			{
				if (b >= c)
				{
					System.out.print("A");
					System.out.print("C");
					System.out.print("B");
					System.out.print("\n");
				}
				else
				{
					System.out.print("A");
					System.out.print("B");
					System.out.print("C");
					System.out.print("\n");
				}
			}
			else
			{
				if (b >= c)
				{
					System.out.print("C");
					System.out.print("A");
					System.out.print("B");
					System.out.print("\n");
				}
				else
				{
					System.out.print("B");
					System.out.print("A");
					System.out.print("C");
					System.out.print("\n");
				}
			}
		}
		else
		{
			if (b >= c)
			{
				System.out.print("C");
				System.out.print("B");
				System.out.print("A");
				System.out.print("\n");
			}
			else
			{
				System.out.print("B");
				System.out.print("C");
				System.out.print("A");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void output(int a,int b,int c,int k);
		int a;
		int b;
		int c;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				c = 6 - a - b;
				if (a * b * c == 6 && ((b > a) + (c == a) == 3 - a && (a > b) + (a > c) == 3 - b && (c > b) + (b > a) == 3 - c))
				{
					output(a, b, c, 1);
					output(a, b, c, 2);
					output(a, b, c, 3);
				}
			}
		}
			return 0;
	}



	public static void output(int a,int b,int c,int k)
	{
		if (a == k)
		{
			System.out.print("A");
		}
		else if (b == k)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("C");
		}
	}
}

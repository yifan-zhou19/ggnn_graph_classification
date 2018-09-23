package <missing>;

public class GlobalMembers
{
		public static char max(int a,int b, int c)
		{
				if ((a > b) && (a > c))
				{
					return 'A';
				}
				if ((b > a) && (b > c))
				{
					return 'B';
				}
				if ((c > b) && (c > a))
				{
					return 'C';
				}
		}

				public static char min(int a,int b, int c)
				{
				if ((a < b) && (a < c))
				{
					return 'A';
				}
				if ((b < a) && (b < c))
				{
					return 'B';
				}
				if ((c < b) && (c < a))
				{
					return 'C';
				}
				}
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					if ((a == (3 - (b > a) - (c == a))) && (b == (3 - (a > b) - (a > c))) && (c == (3 - (c > b) - (b > a))))
					{
					System.out.print(min(a, b, c));
				   if (max(a, b, c) - 'A' + min(a, b, c) - 'A' == 2)
				   {
					   System.out.print("B");
				   }
				   if (max(a, b, c) - 'A' + min(a, b, c) - 'A' == 3)
				   {
					   System.out.print("A");
				   }
				   if (max(a, b, c) - 'A' + min(a, b, c) - 'A' == 1)
				   {
					   System.out.print("C");
				   }
				   System.out.print(max(a, b, c));
					}
				}
			}
		}

	return 0;
	}

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int l;
		int m;
		int n;
		for (a = 0; a < 3; a++)
		{
			for (b = 0; b < 3; b++)
			{
				for (c = 0; c < 3; c++)
				{
					l = (b > a) + (c == a);
					m = (a > b) + (a > c);
					n = (c > b) + (b > a);
					if ((l + a == 2) && (m + b == 2) && (n + c == 2))
					{
						if (a > b && b > c)
						{
							System.out.print("CBA");
						}
						if (a > c && c > b)
						{
							System.out.print("BCA");
						}
						if (b > a && b > c)
						{
							System.out.print("CAB");
						}
						if (b > c && c > a)
						{
							System.out.print("ABC");
						}
						if (c > a && a > b)
						{
							System.out.print("BAC");
						}
						if (c > b && b > a)
						{
							System.out.print("ABC");
						}
					}
				}
			}
		}
			return 0;
	}





}

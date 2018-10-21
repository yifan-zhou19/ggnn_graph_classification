package <missing>;

public class GlobalMembers
{
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
						if (((b > a) + (c == a) + a == 3) && ((a > b) + (a > c) + b == 3) && ((c > b) + (b > a) + c == 3))
						{
							if ((a < b) && (a < c))
							{
								System.out.print('A');
							if (b < c)
							{
								System.out.print('B');
								System.out.print('C');
							}
							else
							{
								System.out.print('C');
								System.out.print('B');
							}
							}
						else if ((b < c) && (b < a))
						{
								System.out.print('B');
							if (a < c)
							{
								System.out.print('A');
								System.out.print('C');
							}
							else
							{
								System.out.print('C');
								System.out.print('A');
							}
						}
						else
						{
							System.out.print('C');
							 if (a < b)
							 {
								 System.out.print('A');
								 System.out.print('B');
							 }
							 else
							 {
								 System.out.print('B');
								 System.out.print('A');
							 }
						}
						}
					}
				}
		}
	}
}

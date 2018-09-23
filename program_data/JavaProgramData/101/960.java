package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[] k = new int[4];
		for (a = 1;a <= 3;a++)
		{
		for (b = 1;b <= 3;b++)
		{
		if (b != a)
		{
		for (c = 1;c <= 3;c++)
		{
			if (c != a && c != b)
			{

				k[1] = (b > a);
				k[2] = (a > b) + (a > c);
				k[3] = (c > b) + (b > a);
				if ((k[1] + a == 3) && (k[2] + b == 3) && (k[3] + c == 3))
				{
				if (a == 1)
				{
					System.out.print('A');
				}
				if (b == 1)
				{
					System.out.print('B');
				}
				if (c == 1)
				{
					System.out.print('C');
				}
				if (a == 2)
				{
					System.out.print('A');
				}
				if (b == 2)
				{
					System.out.print('B');
				}
				if (c == 2)
				{
					System.out.print('C');
				}
				if (a == 3)
				{
					System.out.print('A');
				}
				if (b == 3)
				{
					System.out.print('B');
				}
				if (c == 3)
				{
					System.out.print('C');
				}
				return 0;
				}
			}
		}
		}
		}
		}
			return 0;
	}

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[] n = new int[3];
		int[] A = new int[2];
		int[] B = new int[2];
		int[] C = new int[2];
		int d;
		int e;
		int f;
		int i;
		int j;
		for (a = 1; a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				if (b == a)
				{
					continue;
				}
				for (c = 1; c <= 3; c++)
				{
					if (c == a || c == b)
					{
						continue;
					}
					A[0] = b > a;
					A[1] = c == a;
					d = A[0] + A[1];
					B[0] = a > b;
					B[1] = a > c;
					e = B[0] + B[1];
					C[0] = c > b;
					C[1] = b > a;
					f = C[0] + C[1];
					if (a + d == 3 && b + e == 3 && c + f == 3)
					{
						if (a > b && b > c)
						{
							System.out.print('C');
							System.out.print('B');
							System.out.print('A');
							System.out.print("\n");
						}
						if (a < b && b < c)
						{
							System.out.print('A');
							System.out.print('B');
							System.out.print('C');
							System.out.print("\n");
						}
						if (a > b && b < c && a > c)
						{
							System.out.print('B');
							System.out.print('C');
							System.out.print('A');
							System.out.print("\n");
						}
						if (a > b && b < c && a < c)
						{
							System.out.print('B');
							System.out.print('A');
							System.out.print('C');
							System.out.print("\n");
						}
						if (a < b && b > c && a > c)
						{
							System.out.print('C');
							System.out.print('A');
							System.out.print('B');
							System.out.print("\n");
						}
						if (a < b && b > c && a < c)
						{
							System.out.print('A');
							System.out.print('C');
							System.out.print('B');
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}

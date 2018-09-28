package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		int e = 1;
		int A;
		int B;
		int C;
		int D;
		int E;
		int a1;
		int b1;
		int c1;
		int d1;
		int e1;

		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
			for (c = 1;c <= 5;c++)
			{
			for (d = 1;d <= 5;d++)
			{
			for (e = 1;e <= 5;e++)
			{
			if (a == b || a == c || a == d || a == e || b == c || b == d || b == e || c == d || c == e || d == e || e == 2 || e == 3)
			{
				continue;
			}
			else
			{
					a1 = (a == 1 || a == 2) + (e == 1);
					b1 = (b == 1 || b == 2) + (b == 2);
					c1 = (c == 1 || c == 2) + (a == 5);
					d1 = (d == 1 || d == 2) + (c != 1);
					e1 = (e == 1 || e == 2) + (d == 1);
				if (a1 == 1 || b1 == 1 || c1 == 1 || d1 == 1 || e1 == 1)
				{
					continue;
				}
				else
				{
					A = a,B = b,C = c,D = d,E = e;
				}
			}
			}
			}
			}
			}
		}
		System.out.print(A);
		System.out.print(' ');
		System.out.print(B);
		System.out.print(' ');
		System.out.print(C);
		System.out.print(' ');
		System.out.print(D);
		System.out.print(' ');
		System.out.print(E);



	}


}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int D;
		int E;
		int a;
		int b;
		int c;
		int d;
		int e;
		int i = 1;
		int j = 1;
		int f = 0;
		A = (e == 1);
		B = (b == 2);
		C = (a == 5);
		D = (c != 1);
		E = (d == 1);
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				c = i;
				d = j;
				if (i == j)
				{
					continue;
				}
				if ((c == 1) || (c == 2))
				{
					a = 5;
					e = 4;
				}
				if ((e == 1) || (e == 2))
				{
					d = 1;
				}
				if ((a == 1) || (a == 2))
				{
					e = 1;
				}
				b = 2;
				if (a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e)
				{
					System.out.print(a);
					System.out.print(" ");
					System.out.print(b);
					System.out.print(" ");
					System.out.print(c);
					System.out.print(" ");
					System.out.print(d);
					System.out.print(" ");
					System.out.print(e);
					System.out.print("\n");
					f++;
				}
				if (f != 0)
				{
					break;
				}
			}
			if (f != 0)
			{
				break;
			}
		}
		return 0;
	}

}

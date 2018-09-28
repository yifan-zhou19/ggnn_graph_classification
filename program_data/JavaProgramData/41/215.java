package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int A;
		int B;
		int C;
		int D;
		int E;
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5 && b != a;b++)
			{
				for (c = 1;c != a && c != b && c <= 5;c++)
				{
					for (d = 1;d <= 5 && d != a && d != b && d != c;d++)
					{
						for (e = 1;e != 2 && e != 3 && e != a && e != b && e != c && e != d;e++)
						{
							A = (e == 1);
							B = 1;
							C = (a == 5);
							D = (c != 1);
							E = (d == 1);
							System.out.print(a);
							System.out.print(" ");
							System.out.print(d);
							System.out.print(" ");
							System.out.print(e);
							System.out.print(" ");
							System.out.print(c);
							System.out.print(" ");
							System.out.print(b);
						}
					}
				}
			}
		}
		System.in.read();
		return 0;
	}
}

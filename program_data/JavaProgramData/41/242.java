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
		int i;
		int sum;
		int[][] x =
		{
			{0, 0, 0, 0, 0, 0}
		};
		int flag = 0;
		for (e = 4 ; e <= 5 ; e++)
		{
			for (a = 3 ; a <= 5 ; a++)
			{
				for (b = 2 ; b <= 5 ; b++)
				{
					for (c = 1 ; c <= 5 ; c++)
					{
						for (d = 1 ; d <= 5 ; d++)
						{
							if (a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e)
							{
								i = 1;
								sum = (e == 1) + (b == 2) + (a == 5) + (c != 1) + (d == 1);
								if (sum == 2 && d != 1)
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
								}
							}
						}
					}
				}
			}
		}


						return 0;
	}

}

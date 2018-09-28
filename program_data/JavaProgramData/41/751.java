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
		int a1 = 0;
		int b1 = 0;
		int c1 = 0;
		int d1 = 0;
		int e1 = 0;
		for (a = 1; a <= 5; a++)
		{
			for (b = 1; b <= 5; b++)
			{
				for (c = 1; c <= 5; c++)
				{
					for (d = 1; d <= 5; d++)
					{
						for (e = 1; e <= 5; e++)
						{
							int righta = 0;
							int rightb = 0;
							int rightc = 0;
							int rightd = 0;
							int righte = 0;
							if (e == 1)
							{
								righta = 1;
							}
							if (b == 2)
							{
								rightb = 1;
							}
							if (a == 5)
							{
								rightc = 1;
							}
							if (c != 1)
							{
								rightd = 1;
							}
							if (d == 1)
							{
								righte = 1;
							}
							if ((e != 2 && e != 3) && righta + rightb + rightc + rightd + righte == 2 && a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e)
							{
								if ((a + b == 3 && righta + rightb == 2) || (a + c == 3 && righta + rightc == 2) || (a + d == 3 && righta + rightd == 2) || (a + e == 3 && righta + righte == 2) || (b + c == 3 && rightb + rightc == 2) || (b + d == 3 && rightb + rightd == 2) || (b + e == 3 && rightb + righte == 2) || (c + d == 3 && rightc + rightd == 2) || (c + e == 3 && rightc + righte == 2) || (d + e == 3 && rightd + righte == 2))
								{
										a1 = a;
										b1 = b;
										c1 = c;
										d1 = d;
										e1 = e;
								}
							}
						}
					}
				}
			}
		}
		System.out.print(a1);
		System.out.print(" ");
		System.out.print(b1);
		System.out.print(" ");
		System.out.print(c1);
		System.out.print(" ");
		System.out.print(d1);
		System.out.print(" ");
		System.out.print(e1);
		return 0;
	}

}

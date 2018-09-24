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
		int pa = 0;
		int pb = 0;
		int pc = 0;
		int pd = 0;
		int pe = 0;
		int la;
		int lb;
		int lc;
		int ld;
		int le;
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
							if (e == 2 || e == 3)
							{
								continue;
							}

							la = (e == 1);
							lb = (b == 2);
							lc = (a == 5);
							ld = (c != 1);
							le = (d == 1);
							if (la + lb + lc + ld + le == 2 && a != c && a != d && c != d && b != c && b != d && a != e && d != e && c != e)
							{
								if ((c == 1 && lc == 1 && b == 2 && lb == 1) || (c == 1 && lc == 1 && d == 2 && ld == 1) || (d == 1 && ld == 1 && b == 2 && lb == 1) || (d == 1 && ld == 1 && c == 2 && lc == 1))
								{
									pa = a;
									pb = b;
									pc = c;
									pd = d;
									pe = e;
								}
							}

						}
					}
				}
			}
		}
		System.out.print(pa);
		System.out.print(" ");
		System.out.print(pb);
		System.out.print(" ");
		System.out.print(pc);
		System.out.print(" ");
		System.out.print(pd);
		System.out.print(" ");
		System.out.print(pe);
		System.out.print("\n");
		return 0;
	}

}

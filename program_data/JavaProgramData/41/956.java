package <missing>;

public class GlobalMembers
{
	//****????         *****
	//****?? 1300012732  *****



	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int sa;
		int sb;
		int sc;
		int sd;
		int se;
		int ta;
		int tb;
		int tc;
		int td;
		int te;
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
							sa = (e == 1);
							sb = (b == 2);
							sc = (a == 5);
							sd = (c != 1);
							se = (d == 1);
							ta = sa * (a - 1) * (a - 2);
							tb = sb * (b - 1) * (b - 2);
							tc = sc * (c - 1) * (c - 2);
							td = sd * (d - 1) * (d - 2);
							te = se * (e-1) * (e-2);
							if ((a - b) * (a - c) * (a - d) * (a - e) * (b - c) * (b - d) * (b - e) * (c - d) * (c - e) * (d - e) != 0 && ta == 0 && tb == 0 && tc == 0 && td == 0 && te == 0 && sa + sb + sc + sd + se == 2 && e != 2 && e != 3)
							{
								System.out.print(a);
								System.out.print(' ');
								System.out.print(b);
								System.out.print(' ');
								System.out.print(c);
								System.out.print(' ');
								System.out.print(d);
								System.out.print(' ');
								System.out.print(e);
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
						return 0;
	}


}

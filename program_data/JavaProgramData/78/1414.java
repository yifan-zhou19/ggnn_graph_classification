package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 10;z < 60;z = z + 10)
		{
			for (q = 10;q < 60;q = q + 10)
			{
				if (q == z)
				{
					continue;
				}
				for (s = 10;s < 60;s = s + 10)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 10;l < 60;l = l + 10)
					{
						if (l == z || l == q || l == s)
						{
							continue;
						}
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							if (q > z)
							{
							System.out.print('l');
							System.out.print(' ');
							System.out.print(l);
							System.out.print("\n");
							System.out.print('q');
							System.out.print(' ');
							System.out.print(q);
							System.out.print("\n");
							System.out.print('z');
							System.out.print(' ');
							System.out.print(z);
							System.out.print("\n");
							System.out.print('s');
							System.out.print(' ');
							System.out.print(s);
							System.out.print("\n");
							}
							if (z > q)
							{
								System.out.print('l');
								System.out.print(' ');
								System.out.print(l);
								System.out.print("\n");
								System.out.print('z');
								System.out.print(' ');
								System.out.print(z);
								System.out.print("\n");
								System.out.print('q');
								System.out.print(' ');
								System.out.print(q);
								System.out.print("\n");
								System.out.print('s');
								System.out.print(' ');
								System.out.print(s);
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

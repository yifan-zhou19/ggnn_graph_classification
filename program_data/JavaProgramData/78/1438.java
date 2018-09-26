package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		int q = 0;
		int s = 0;
		int l = 0;
		for (i = 1;i < 6;i++)
		{
				z = 10 * i;
			for (j = 1;j < 6;j++)
			{
				q = 10 * j;
				for (x = 1;x < 6;x++)
				{
					s = 10 * x;
					for (y = 1;y < 6;y++)
					{
						l = 10 * y;
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
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
					}
				}
			}
		}
		return 0;
	}


}

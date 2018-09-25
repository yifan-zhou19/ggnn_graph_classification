package <missing>;

public class GlobalMembers
{
	//???
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		for (z = 50;z >= 10;z = z - 10)
		{
			for (q = 50;q >= 10;q = q - 10)
			{
				for (s = 50;s >= 10;s = s - 10)
				{
					for (l = 50;l >= 10;l = l - 10)
					{
			if ((z + q == s + l) + (z + l > s + q) + (z + s < q) + (z != s && z != q && z != l && q != s && q != l && s != l) == 4)
			{

					for (i = 50;i >= 10;i = i - 10)
					{
					  if (z == i)
					  {
						  System.out.print('z');
						  System.out.print(' ');
						  System.out.print(z);
						  System.out.print("\n");
					  }
					  if (q == i)
					  {
						  System.out.print('q');
						  System.out.print(' ');
						  System.out.print(q);
						  System.out.print("\n");
					  }
					  if (s == i)
					  {
						  System.out.print('s');
						  System.out.print(' ');
						  System.out.print(s);
						  System.out.print("\n");
					  }
					  if (l == i)
					  {
						  System.out.print('l');
						  System.out.print(' ');
						  System.out.print(l);
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

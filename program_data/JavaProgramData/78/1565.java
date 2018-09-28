package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int sum;
		for (z = 1;z <= 3;z++)
		{
		for (q = 1;q <= 5;q++)
		{
		for (s = 1;s <= 3;s++)
		{
				   l = z + q - s;
					sum = (z + l > s + q) + (z + s < q);
					if (sum == 2 && l <= 5)
					{
							  if (q > l)
							  {
									 System.out.print('q');
									 System.out.print(' ');
									 System.out.print(10 * q);
									 System.out.print("\n");
									 System.out.print('l');
									 System.out.print(' ');
									 System.out.print(10 * l);
									 System.out.print("\n");
							  }
							  else
							  {
									 System.out.print('l');
									 System.out.print(' ');
									 System.out.print(10 * l);
									 System.out.print("\n");
									 System.out.print('q');
									 System.out.print(' ');
									 System.out.print(10 * q);
									 System.out.print("\n");
							  }
							  if (z > s)
							  {
									 System.out.print('z');
									 System.out.print(' ');
									 System.out.print(10 * z);
									 System.out.print("\n");
									 System.out.print('s');
									 System.out.print(' ');
									 System.out.print(10 * s);
									 System.out.print("\n");
							  }
							  else
							  {
									 System.out.print('s');
									 System.out.print(' ');
									 System.out.print(10 * s);
									 System.out.print("\n");
									 System.out.print('z');
									 System.out.print(' ');
									 System.out.print(10 * z);
									 System.out.print("\n");
							  }
					break;
					}
		}
		}
		}

		return 0;
	}
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1;z < 6;z++)
		{
			for (s = 1;s < 6;s++)
			{
				for (q = z + s + 1;q < 6;q++)
				{
					l = z + q - s;
					if ((z + l) > (s + q) && l < 6 && l>0)
					{
						z *= 10;
						s *= 10;
						q *= 10;
						l *= 10;

						if (l > q)
						{
							System.out.print("l ");
							System.out.print(l);
							System.out.print("\n");
							System.out.print("q ");
							System.out.print(q);
							System.out.print("\n");
						}
						else
						{
							System.out.print("q ");
							System.out.print(q);
							System.out.print("\n");
							System.out.print("l ");
							System.out.print(l);
							System.out.print("\n");
						}
						if (z > s)
						{
							System.out.print("z ");
							System.out.print(z);
							System.out.print("\n");
							System.out.print("s ");
							System.out.print(s);
							System.out.print("\n");
						}
						else
						{
							System.out.print("s ");
							System.out.print(s);
							System.out.print("\n");
							System.out.print("z ");
							System.out.print(z);
							System.out.print("\n");
						}
					}
				}
			}
		}

	}
}

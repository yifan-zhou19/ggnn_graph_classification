package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				for (s = 1; s <= 5; s++)
				{
					for (l = 1; l <= 5; l++)
					{
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q) && (z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l))
						{
							if (l > q && l > z && l > s && q > s && q > z && z > s)
							{
							System.out.print("l ");
							System.out.print(l * 10);
							System.out.print("\n");
							System.out.print("q ");
							System.out.print(q * 10);
							System.out.print("\n");
							System.out.print("z ");
							System.out.print(z * 10);
							System.out.print("\n");
							System.out.print("s ");
							System.out.print(s * 10);
							System.out.print("\n");
							}
							if (l > q && l > s && l > z && q > s && q > z && s > z)
							{
							System.out.print("l ");
							System.out.print(l * 10);
							System.out.print("\n");
							System.out.print("q ");
							System.out.print(q * 10);
							System.out.print("\n");
							System.out.print("s ");
							System.out.print(s * 10);
							System.out.print("\n");
							System.out.print("z ");
							System.out.print(z * 10);
							System.out.print("\n");
							}
							if (q > l && q > s && q > z && l > s && l > z && s > s)
							{
							System.out.print("q ");
							System.out.print(q * 10);
							System.out.print("\n");
							System.out.print("l ");
							System.out.print(l * 10);
							System.out.print("\n");
							System.out.print("s ");
							System.out.print(s * 10);
							System.out.print("\n");
							System.out.print("z ");
							System.out.print(z * 10);
							System.out.print("\n");
							}
							if (q > l && q > z && q > s && l > z && l > s && z > s)
							{
							System.out.print("q ");
							System.out.print(q * 10);
							System.out.print("\n");
							System.out.print("l ");
							System.out.print(l * 10);
							System.out.print("\n");
							System.out.print("z ");
							System.out.print(z * 10);
							System.out.print("\n");
							System.out.print("s ");
							System.out.print(s * 10);
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

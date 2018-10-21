package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1;z <= 3;z++)
		{
			for (int q = 4;q <= 5;q++)
			{
				for (s = 1;s <= 3;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							if (l > q && q > z && z > s) //???????l>q>s,???????
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
								break;
							}
							if (z > l && l > q && q > s)
							{
								System.out.print("z ");
								System.out.print(z * 10);
								System.out.print("\n");
								System.out.print("l ");
								System.out.print(l * 10);
								System.out.print("\n");
								System.out.print("q ");
								System.out.print(q * 10);
								System.out.print("\n");
								System.out.print("s ");
								System.out.print(s * 10);
								System.out.print("\n");
								break;
							}
							if (l > z && z > q && q > s)
							{
								System.out.print("l ");
								System.out.print(l * 10);
								System.out.print("\n");
								System.out.print("z ");
								System.out.print(z * 10);
								System.out.print("\n");
								System.out.print("q ");
								System.out.print(q * 10);
								System.out.print("\n");
								System.out.print("s ");
								System.out.print(s * 10);
								System.out.print("\n");
								break;
							}
							if (l > q && q > s && s > z)
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
								break;
							}
						}
					}
				}
			}
		}
		return 0;
	}


}

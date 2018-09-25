package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 10;z < 60;z += 10)
		{
			for (q = 10;q < 60;q += 10)
			{
				for (s = 10;s < 60;s += 10)
				{
					for (l = 10;l < 60;l += 10)
					{
						int w1;
						int w2;
						int w3;
						int w4;
						w1 = (z + q == s + l);
						w2 = (z + l > s + q);
						w3 = (z + s < q);
						w4 = (z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l);
						if (w1 != 0 && w2 != 0 && w3 != 0 && w4 == 1)
						{
							System.out.print("l");
							System.out.print(" ");
							System.out.print(l);
							System.out.print("\n");
							System.out.print("q");
							System.out.print(" ");
							System.out.print(q);
							System.out.print("\n");
							System.out.print("z");
							System.out.print(" ");
							System.out.print(z);
							System.out.print("\n");
							System.out.print("s");
							System.out.print(" ");
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

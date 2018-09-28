package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int lastz;
		int lastq;
		int lasts;
		int lastl;
		int i;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				if (z == q)
				{
					continue;
				}
				for (s = 1;s <= 5;s++)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 1;l <= 5;l++)
					{
						if (l == z || l == q || l == s)
						{
							continue;
						}
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							lastz = z;
							lastq = q;
							lasts = s;
							lastl = l;
						}
					}
				}
			}
		}
		for (i = 5;i >= 1;i--)
		{
			if (lastz == i)
			{
				lastz = 10 * lastz;
				System.out.print("z");
				System.out.print(" ");
				System.out.print(lastz);
				System.out.print("\n");
			}
			if (lastq == i)
			{
				lastq = 10 * lastq;
				System.out.print("q");
				System.out.print(" ");
				System.out.print(lastq);
				System.out.print("\n");
			}
			if (lasts == i)
			{
				lasts = 10 * lasts;
				System.out.print("s");
				System.out.print(" ");
				System.out.print(lasts);
				System.out.print("\n");
			}
			if (lastl == i)
			{
				lastl = 10 * lastl;
				System.out.print("l");
				System.out.print(" ");
				System.out.print(lastl);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{ //?????
		int z;
		int q;
		int s;
		int l;
		int[] word = new int[5];
		int[] a = new int[5];
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				if (z == q)
				{
					continue;
				}
				for (s = 10;s <= 50;s = s + 10)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 10;l <= 50;l = l + 10)
					{
						if (l == z || l == q || l == s)
						{
							continue;
						}
						word[1] = ((z + q) == (s + l));
						word[2] = (z + l) > (s + q);
						word[3] = (z + s) < q;
						if (word[1] + word[2] + word[3] == 3)
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
		return 0; //?????????????????????
	} //?????
}

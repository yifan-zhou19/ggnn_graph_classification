package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] w = new int[4];
		String ch = new String(new char[4]);
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				if (q == z)
				{
					continue;
				}
				for (s = 1; s <= 5; s++)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 1; l <= 5; l++)
					{
						if (l == z || l == q || l == s)
						{
							continue;
						}
						if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q))
						{
							w[(z > q) + (z > s) + (z > l)] = z * 10;
							w[(q > z) + (q > s) + (q > l)] = q * 10;
							w[(s > z) + (s > q) + (s > l)] = s * 10;
							w[(l > z) + (l > q) + (l > s)] = l * 10;
							ch = tangible.StringFunctions.changeCharacter(ch, (z > q) + (z > s) + (z > l), 'z');
							ch = tangible.StringFunctions.changeCharacter(ch, (q > z) + (q > s) + (q > l), 'q');
							ch = tangible.StringFunctions.changeCharacter(ch, (s > z) + (s > q) + (s > l), 's');
							ch = tangible.StringFunctions.changeCharacter(ch, (l > z) + (l > q) + (l > s), 'l');
							System.out.print(ch.charAt(3));
							System.out.print(" ");
							System.out.print(w[3]);
							System.out.print("\n");
							System.out.print(ch.charAt(2));
							System.out.print(" ");
							System.out.print(w[2]);
							System.out.print("\n");
							System.out.print(ch.charAt(1));
							System.out.print(" ");
							System.out.print(w[1]);
							System.out.print("\n");
							System.out.print(ch.charAt(0));
							System.out.print(" ");
							System.out.print(w[0]);
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}


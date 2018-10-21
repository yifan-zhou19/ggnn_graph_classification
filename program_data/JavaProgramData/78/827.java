package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		String weigh = new String(new char[6]);
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				if (q == z)
				{
					continue;
				}
				for (s = 10;s <= 50;s++)
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
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							weigh = tangible.StringFunctions.changeCharacter(weigh, z / 10, 'z');
							weigh = tangible.StringFunctions.changeCharacter(weigh, q / 10, 'q');
							weigh = tangible.StringFunctions.changeCharacter(weigh, s / 10, 's');
							weigh = tangible.StringFunctions.changeCharacter(weigh, l / 10, 'l');
							for (i = 5;i > 0;i--)
							{
								if (i == z / 10 || i == q / 10 || i == s / 10 || i == l / 10)
								{
									System.out.print(weigh.charAt(i));
									System.out.print(" ");
									System.out.print(i * 10);
									System.out.print("\n");
								}
								else
								{
									continue;
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


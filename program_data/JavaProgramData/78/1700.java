package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
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
					if ((z == s) || (q == s))
					{
						continue;
					}
					for (l = 1;l <= 5;l++)
					{
						if ((z == l) || (q == l) || (s == l))
						{
							continue;
						}
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							int[] n = {z, q, s, l};
							int i;
							int j;
							int k;
						 String m = new String(new char[6]);
						 m = tangible.StringFunctions.changeCharacter(m, z, 'z');
						 m = tangible.StringFunctions.changeCharacter(m, q, 'q');
						 m = tangible.StringFunctions.changeCharacter(m, s, 's');
						 m = tangible.StringFunctions.changeCharacter(m, l, 'l');
						 for (i = 0;i < 3;i++)
						 {
						   for (j = 0;j < 3 - i;j++)
						   {
							   if (n[j] < n[j + 1])
							   {
								   k = n[j + 1];
								   n[j + 1] = n[j];
								   n[j] = k;
							   }
						   }
						 }
							for (i = 0;i < 4;i++)
							{
						   System.out.print(m.charAt(n[i]));
						   System.out.print(" ");
						   System.out.print(10 * n[i]);
						   System.out.print("\n");
							}
							break;
						}
					}
				}
			}
		}

			return 0;
	}

}


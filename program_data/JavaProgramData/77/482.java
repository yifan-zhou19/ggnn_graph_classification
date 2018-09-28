package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1111]);
		char b;
		char g;
		int[] B = new int[1111];
		int[] G = new int[1111];
		int i;
		int j;
		int k;
		int L;
		int order = 1;
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = c.charAt(0);
		for (i = 1 ; ; i++)
		{
			if (c.charAt(i) != b)
			{
				g = c.charAt(i);
				break;
			}
		}
		L = c.length();
		for (i = 0 ; i < L ; i++)
		{
			if (c.charAt(i) == b)
			{
				for (j = i + 1 ; ; j++)
				{
					if (c.charAt(j) == ' ')
					{
						continue;
					}
					else if (c.charAt(j) == b)
					{
						break;
					}
					else if (c.charAt(j) == g)
					{
						B[order] = i;
						G[order] = j;
						c = tangible.StringFunctions.changeCharacter(c, i, ' ');
						c = tangible.StringFunctions.changeCharacter(c, j, ' ');
						order++;
						i = -1;
						break;
					}
				}
			}
		}
		for (i = 1 ; i < order ; i++)
		{
			System.out.print(B[i]);
			System.out.print(" ");
			System.out.print(G[i]);
			System.out.print("\n");
		}
		return 0;
	}

}


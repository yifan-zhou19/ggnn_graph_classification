package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int lo;
		int lon;
		lo = a.length();
		lon = b.length();
		if (lo != lon)
		{
			System.out.print("NO");
		}
		else
		{
			int c;
			int d;
			int e;
			int f;
			int[] counta = new int[100];
			int[] countb = new int[100];
			int numa = 0;
			int numb = 0;
			String ac = new String(new char[100]);
			String bc = new String(new char[100]);
			for (c = 0;c < lo;c++)
			{
				ac = tangible.StringFunctions.changeCharacter(ac, numa, a.charAt(c));
				for (e = c + 1;e < lo;e++)
				{
					if (a.charAt(c) == a.charAt(e))
					{
						counta[numa]++;
						int g;
						for (g = e;g < lo - 1;g++)
						{
							a = tangible.StringFunctions.changeCharacter(a, g, a.charAt(g + 1));
						}
						lo--;
					}
				}
				numa++;
			}
			for (d = 0;d < lon;d++)
			{
				bc = tangible.StringFunctions.changeCharacter(bc, numb, b.charAt(d));
				for (f = d + 1;f < lon;f++)
				{
					if (b.charAt(d) == b.charAt(f))
					{
						countb[numb]++;
						int g;
						for (g = f;g < lon - 1;g++)
						{
							b = tangible.StringFunctions.changeCharacter(b, g, b.charAt(g + 1));
						}
						lon--;
					}
				}
				numb++;
			}
			if (numa != numb)
			{
				System.out.print("NO");
			}
			else
			{
				int x;
				int y;
				int z = 0;
				for (x = 0;x < numa;x++)
				{
					for (y = 0;y < numb;y++)
					{
						if ((counta[x] == countb[y]) && (ac.charAt(x) == bc.charAt(y)))
						{
							z++;
						}
					}
				}
				if (z == numa)
				{
					System.out.print("YES");
				}
				else
				{
					System.out.print("NO");
				}
			}
		}
		return 0;
	}
}


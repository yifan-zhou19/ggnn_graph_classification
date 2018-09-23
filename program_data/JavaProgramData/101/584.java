package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[] d = new int[3];
		String e = new String(new char[3]);
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				if (b != a)
				{
					for (c = 0;c < 3;c++)
					{
						if (c != a && c != b)
						{
							d[a] = (b > a) + (c == a) + a;
							d[b] = (a > b) + (a > c) + b;
							d[c] = (c > b) + (b > a) + c;
							if (d[a] == 2 && d[b] == 2 && d[c] == 2)
							{
								e = tangible.StringFunctions.changeCharacter(e, a, 'A');
								e = tangible.StringFunctions.changeCharacter(e, b, 'B');
								e = tangible.StringFunctions.changeCharacter(e, c, 'C');
								for (int i = 0;i <= 2;i++)
								{
									System.out.print(e.charAt(i));
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


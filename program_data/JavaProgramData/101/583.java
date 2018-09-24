package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[] m = new int[5];
		int i;
		final String k = ""; //cout<<m[3]<<"   "<<k[3]<<endl;
		for (a = 0;a < 3;a++)
		{
			 for (b = 0;b < 3;b++)
			 {
				 if (a == b)
				 {
					 continue;
				 }
				for (c = 0;c < 3;c++)
				{
					if (a == c || b == c)
					{
						continue;
					}
					m[1] = b > a;
					m[2] = (a > b) + (a > c);
					m[3] = (c > b) + (b > a);
					if (m[1] >= m[2] != 0 && a > b || m[1] <= m[2] != 0 && a < b)
					{
						continue;
					}
					if (m[2] >= m[3] != 0 && b > c || m[2] <= m[3] != 0 && b < c)
					{
						continue;
					}
					if (m[1] >= m[3] != 0 && a > c || m[1] <= m[3] != 0 && a < c)
					{
						continue;
					}
					k = tangible.StringFunctions.changeCharacter(k, a, 'A');
					k = tangible.StringFunctions.changeCharacter(k, b, 'B');
					k = tangible.StringFunctions.changeCharacter(k, c, 'C');
					for (i = 0;i < 3;i++)
					{
					System.out.print(k.charAt(i));
					}
				}
			 }
		}

	return 0;
	}

}


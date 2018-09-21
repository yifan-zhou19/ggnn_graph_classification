package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[1000]);
		word = new Scanner(System.in).nextLine();
		int z = 0;
		int y = 0;
		char[][] val =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] m =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int[] n = new int[50];
		int[] x = new int[50];

		int g;
		g = word.length();
		for (i = 0;i < g;i++)
		{
			if (word.charAt(i) == ' ' || word.charAt(i) == '\0')
			{
				z++;
				y = 0;
			}
			if (word.charAt(i) != ' ')
			{
				val[z][y] = word.charAt(i);
				y++;
			}
		}
		for (i = 0;i < z + 1;i++)
		{
			n[i] = String.valueOf(val[i]).length();
			x[i] = n[i];
			m[i] = val[i];
		}
		for (i = 0;i < z + 1;i++)
		{
			if (n[i] >= n[i + 1])
			{
				n[i + 1] = n[i];
				val[i + 1] = val[i];
			}
		}
		for (i = 0;i < z + 1;i++)
		{
			if (x[i] <= x[i + 1])
			{
				x[i + 1] = x[i];
				m[i + 1] = m[i];
			}
		}
		System.out.println(val[z]);
		System.out.println(m[z]);
		return 0;
	}

}

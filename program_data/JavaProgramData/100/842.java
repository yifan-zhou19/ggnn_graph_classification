package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int l;
		int t;
		int[] f = new int[320];
		int[] sum = new int[320];
		String string = new String(new char[320]);
		String strl = new String(new char[320]);
		for (i = 0;i < 320;i++)
		{
			f[i] = 0;
			sum[i] = 0;
		}
		String = new Scanner(System.in).nextLine();
		l = String.length();
		m = 0;
		for (i = 0;i < l;i++)
		{
			if (String[i] > 96 && string.charAt(i) < 123)
			{
				strl = tangible.StringFunctions.changeCharacter(strl, m, string.charAt(i));
				m++;
			}
		}
		if (m == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = m - 1;i >= 0;i--)
			{
				for (j = 0;j < m - 1;j++)
				{
					if (strl.charAt(j) > strl.charAt(j + 1))
					{
						char c;
						c = strl.charAt(j);
						strl = tangible.StringFunctions.changeCharacter(strl, j, strl.charAt(j + 1));
						strl = tangible.StringFunctions.changeCharacter(strl, j + 1, c);
					}
				}
			}
			for (j = 0;j < m;j++)
			{
				if (f[j] != 1)
				{
					sum[strl.charAt(j)] = 1;
					for (t = 1;t < m - j;t++)
					{
						if (strl.charAt(j) == strl.charAt(j + t))
						{
							sum[strl.charAt(j)]++;
							f[j + t] = 1;
						}
					}
				}
			}
			for (j = 0;j < m;j++)
			{
				if (f[j] != 1)
				{
					System.out.printf("\n%c=%d",strl.charAt(j),sum[strl.charAt(j)]);
				}
			}
		}
		return 0;
	}
}


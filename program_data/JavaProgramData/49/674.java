package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		int i = 0;
		int j = 0;
		int count = 0;
		int k1 = 0;
		int k2 = 0;
		int l = 0;
		int num = 0;
		int m = 0;
		char c = System.in.read();
		while ('\n' != c)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, c);
			i++;
			c = System.in.read();
		}
		count = i; //???????????????
		for (i = 2;i <= count;i++)
		{
			for (j = 0;j <= count - i;j++)
			{
				num = 0;
				final String b = "";
				final String d = "";
				for (k1 = j;k1 < i + j;k1++)
				{
					b = tangible.StringFunctions.changeCharacter(b, k1, a.charAt(k1));
				}
				for (k2 = j;k2 < i + j;k2++)
				{
					d = tangible.StringFunctions.changeCharacter(d, k2, a.charAt(i + j - k2 - 1 + j)); //????2????????????????
				}
				for (l = j;l < i + j;l++)
				{
					if (b.charAt(l) == d.charAt(l))
					{
						num++;
					}
				}
				if (num == i)
				{
					for (m = j;m < i + j;m++)
					{
						System.out.print(b.charAt(m));
					}
					System.out.print('\n');
				}
				else
				{
					continue;
				}
			} //????????????????
		}

		return 0;
	}
}


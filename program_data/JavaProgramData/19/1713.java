package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String[] s = {"\0"}; //???????
		final String a = "\0";
		final String b = "\0";
		int i;
		int j;
		int x = 0;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				cin.get(s[i][j]);
				if (s[i][j] == 32)
				{
					s[i][j] = 0;
					j = 100;
				}
				else if (s[i][j] == 10)
				{
					s[i][j] = 0;
					j = i = 100;
				}
			}
		} //?????????????
		for (j = 0;j < 100;j++)
		{
			cin.get(a.charAt(j));
			if (a.charAt(j) == 32 || a.charAt(j) == 10)
			{
				a = a.substring(0, j);
				break;
			}
		} //????????a
		for (j = 0;j < 100;j++)
		{
			cin.get(b.charAt(j));
			if (b.charAt(j) == 32 || b.charAt(j) == 10)
			{
				b = b.substring(0, j);
				break;
			}
		} //????????b
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				if (a.charAt(j) == s[i][j])
				{
					x = x + 1;
				}
			}
			if (x == 100)
			{
				for (j = 0;j < 100;j++)
				{
					s[i][j] = b.charAt(j);
				}
			}
			else
			{
				x = 0;
			}
		} //????
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				if (s[i][j] != 0 && s[i][j + 1] == 0 && s[i + 1][0] != 0)
				{
					System.out.print(s[i][j]);
					System.out.print(" ");
				}
				else if (s[i][j] != 0)
				{
					System.out.print(s[i][j]);
				}
			}
		} //????
		return 0;
	}
}

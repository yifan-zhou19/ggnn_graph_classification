package <missing>;

public class GlobalMembers
{
	public static int flag = 0;
	public static String t = new String(new char[6]);
	public static String ok = new String(new char[6]);
	public static int[] f = new int[6];

	public static int yes()
	{
		int i;
		for (i = 0; i < 2; i++)
		{
			switch (t.charAt(i))
			{
				case 'A':
					return 0;
				case 'B':
					if (i != 1)
					{
						return 0;
					}
					else
					{
						break;
					}
				case 'C':
					if (t.charAt(4) != 'A')
					{
						return 0;
					}
					else
					{
						break;
					}
				case 'D':
					if (t.charAt(0) == 'C')
					{
						return 0;
					}
					else
					{
						break;
					}
				case 'E':
					if (t.charAt(0) != 'D')
					{
						return 0;
					}
					else
					{
						break;
					}
			}
		}
		for (i = 2; i < 5; i++)
		{
			switch (t.charAt(i))
			{
				case 'A':
					if (t.charAt(0) == 'E')
					{
						return 0;
					}
					else
					{
						break;
					}
				case 'B':
					break;
				case 'C':
					if (t.charAt(4) == 'A')
					{
						return 0;
					}
					else
					{
						break;
					}
				case 'D':
					if (t.charAt(0) != 'C')
					{
						return 0;
					}
					else
					{
						break;
					}
				case 'E':
					if (t.charAt(0) == 'D')
					{
						return 0;
					}
					else
					{
						break;
					}
			}
		}
		return 1;
	}

	public static int work(int k)
	{
		if (flag == 1)
		{
			return 0;
		}
		int i;
		if (k == 6)
		{
			if (yes() == 1)
			{
				for (i = 0;i < 5;i++)
				{
					ok = tangible.StringFunctions.changeCharacter(ok, i, t.charAt(i));
				}
				ok = tangible.StringFunctions.changeCharacter(ok, 6, '\0');
				flag = 1;
			}
			return 0;
		}
		for (i = 0; i < 5; i++)
		{
			if (f[i] == 1)
			{
				continue;
			}
			if (k == 1)
			{
				if (i == 0 || i == 4)
				{
					continue;
				}
			}
			if (i == 4)
			{
				if (k == 2 || k == 3)
				{
					continue;
				}
			}
			t = tangible.StringFunctions.changeCharacter(t, k - 1, 'A' + i);
			t = tangible.StringFunctions.changeCharacter(t, k, '\0');
			f[i] = 1;
			work(k + 1);
			f[i] = 0;
			t = tangible.StringFunctions.changeCharacter(t, k - 1, '\0');
			if (flag == 1)
			{
				return 0;
			}
		}
		return 0;
	}

	public static int Main()
	{
		int[] ans = new int[6];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(f, 0, (Integer.SIZE / Byte.SIZE));
		work(1);
		for (i = 0; i < 5; i++)
		{
			ans[ok.charAt(i) - 'A'] = i + 1;
		}
		for (i = 0; i < 4; i++)
		{
			System.out.printf("%d ", ans[i]);
		}
		System.out.printf("%d\n", ans[4]);
		return 0;
	}

}


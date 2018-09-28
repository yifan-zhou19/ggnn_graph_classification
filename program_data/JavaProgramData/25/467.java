package <missing>;

public class GlobalMembers
{
	public static String r = new String(new char[101]);
	public static int Main()
	{
		int N;
		int i;
		int j;
		int k;
		int num;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		r = tangible.StringFunctions.changeCharacter(r, 0, '1');
		if (N == 0)
		{
			System.out.print(1);
			return 0;
		}
		else
		{
			for (i = 1;i <= N;i++)
			{
				  k = 0;
				  for (j = 0;j < r.length();j++)
				  {
						if (r.charAt(j) >= '0' && r.charAt(j) <= '4')
						{
							r = tangible.StringFunctions.changeCharacter(r, j, '0' + 2 * (r.charAt(j) - '0') + k);
							k = 0;
						}
						else
						{
							r = tangible.StringFunctions.changeCharacter(r, j, '0' + 2 * (r.charAt(j) - '5') + k);
							k = 1;
						}
				  }
					if (k == 1)
					{
						r = tangible.StringFunctions.changeCharacter(r, j, '1');
					}

			}
		}
		for (i = r.length() - 1;i >= 0;i--)
		{
		System.out.print(r.charAt(i));
		}
		return 0;
	}


}


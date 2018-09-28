package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[40]);
		for (int y = 0 ; y <= 39 ; y++)
		{
			a = tangible.StringFunctions.changeCharacter(a, y, '0');
		}
		a = tangible.StringFunctions.changeCharacter(a, 0, '1');
		int[] b = new int[40];
		int c = 0;
		for (int i = 0 ; i < n ; i++)
		{
			for (int j = 0 ; j <= 39 ; j++)
			{
				b[j] = (int)((a.charAt(j) - '0') * 2 + c);
				c = 0;
				if (b[j] >= 10)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, (char)(b[j] - 10 + '0'));
					c = 1;
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, (char)(b[j] + '0'));
				}
			}
		}
		int k = 39;
		for (; k >= 0 ; k--)
		{
			if ((a.charAt(k) - '0') != 0)
			{
				break;
			}
		}
		for (; k >= 0 ; k--)
		{
			System.out.print(a.charAt(k));
		}
		return 0;
	}
}


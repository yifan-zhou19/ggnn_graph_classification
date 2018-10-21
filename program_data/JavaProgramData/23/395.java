package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int s = 0;
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		n = c.length();
		d = tangible.StringFunctions.changeCharacter(d, n, '\0');
		for (i = 0;i < n;i++)
		{
			if (((c > 0) && (c.charAt(i - 1) == ' ')) || (i == 0) && (c.charAt(i) != ' '))
			{
				for (j = i;j < n;j++)
				{
					if (c.charAt(j) == ' ')
					{
						break;
					}
				}
				m = j - i;
				s = s + m;
				for (k = i;k < j;k++)
				{
					d = tangible.StringFunctions.changeCharacter(d, n - s + k - i, c.charAt(k));
				}
			}
			if (c.charAt(i) == ' ')
			{
				s = s + 1;
				d = tangible.StringFunctions.changeCharacter(d, n - s, c.charAt(i));
			}
		}
		System.out.println(d);
		return 0;
	}

}


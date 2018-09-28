package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1001]);
		String c = new String(new char[1001]);
		s = new Scanner(System.in).nextLine();
		c = tangible.StringFunctions.changeCharacter(c, 0, s.charAt(0));
		int i;
		int j;
		int t = 0;
		int[] a = new int[300];
		for (i = 1,j = 1;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
				c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(i));
				j++;
			}
			else
			{
				if (s.charAt(i - 1) != ' ')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(i));
					j++;
				}
			}
		}
		c = tangible.StringFunctions.changeCharacter(c, j, ' ');
		c = tangible.StringFunctions.changeCharacter(c, j + 1, '\0');
		for (i = 0,j = 0;c.charAt(i) != '\0';i++)
		{
			j++;
			if (c.charAt(i) == ' ')
			{
				a[t] = j - 1;
				t++;
				j = 0;
			}
		}
		for (i = 0;i < t - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[i]);
		return 0;
	}

}


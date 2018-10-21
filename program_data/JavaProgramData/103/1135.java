package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len;
		int[] a = new int[1000];
		final String str = "0";
		final String c = "0";
		str = new Scanner(System.in).nextLine();
		len = str.length();
		j = 0;
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) <= 122 && str.charAt(i) >= 97)
			{
				str.charAt(i) -= 32;
			}
		}
		c = tangible.StringFunctions.changeCharacter(c, 0, str.charAt(0));
		for (i = 0;i < len;i++)
		{
			if (c.charAt(j) == str.charAt(i))
			{
				a[j]++;
			}
			else
			{
				j++;
				c = tangible.StringFunctions.changeCharacter(c, j, str.charAt(i));
				a[j]++;
			}
		}
		for (i = 0;i <= j;i++)
		{
			System.out.printf("(%c,%d)",c.charAt(i),a[i]);
		}
		return 0;
	}
}


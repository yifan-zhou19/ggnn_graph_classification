package <missing>;

public class GlobalMembers
{
	public static void sub(String c)
	{
		int i;
		int l;
		l = c.length();
		for (i = 0;i < l;i++)
		{
			if (c[i].equals(','))
			{
				c[i] = ' ';
			}
		}
	}

	public static void Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int l;
		int max = 0;
		int rmax = 0;
		int min = 0;
		int rmin = 0;
		final String c = "";
		final String word = "";
		c = new Scanner(System.in).nextLine();
		sub(c);
		l = c.length();
		for (i = 0;i < l;i++)
		{
			if (c.charAt(i) == ' ')
			{
				j++;
				word.charAt(j)[k] = '\0';
				k = 0;
			}
			else
			{
				word.charAt(j)[k] = c.charAt(i);
				k++;
			}
		}
		min = String.valueOf(word.charAt(0)).length();
		max = String.valueOf(word.charAt(0)).length();
		for (;j >= 0;j--)
		{
			l = String.valueOf(word.charAt(j)).length();
			if (l >= max)
			{
				max = l;
				rmax = j;
			}
			if (l <= min != 0 && l>0)
			{
				min = l;
				rmin = j;
			}
		}
		System.out.printf("%s\n",word.charAt(rmax));
		System.out.printf("%s\n",word.charAt(rmin));
	}
}

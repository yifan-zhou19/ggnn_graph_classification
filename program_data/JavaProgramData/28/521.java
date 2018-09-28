package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[2000]);
		int[] a = new int[50];
		int ci;
		int i;
		int j;
		int k;
		int n;
		int len;
		for (k = 0;k <= 40;k++)
		{
			a[k] = 0;
		}
		c = new Scanner(System.in).nextLine();
		len = c.length();
		c = tangible.StringFunctions.changeCharacter(c, len, ' ');
		ci = 1;
		j = 1;
		for (i = 1;i <= len;i++)
		{
			if (c.charAt(i - 1) != ' ' && c.charAt(i) != ' ')
			{
				j = j + 1;
			}
			else if (c.charAt(i - 1) == ' ' && c.charAt(i) != ' ')
			{
				ci = ci + 1;
				j = 1;
			}
			else if (c.charAt(i - 1) != ' ' && c.charAt(i) == ' ')
			{
				a[ci] = j;
			}

		}

	for (i = 1;i <= ci - 1;i++)
	{
		System.out.printf("%d,",a[i]);
	}
	System.out.printf("%d\n",a[ci]);
	}
}


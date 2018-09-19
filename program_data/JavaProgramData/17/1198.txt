package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		int h;
		int i;
		int j;
		int k;
		int n;
		int[] a = new int[101];
		int[] b = new int[101];
		while ((gets(c)) != '\0')
		{
			j = 0;
			k = 0;
			System.out.println(c);
			n = c.length();
			for (i = 0;i < n;i++)
			{
				if ((c.charAt(i) != '(') && (c.charAt(i) != ')'))
				{
					c = tangible.StringFunctions.changeCharacter(c, i, ' ');
				}
				else if (c.charAt(i) == '(')
				{
					j++;
					a[j] = i;
				}
				else
				{
					k++;
					b[k] = i;
				}
			}
			for (h = 1;h <= k;h++)
			{
				for (i = j;i >= 1;i--)
				{
					if (a[i] < b[h])
					{
						c = tangible.StringFunctions.changeCharacter(c, b[h], ' ');
						c = tangible.StringFunctions.changeCharacter(c, a[i], ' ');
						b[h] = -1;
						a[i] = 101;
						break;
					}
				}
			}
			for (i = 1;i <= j;i++)
			{
				if (a[i] != 101)
				{
					c = tangible.StringFunctions.changeCharacter(c, a[i], '$');
				}
			}
			for (h = 1;h <= k;h++)
			{
				if (b[h] != -1)
				{
					c = tangible.StringFunctions.changeCharacter(c, b[h], '?');
				}
			}
			System.out.println(c);
		}
		return 0;
	}
}


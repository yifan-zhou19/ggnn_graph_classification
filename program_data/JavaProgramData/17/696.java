package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		int i;
		int[] a = new int[101];
		int j = 0;
		int k;
		while (scanf("%s", c) != EOF)
		{
			System.out.println(c);
			for (i = 0;;i++)
			{
				if (c.charAt(i) == '\0')
				{
					break;
				}
				else
				{
					if (c.charAt(i) == '(')
					{
						j++;
						a[j] = i;
					}
					else if (c.charAt(i) == ')')
					{
						if (j > 0)
						{
							c = tangible.StringFunctions.changeCharacter(c, i, ' ');
							c = tangible.StringFunctions.changeCharacter(c, a[j], ' ');
							j--;
						}
					}
				}
			}
			for (k = 0;k < i;k++)
			{
				if (c.charAt(k) == '(')
				{
					System.out.print("$");
				}
				else if (c.charAt(k) == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			j = 0;
			System.out.print("\n");
		}
	}

}


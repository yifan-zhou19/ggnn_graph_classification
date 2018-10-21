package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[200]);
		char p;
		char q;
		int i;
		int j;
		int k;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		while ((c = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		n = c.length();
		k = 0;
		p = c.charAt(0);
		q = c.charAt(n - 1);
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) == q)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (c.charAt(j) != p && c.charAt(j) != q)
					{
						continue;
					}
					else if (c.charAt(j) == p)
					{
						a[k] = j;
						b[k] = i;
						c = tangible.StringFunctions.changeCharacter(c, i, 'o');
						c = tangible.StringFunctions.changeCharacter(c, j, 'o');
						k++;
						break;
					}
					else if (c.charAt(j) == '(')
					{
						break;
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
			System.out.print(b[i]);
			System.out.print("\n");
		}
		}
		return 0;
	}
}


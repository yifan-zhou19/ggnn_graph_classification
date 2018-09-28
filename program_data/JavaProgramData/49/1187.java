package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[500]);
	   String b = new String(new char[500]);
	   String c = new String(new char[500]);
	   int i;
	   int k;
	   int j;
	   int l;
	   int m;
	   int h;
	   int x;
	   a = new Scanner(System.in).nextLine();
	   int n = a.length();

	   for (i = 1;i < n;i++)
	   {
		for (j = 0;j < n - i;j++)
		{
			m = 0;
			x = 0;
			for (k = j;k <= j + i;k++)
			{
				b = tangible.StringFunctions.changeCharacter(b, m, a.charAt(k));
				m++;
			}
			for (l = 0;l < m;l++)
			{
				c = tangible.StringFunctions.changeCharacter(c, l, b.charAt(m - 1 - l));
			}
			for (h = 0;h < m;h++)
			{
				if (b.charAt(h) != c.charAt(h))
				{
				 x++;
				}
				else
				{
					x = x;
				}
			}
			if (x == 0)
			{
				for (k = j;k <= j + i;k++)
				{
				System.out.printf("%c",a.charAt(k));
				}
				System.out.print("\n");
			}
		}
	   }
	   return 0;
	}

}


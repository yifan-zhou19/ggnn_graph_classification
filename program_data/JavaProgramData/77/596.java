package <missing>;

public class GlobalMembers
{
	/* title :????*
	* author : ???*
	* time : 2011.11.9 */


	public static int[][] a = new int[100][2];
	public static String c = new String(new char[100]);
	public static char b;
	public static int n;

	public static void combine(String c, int i)
	{
		int m;
		int j;
		int k;
		m = c.length();
		for (j = 0; j < m; j++)
		{
			if (!c[j].equals(b) && !c[j].equals(' '))
			{
				c[j] = ' ';
				a[i][1] = j;
				for (k = j - 1; k >= 0; k--)
				{
					if (c[k].equals(b))
					{
						a[i][0] = k;
						c[k] = ' ';
						break;
					}
				}
				break;
			}
		}
		if (i < n / 2 - 1)
		{
			combine(c, i + 1);
		}
	}


	public static int Main()
	{
		int j;
		int k;
		int t;
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = c.length();
		b = c.charAt(0);
		combine(c, 0);
			  for (j = 0; j < n / 2; j++)
			  {
			System.out.print(a[j][0]);
			System.out.print(" ");
			System.out.print(a[j][1]);
			System.out.print("\n");
			  }
		return 0;
	}



}


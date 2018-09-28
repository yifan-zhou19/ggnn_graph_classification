package <missing>;

public class GlobalMembers
{
	public static String b = new String(new char[101]);
	public static void reorder(String a)
	{
		int i;
		int l;
		char temp0;
		l = a.length();
		for (i = 0; i < l; i++)
		{
		  b = tangible.StringFunctions.changeCharacter(b, i, a[l - i - 1]);
		}
	}
	public static int Main()
	{
		char[][] bjs = new char[101][101];
		char[][] js = new char[101][101];
		char temp;
		int i;
		int j;
		int k;
		int p;
		int n;
		int l1;
		int l2;
		int[] c = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
		  bjs[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		  js[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 1; i <= n; i++)
		{
			l1 = String.valueOf(bjs[i]).length();
			l2 = String.valueOf(js[i]).length();
			reorder(bjs[i]);
			for (j = 0; j < l1; j++)
			{
			  bjs[i][j] = b.charAt(j);
			}
			reorder(js[i]);
			for (j = 0; j < l2; j++)
			{
			  js[i][j] = b.charAt(j);
			}
			for (j = l2; j < l1; j++)
			{
			  js[i][j] = '0';
			}
			for (j = 0; j < l1; j++)
			{
				if (bjs[i][j] < js[i][j])
				{
					bjs[i][j] += 10;
					bjs[i][j + 1] -= 1;
				}
				c[j] = bjs[i][j] - js[i][j];
			}
			for (k = l1 - 1; k >= 0; k--)
			{
			  if (c[k] != 0)
			  {
				break;
			  }
			}
			if (k == -1)
			{
			  System.out.print(0);
			}
			else
			{
			  for (p = k; p >= 0; p--)
			  {
				   System.out.print(c[p]);
			  }
			}
			System.out.print("\n");
		}
		return (0);
	}
}


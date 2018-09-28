package <missing>;

public class GlobalMembers
{
	public static int jodge(String s, int x, int y)
	{
		int i;
		int k = 0;
		for (i = x;i < x + (y - x + 1) / 2;i++)
		{
			if (!s[i].equals(s[y + x - i]))
			{
				return 0;
			}
			else
			{
				k++;
			}
		}
		if (k == (y - x + 1) / 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void f(String s, int x)
	{
		 int j;
		 int i;
		 int k;
		 for (i = 2;i <= x;i++)
		 {
			 for (j = 0;j < x + 1 - i;j++)
			 {
				if (jodge(s, j, j + i - 1) == 1)
				{
					for (k = j;k <= j + i - 1;k++)
					{
					 System.out.printf("%c",s[k]);
					}
					 System.out.print("\n");
				}
			 }
		 }

	}
	public static int Main()
	{
		String s = new String(new char[501]);
		int i;
		int j;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		k = s.length();
		f(s, k);
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[501]);
	public static int i;
	public static int j;
	public static int l;
	public static void even(int k)
	{
		 for (i = (k / 2);i < s.length() - (k / 2);i++)
		 {
			 for (j = 0;j <= (k / 2);j++)
			 {
				if (s.charAt(i - j) != s.charAt(i + 1 + j))
				{
					break;
				}
				if (j == (k / 2))
				{
					for (l = i - j;l <= i + 1 + j;l++)
					{
					System.out.print(s.charAt(l));
					}
					System.out.print("\n");
				}
			 }
		 }
	}
	public static void odd(int k)
	{
		for (i = (k / 2 + 1);i <= s.length() - (k / 2 + 1);i++)
		{
			for (j = 1;j <= (k / 2 + 1);j++)
			{
				if (s.charAt(i - j) != s.charAt(i + j))
				{
					break;
				}
				if (j == (k / 2 + 1))
				{
					for (l = i - j;l <= i + j;l++)
					{
					System.out.print(s.charAt(l));
					}
					System.out.print("\n");
				}
			}
		}
	}
	public static int Main()
	{
		int k = 0;
		cin.get(s,500);
		while (true)
		{
			odd(k);
			k++;
			if (k == s.length() - 2)
			{
				break;
			}
			even(k);
			k++;
			if (k == s.length())
			{
				break;
			}
		}
		return 0;
	}


}

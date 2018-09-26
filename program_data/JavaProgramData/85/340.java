package <missing>;

public class GlobalMembers
{
	public static void fun(String[] s, int n)
	{
		int l;
		int t;
		for (i = 0;i < n;i++)
		{
			t = 1;
			l = s[i].length();
			for (j = 0;j < l;j++)
			{
				if ((s[i][j].compareTo('0') >= 0 && s[i][j].compareTo('9') <= 0) || (s[i][j].compareTo('a') >= 0 && s[i][j].compareTo('z') <= 0) || (s[i][j].compareTo('A') >= 0 && s[i][j].compareTo('Z') <= 0) || (s[i][j].equals('_')))
				{
					t *= 1;
				}
				else
				{
					t *= 0;
					break;
				}
			}
			if (t == 0 || (s[i][0].compareTo('0') >= 0 && s[i][0].compareTo('9') <= 0))
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
	}
	public static int i;
	public static int j;
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s = new char[100][31];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		fun(s, n);
	}
}


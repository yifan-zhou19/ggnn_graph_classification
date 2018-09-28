package <missing>;

public class GlobalMembers
{
	public static char[][] st = new char[100][21];
	public static int n;
	public static int i;
	public static int boo;
	public static int check(char s)
	{
		int m;
		int j;
		m = String.valueOf(st[s]).length();
		if (st[s][0] <= 57 && st[s][0] >= 48)
		{
		return 0;
		}
		for (j = 0;j < m;j++)
		{
			if (st[s][j] < 48 || st[s][j]>57 && st[s][j] < 65 || st[s][j]>122 || st[s][j] > 90 && st[s][j] < 97 && st[s][j] != 95)
			{
			return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		st[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			boo = check(i);
			if (boo == 1)
			{
			System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}


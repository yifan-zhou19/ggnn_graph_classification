package <missing>;

public class GlobalMembers
{
	public static char[][] st = new char[1000][256];
	public static int n;
	public static int i;
	public static int l;
	public static int j;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			st[i] = tempVar2.charAt(0);
		}
		l = String.valueOf(st[i]).length();
		for (j = 0;j <= l;j++)
		{
			if (st[i][j] == 'A')
			{
				System.out.print("T");
			}
			else if (st[i][j] == 'T')
			{
				System.out.print("A");
			}
			else if (st[i][j] == 'C')
			{
				System.out.print("G");
			}
			else if (st[i][j] == 'G')
			{
				System.out.print("C");
			}
		}
		System.out.print("\n");
		}
		return 0;
	}




}


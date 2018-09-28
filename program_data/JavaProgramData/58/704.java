package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		char[][] a = new char[500][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			l = String.valueOf(a[i]).length();
			if (a[i][0] == '_' || (a[i][0] <= 'z' && a[i][0] >= 'a') || (a[i][0] <= 'Z' && a[i][0] >= 'A'))
			{
				for (j = 0;j < l;j++)
				{
					if ((a[i][j] <= 'z' && a[i][j] >= 'a') || (a[i][j] <= 'Z' && a[i][j] >= 'A') || (a[i][j] <= '9' && a[i][j] >= '0') || a[i][j] == '_')
					{
						continue;
					}
					else
					{
						System.out.print("0\n");
						break;
					}
				}
				if (j == l)
				{
					System.out.print("1\n");
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
		return 0;
	}



}


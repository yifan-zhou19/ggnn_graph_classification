package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] length = new int[1000];
		char[][] a = new char[1000][20];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			length[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] >= 48 && a[i][0] <= 57)
			{
				System.out.print("no");

			}
			else
			{
				for (j = 0;j < 20;j++)
				{
					if (a[i][j] < 48)
					{
						break;
					}
					else if (a[i][j] >= 58 && a[i][j] <= 64)
					{
						break;
					}
					else if (a[i][j] >= 91 && a[i][j] <= 94 || a[i][j] == 96)
					{
						break;
					}
					else if (a[i][j] >= 123 && a[i][j] <= 126)
					{
						break;
					}

				}
				if (j >= length[i])
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
				System.out.print("\n");

			}
			System.out.print("\n");
		}
		return 0;
	}
}


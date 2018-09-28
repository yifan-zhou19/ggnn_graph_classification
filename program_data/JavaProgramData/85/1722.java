package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		char[][] a = new char[20][20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(a[i]).length();
			if ((a[i][0] >= 65 && a[i][0] <= 90) || (a[i][0] >= 96 && a[i][0] <= 122) || (a[i][0] == '_'))
			{
				int num = 1;
				for (j = 1;j < 20;j++)
				{
					if (!((a[i][j] >= 65 && a[i][j] <= 90) || (a[i][j] >= 97 && a[i][j] <= 122) || (a[i][j] == '_') || (a[i][j] >= '0' && a[i][j] <= '9')))
					{
						break;
					}
					num++;
				}
				if (num == l)
				{
					System.out.print("yes");
					System.out.print("\n");
				}
				else
				{
					System.out.print("no");
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}


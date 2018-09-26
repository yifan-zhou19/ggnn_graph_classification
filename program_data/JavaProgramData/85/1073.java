package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		char[][] a = new char[100][21];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (int i = 0;i < n;i++)
		{
			int tag = 0;
			if (!((a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z') || a[i][0] == '_'))
			{
				System.out.print("no");
				System.out.print("\n");
				continue;
			}
			else
			{
				t = String.valueOf(a[i]).length();
				for (int j = 1;j < t;j++)
				{
					if ((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= '0' && a[i][j] <= '9') || a[i][j] == '_')
					{
						continue;
					}
					else
					{
						tag = 1;
						System.out.print("no");
						System.out.print("\n");
						break;
					}
				}
				if (tag == 0)
				{
				 System.out.print("yes");
				 System.out.print("\n");
				}
			}
		}
		return 0;
	}
}


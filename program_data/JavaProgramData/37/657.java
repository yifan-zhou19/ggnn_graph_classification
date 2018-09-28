package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int flag = 1;
		char[][] a = new char[100][10000];
		int[] num = new int[27];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < t ; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0; a[i][j] != '\0'; j++)
			{
				flag = 1;
				for (k = 0 ; a[i][k] != '\0'; k++)
				{
					if (k == j)
					{
						continue;
					}
					if (a[i][j] == a[i][k])
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					break;
				}
			}
			if (flag != 0)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
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


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[t][100000];
		for (i = 0;i < t;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (k = 0;k < t;k++)
		{
			int length = String.valueOf(a[k]).length();
			for (i = 0;i < length;i++)
			{
				for (j = 0;j < length;j++)
				{
					if (a[k][i] == a[k][j] && i != j)
					{
						break;
					}
				}
				if (j == length)
				{
					System.out.print(a[k][i]);
					System.out.print("\n");
					break;
				}
			}
			if (i == length)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}


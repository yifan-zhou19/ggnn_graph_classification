package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int count;
		int[] d = new int[100];
		char[][] c = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			c[i] = new Scanner(System.in).nextLine();
			d[i] = String.valueOf(c[i]).length();
		}
		for (i = 0;i <= n;i++)
		{
			for (j = 0;j < d[i];j++)
			{
				count = 0;
				for (k = j + 1;k < 100;k++)
				{
					if (c[i][k] == c[i][j])
					{
						count = 1;
						break;
					}
				}
				for (k = 0;k < j;k++)
				{
					if (c[i][k] == c[i][j])
					{
						count = 1;
						break;
					}
				}
				if (count == 0 && j < 100)
				{
					System.out.printf("%c\n",c[i][j]);
					break;
				}
				else if (j == d[i] - 1)
				{
					System.out.print("no\n");
				}
			}
		}
	}
}


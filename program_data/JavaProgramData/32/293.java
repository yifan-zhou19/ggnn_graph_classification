package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int n = 0;
		char[][] a = new char[100][205];
		char[][] b = new char[100][205];
		int[][] sa = new int[100][205];
		int[][] sb = new int[100][205];
		int len1;
		int len2;
		int flag = 0;

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
				a + i = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b + i = tempVar3;
			}
		}

			for (i = 0;i < n;i++)
			{
				len1 = String.valueOf(a[i]).length();
				for (j = 0;j < len1;j++)
				{
					sa[i][j] = a[i][len1 - 1 - j] - '0';
				}
			}
			for (i = 0;i < n;i++)
			{
				len2 = String.valueOf(b[i]).length();
				for (j = 0;j < len2;j++)
				{
					sb[i][j] = b[i][len2 - 1 - j] - '0';
				}
			}

			for (i = 0;i < n;i++)
			{
				len2 = String.valueOf(b[i]).length();
				for (j = 0;j < len2;j++)
				{
					sa[i][j] -= sb[i][j];
					if (sa[i][j] < 0)
					{
						sa[i][j] += 10;
						sa[i][j + 1] -= 1;
					}
				}
			}


			for (i = 0;i < n;i++)
			{
				len1 = String.valueOf(a[i]).length();
				for (j = len1 - 1;j >= 0;j--)
				{
					if (flag == 0)
					{
						if (sa[i][j] != 0)
						{
							flag = 1;
							System.out.printf("%d",sa[i][j]);
						}
					}
					else
					{
						System.out.printf("%d",sa[i][j]);
					}
				}
				System.out.print("\n");
				flag = 0;
			}

	}
}


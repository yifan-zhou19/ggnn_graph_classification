package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len;
		int n;
		int left = 0;
		int right = 0;
		int k;
		String[] a = {"\0"};
		int[][] b = new int[10][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			len = String.valueOf(a[i]).length();
			for (j = 0;j < len;j++)
			{
				if (a[i][j] == '(')
				{
					b[i][j] = -1;
					left++;
				}
				if (a[i][j] == ')')
				{
					b[i][j] = 1;
					right++;
				}
			}



				for (j = 0;left != 0,right != 0,j < len;j++)
				{
					if (b[i][j] == 1)
					{

						for (k = j - 1;k >= 0;k--)
						{
							if (b[i][k] == -1)
							{
								b[i][k] = 0;
								b[i][j] = 0;
								left--;
								right--;
								break;
							}
						}
					}
				}
		}



		for (i = 0;i < n;i++)
		{
			System.out.println(a[i]);
			len = String.valueOf(a[i]).length();
			for (j = 0;j < len;j++)
			{
					if (b[i][j] == -1)
					{
						System.out.print("$");
					}
					if (b[i][j] == 1)
					{
						System.out.print("?");
					}
					if (b[i][j] == 0)
					{
						System.out.print(" ");
					}
			}
			System.out.print("\n");
		}

	return 0;

	}
}


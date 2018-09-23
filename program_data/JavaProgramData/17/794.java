package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[30][120];
		int j;
		int n;
		int i;
		int[] b = new int[30];
		int k;
		int[][] zuo = new int[30][120];
		int[][] you = new int[30][120];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j <= 119;j++)
			{
				zuo[i][j] = 0;
				you[i][j] = 0;
			}
		}
		for (i = 1;i <= n;i++)
		{
			k = 0;

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			b[i] = String.valueOf(a[i]).length();
			for (j = b[i] - 1;j >= 0;j--)
			{

				if (a[i][j] == '(')
				{
					if (k == 0)
					{
						zuo[i][j] = 1;
					}
					if (k > 0)
					{

						k -= 1;
					}
				}


				else if (a[i][j] == ')')
				{
					k += 1;
				}
			}
			k = 0;
			for (j = 0;j <= b[i] - 1;j++)
			{
				if (a[i][j] == ')')
				{
					if (k == 0)
					{
						you[i][j] = 1;
					}
					if (k > 0)
					{

						k -= 1;
					}
				}
				else if (a[i][j] == '(')
				{
					k += 1;
				}
			}
			System.out.printf("%s\n",a[i]);
			for (j = 0;j <= b[i] - 1;j++)
			{
				if (zuo[i][j] == 1)
				{
					System.out.print("$");
				}
				else if (you[i][j] == 1)
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}









				return 0;
	}


}


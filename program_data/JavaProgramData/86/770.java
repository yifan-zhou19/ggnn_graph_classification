package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int[][] a = new int[100][20];
		int[] num = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i] = 0;
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1;j <= a[i][0];j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (a[i][0] == 0)
			{
				num[i] = 60;
			}
			else
			{
				for (j = 1;j <= a[i][0];j++)
				{
					sum = a[i][j] + 3 * j;
					if (sum > 60)
					{
						if (a[i][j] + 3 * (j - 1) < 60)
						{
						  num[i] = a[i][j];
						}
						else
						{
						   num[i] = 60 - 3 * (j - 1);
						}
						break;
					}
				}
			}
			if (num[i] == 0)
			{
				num[i] = 60 - 3 * a[i][0];
			}
			else
			{
				num[i] = num[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(num[i]);
			System.out.print("\n");
		}
	   return 0;
	}

}


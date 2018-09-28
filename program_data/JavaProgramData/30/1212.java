package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int sum = 0;
		int[][] a = new int[10][10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= 9)
		{
			while (j <= 9)
			{
				if ((i == 7) || (j == 7) || (i * 10 + j) % 7 == 0)
				{
					a[i][j] = 0;
				}
				else
				{
					a[i][j] = i * 10 + j;
				}
				sum = sum + a[i][j] * a[i][j];
				j++;
				if (i * 10 + j > n)
				{
					break;
				}
			}
			if (i * 10 + j > n)
			{
				break;
			}
			j = 0;
			i++;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}


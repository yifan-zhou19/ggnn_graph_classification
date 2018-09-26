package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] sushu = new int[9999];
		for (j = 2;j <= n;j++)
		{
			for (i = 2;i <= j;i++)
			{
				if (j % i == 0)
				{
					break;
				}
			}
			if (i == j)
			{
				sushu[j] = j;
			}
		}
		for (m = 2;m <= n / 2;m++)
		{
			for (j = 0;j <= n;j++)
			{
				if (m == sushu[j])
				{
					for (i = 0;i <= n;i++)
					{
					if ((n - m) == sushu[i])
					{
						System.out.print(sushu[j]);
						System.out.print(" ");
						System.out.print(sushu[i]);
						System.out.print("\n");
					}
					}
				}
			}
		}
		return 0;
	}

}


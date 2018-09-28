package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[101][101];
		int k;
		int m;
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer1;
		int pointer1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer2;
		int pointer2;
		int i1;
		int i2;
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i1 = 0;i1 < m;i1++)
			{
				for (i2 = 0;i2 < n;i2++)
				{
					s[i1][i2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			pointer1 = s[0][1];
			pointer2 = s[0][0];
			for (i1 = 1;i1 < n - 1;i1++)
			{
				pointer1 = s[0][i1];
				sum += pointer1;
			}
			for (i1 = 0;i1 < m;i1++)
			{
				if (n != 1)
				{
				pointer1 = s[i1][n - 1];
				pointer2 = s[i1][0];
				sum = sum + pointer1 + pointer2;
				}
				else
				{
					pointer2 = s[i1][0];
				sum = sum + pointer1 + pointer2;
				}
			}
			for (i1 = 1;i1 < n - 1;i1++)
			{
				pointer2 = s[m - 1][i1];
				sum += pointer2;
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}


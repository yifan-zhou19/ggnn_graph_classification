package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[200][200];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[200];
		int[] p = new int[200];
		for (int i = 0;i <= 200;i++)
		{
			p[i] = array[i];
		}
		int k = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			int m = 0;
			int n = 0;
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < m;j++)
			{
				for (int l = 0;l < n;l++)
				{
					p[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (j == 0 || l == 0 || j == m - 1 || l == n - 1)
					{
						sum += p[j][l];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}


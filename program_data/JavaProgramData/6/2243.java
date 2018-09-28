package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			int m;
			int n;
			int j;
			int l;
			int s = 0;
			int[] A = new int[110];
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				for (l = 0;l < n;l++)
				{
				   A[l] = ConsoleInput.readToWhiteSpace(true);
				}
				if (j == 0 || j == m - 1)
				{
					for (l = 0;l < n;l++)
					{
						s = s + A[l];
					}
				}
				else
				{
					s = s + A[0] + A[n - 1];
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}

}


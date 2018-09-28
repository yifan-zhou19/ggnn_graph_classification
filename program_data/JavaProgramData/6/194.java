package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ???????????                  *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 12 ? 8 ?                    * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{
		int[][] a = new int[100][100];
		int k;
		int n;
		int m;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < k; i++)
		{
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0; j < m; j++)
			{
				for (int k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int[] p = a[0];
			for (; p < a[0] + n; p++) //  ????????
			{
				sum += p[0];
			}
			if (m == 1) // ?????
			{
				System.out.print(sum);
				System.out.print("\n");
				continue;
			}
			p = a[m - 1];
			for (; p < a[m - 1] + n; p++) // ?????????
			{
				sum += p[0];
			}
			int[] q = a + 1;
			for (; q <= a + m - 2; q++) // ????????????????????????
			{
				sum += q[0] + *(q + n - 1);
			}
			if (n == 1) // ?????
			{
				System.out.print((sum - a[0][0] - a[m - 1][0]) / 2 + a[0][0] + a[m - 1][0]);
				continue;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}


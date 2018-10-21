package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int[][] zb = new int[100][2];
		int k = 0;
		int s = 0;
		int[] p = new int[100];
		(int)(*b)[2];
		p = a;
		b = zb;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				if (*(p[i] + j) == 0)
				{
					*(*(b + k) + 0) = i;
					*(*(b + k) + 1) = j;
					k++;
				}
			}
		}
		s = (*(*(b + k - 1) + 0) - *(*(b + 0) + 0) - 1) * (*(*(b + k - 1) + 1) - *(*(b + 0) + 1) - 1);
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int temp;
		int m = 0;
		int p;
		int j;
		int[] a = new int[500];
		int[] b = new int[500];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < N; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 != 0)
			{
				b[m] = a[i];
				m = m + 1;
			}
		}
		for (i = 0; i < m - 1; i++)
		{
			p = i;
			for (j = i + 1; j < m; j++)
			{
				if (b[p] > b[j])
				{

					temp = b[p];
					b[p] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.print(b[0]);
		for (i = 1; i < m; i++)
		{
			System.out.print(',');
			System.out.print(b[i]);
		}
		return 0;
	}

}


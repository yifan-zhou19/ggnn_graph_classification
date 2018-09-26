package <missing>;

public class GlobalMembers
{
	// ?????? ???1000010500 
	// ?????? 

	public static int Main()
	{
		int i;
		int j;
		int temp;
		int[] a = new int[500];
		int N;
		int m;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++) // ????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0,j = 0,m = N;j < N;j++) // ????
		{
			if (a[j] % 2 != 0)
			{
				a[i++] = a[j];
			}
			else
			{
				m--;
			}
		}
		for (i = 0;i < m - 1;i++) // ?????
		{
			for (j = 0;j < m - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					 temp = a[j];
					 a[j] = a[j + 1];
					 a[j + 1] = temp;
				}
			}
		}
		System.out.print(a[0]);
		for (i = 1;i < m;i++)
		{
			System.out.print(',');
			System.out.print(a[i]);
		}
		return 0;
	}
}


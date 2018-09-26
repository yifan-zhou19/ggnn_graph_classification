package <missing>;

public class GlobalMembers
{
	/**********************
	*????
	*?????
	***********************/
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0; j < m; j++)
		{
			for (int k = 0; k < n; k++)
			{
				if (k > 0)
				{
					b[k] = a[k - 1];
				}
				else
				{
					if (k == 0)
					{
						b[k] = a[n - 1];
					}
				}
			}
			for (int i2 = 0; i2 < n; i2++)
			{
				a[i2] = b[i2];
			}
		}
		int mark = 0;
		for (int i1 = 0; i1 < n; i1++)
		{
			if (mark == 0)
			{
				System.out.print(b[i1]);
				mark++;
			}
			else
			{
				System.out.print(" ");
				System.out.print(b[i1]);
			}
		}
	return 0;
	}
}


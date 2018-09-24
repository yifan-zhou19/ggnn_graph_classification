package <missing>;

public class GlobalMembers
{
	//********************************
	//*???1   **
	//*?????? 1200012867 **
	//*???2012.  **
	//********************************

	public static int Main()
	{
		int[][] a = new int[100][100];
		int[] aa = new int[10000];
		int r;
		int c;
		int i;
		int i1;
		int j;
		int k;
		int r1;
		int c1;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < r; i++)
		{
			for (j = 0; j < c; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		r1 = 0;
		c1 = 0;
		k = 0;
		i1 = 0;
		while (true)
		{
			if (c1 < c - 1)
			{
				i = 0;
				for (j = c1; j >= 0; j--)
				{
					aa[k] = a[i][j];
					k++;
					if (i < (r - 1))
					{
						i++;
					}
					else
					{
						break;
					}
				}
				c1++;
			}
			else
			{
				i = i1;
				for (j = c1; j >= 0; j--)
				{
					aa[k] = a[i][j];
					k++;
					if (i < (r - 1))
					{
						i++;
					}
					else
					{
						break;
					}
				}
				i1++;
			}
			if ((i == (r - 1)) && (j == (c - 1)))
			{
				break;
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.print(aa[i]);
			System.out.print("\n");
		}
		System.in.read();
		System.in.read(); //????
		return 0;
	}
}


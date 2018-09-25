package <missing>;

public class GlobalMembers
{
	public static int[][] array = new int[110][110];
	public static int sum;

	public static void dispose(int n)
	{
		int i;
		int j;
		if (n == 1)
		{
			return;
		}
		for (i = 0;i < n;i++)
		{
			int rowmin = array[i][0];
			for (j = 1;j < n;j++)
			{
				if (rowmin > array[i][j])
				{
					rowmin = array[i][j];
				}
			}
			for (j = 0;j < n;j++)
			{
				array[i][j] -= rowmin;
			}
		}
		for (i = 0;i < n;i++)
		{
			int colmin = array[0][i];
			for (j = 1;j < n;j++)
			{
				if (colmin > array[j][i])
				{
					colmin = array[j][i];
				}
			}
			for (j = 0;j < n;j++)
			{
				array[j][i] -= colmin;
			}
		}
		sum += array[1][1];
		for (i = 1;i < n - 1;i++)
		{
			array[0][i] = array[0][i + 1];
		}
		for (i = 1;i < n - 1;i++)
		{
			array[i][0] = array[i + 1][0];
		}
		for (i = 1;i < n - 1;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				array[i][j] = array[i + 1][j + 1];
			}
		}
		dispose(n - 1);
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int p = 0;
		do
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(array,0,(Integer.SIZE / Byte.SIZE));
			sum = 0;
			for (int i = 0 ; i < n ; i++)
			{
				for (int j = 0 ; j < n ; j++)
				{
					array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			dispose(n);
			System.out.print(sum);
			System.out.print("\n");
			p++;
		}while (p < n);
		return 0;
	}
}


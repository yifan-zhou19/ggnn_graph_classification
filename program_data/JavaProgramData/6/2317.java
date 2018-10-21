package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N = 0;
		int n = 0;
		int m = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++)
		{
			int sum = 0;
			int[][] a = new int[102][102];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=*a;
			int p = a;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < m;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (k = 0;k < m;k++,p++)
			{
			 sum = sum + p;
			}
			for (p = p + 101,j = 1;j < n;j++)
			{
				sum = sum + p,p = p + 102;
			}
			for (p = p - 103,k = m - 2;k >= 0;k--,p--)
			{
				sum = sum + p;
			}
			for (p = p - 101,j = n - 2;j > 0;j--,p = p - 102)
			{
				sum = sum + p;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}


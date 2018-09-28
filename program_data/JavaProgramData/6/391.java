package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int sum;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= t;k++) //??????
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0; //???sum?0
			for (i = 0;i <= m - 1;i++)
			{
				for (j = 0;j <= n - 1;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			} //????
			for (p = a[0];p <= a[0] + n - 1;p++)
			{
				sum = sum + *p;
			} //?????
			for (i = 1;i <= m - 2;i++)
			{
				sum = sum + a[i][0] + a[i][n - 1];
			} //????????????????
			for (p = a[m - 1];p <= a[m - 1] + n - 1;p++)
			{
				sum = sum + *p;
			} //??????
			System.out.print(sum);
			System.out.print("\n");
		}
			return 0;
	}


}


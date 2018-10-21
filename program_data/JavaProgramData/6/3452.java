package <missing>;

public class GlobalMembers
{
	public static int[][] array = new int[N][N];
	public static int n;
	public static int m;
	public static int sum(int[][] a)
	{
		int sum = 0;
		for (int i = 0; i < n; i++) //?????
		{
		sum += *(a[0] + i);
		}
		//cout<<sum<<endl;
		for (int i = 1; i < m; i++) //?????????????????
		{
		sum += *(a[i] + (n - 1));
		}
		//cout<<sum<<endl;
		for (int i = n - 2; i >= 0; i--) //??????????????????
		{
		sum += *(a[m - 1] + i);
		}
		//cout<<sum<<endl;
		for (int i = m - 2; i >= 1; i--) //???????????????
		{
		sum += *(a[i] + 0);
		}
		return sum;
	}
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < k; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0; j < m; j++)
			{
			for (int k = 0; k < n; k++)
			{
			array[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			}
			System.out.print(sum(array));
			System.out.print("\n");
		}
		return 0;
	}
}


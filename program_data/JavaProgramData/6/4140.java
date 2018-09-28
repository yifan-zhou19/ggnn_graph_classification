package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //????k???mn????
		int m;
		int n;
		int[] a = new int[100];
		int[] sum = new int[100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int w = 0;w < 100;w++) //?????????????
		{
			sum[w] = 0;
		}
		for (int i = 0;i < k;i++) //????
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < m;j++)
			{
				for (int k = 0;k < n;k++)
				{
					a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (j == 0 || j == m - 1 || k == 0 || k == n - 1) //??????
					{
					sum[i] = sum[i] + a[k]; //???
					}
				}
			}
		}
		for (int p = 0;p < k;p++)
		{
			System.out.print(sum[p]);
			System.out.print("\n");
		} //???????

		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????????               **
	//*?????? 1100012802              **
	//*???2011.10.19                     **
	//****************************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int m = n;
		int[] a = new int[m];
		for (i = 0;i <= m - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= m - 1;i++)
		{
			while (a[i] == k)
			{
				for (j = i;j <= m - 1;j++)
				{
					a[j] = a[j + 1];
				}
				num++;
			}
		}
		for (i = 0;i <= m - 2 - num;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[m - 1 - num]);
		return 0;
	}
}


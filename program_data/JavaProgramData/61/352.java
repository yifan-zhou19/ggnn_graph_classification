package <missing>;

public class GlobalMembers
{
	/*
	 *???: 1.cpp
	 *??????
	 *????: 2012-10-19
	 *??: ???????????n?n???????????????a??????
	 */


	public static int Main()
	{
		int n = 0;
		int iNum = 0;
		int[] a = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (int i = 2; i < 20; i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		} //??????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[n];
		for (int j = 1; j <= n; j++)
		{
			iNum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[j - 1] = a[iNum - 1];
		} //??????
		for (int k = 1;k <= n;k++)
		{
			System.out.print(b[k - 1]);
			System.out.print("\n");
		} //??????
		return 0;
	}
}


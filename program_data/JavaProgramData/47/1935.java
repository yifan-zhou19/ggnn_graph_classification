package <missing>;

public class GlobalMembers
{
	/*
	 * ????????.cpp
	 * ??????
	 * ?????2012.11.9
	 * ??????????????????
	 */
	public static int Main()
	{
		int n; //????
		int i;
		int j;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0, j = n - 1; i < j; i++, j--)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp; //???????
		}
		for (i = 0; i < n - 1; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		} //??????
		System.out.print(a[n - 1]);
		System.out.print("\n");
	}

}


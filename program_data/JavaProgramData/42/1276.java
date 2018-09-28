package <missing>;

public class GlobalMembers
{
	/*
	 * ????601.cpp
	 * ??????
	 * ?????2012-10-28
	 * ????????????
	 */
	public static int Main()
	{
		int n;
		int k;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int N = n;
		int[] a = new int[N]; //?????????
		for (i = 0; i < N; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //????
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = 0; //????n???????????????
		for (i = 0; i < N; i++)
		{
			if (a[i] != k)
			{
				if (n != 0)
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(a[i]);
				}
				n++;
			}
		} //???????
		return 0; //????
	}
}


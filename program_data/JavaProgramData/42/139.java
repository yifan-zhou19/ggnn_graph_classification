package <missing>;

public class GlobalMembers
{
	/**
	 *  ????1027.cpp
	 *  ?????????
	 *  ??????
	 *  ???2010.10.27
	 */


	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100000];
		j = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] != k)
			{

				a[j] = a[i];
				j++;
			}
		}
		System.out.print(a[0]);
		for (i = 1;i <= j - 1;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}
}


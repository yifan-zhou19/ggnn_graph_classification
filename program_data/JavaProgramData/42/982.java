package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ???
	* @date 2011-10-19
	* @description
	* ??????: ????????
	*/
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			if (a[i] == k)
			{
				num = num + 1; // ?a[i]??????num?1
			}
			else
			{
				a[i - num] = a[i]; // ??a[i]???num?
			}
		}
		for (j = 0; j < n - num; j++)
		{
			if (j != n - num - 1)
			{
				System.out.print(a[j]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[j]);
			}
		}
		return 0;
	}
}


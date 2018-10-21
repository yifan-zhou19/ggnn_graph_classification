package <missing>;

public class GlobalMembers
{
	/*
	 * ????shanchuyuansu.cpp
	 * ?????????k????????????????????
	 * ????: 2012-11-9
	 * ??: ? ?
	 */



	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int k = 0;
		int i = 0;
		int j = 0;
		int x = 0;
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			if (a[i] == k)
			{
				for (j = i; j < (n - 1); j++)
				{
					a[j] = a[j + 1];
				}
				a[j] = -1234;
				i--;
			}
		}
		for (i = 0; i < n; i++)
		{
			 if (a[i] != -1234)
			 {
				 if (x == 1)
				 {
					 System.out.print(" ");
				 }
				 x = 1;
				 System.out.print(a[i]);
			 }
		}
		System.out.print("\n");
		return 0;
	}

}


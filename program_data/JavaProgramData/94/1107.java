package <missing>;

public class GlobalMembers
{
	/*
	 *???wwm.cpp
	 *???????
	 *??: 2012-11-9
	 *?????1200012825
	 */

	public static int Main()
	{
		int n; //b????????????
		int[] a = new int[500];
		int[] b = new int[500];
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 != 0)
			{
				b[k] = a[i]; //????
				k++;
			}
		}
		for (int i = 0;i < k - 1;i++)
		{
			for (int j = 0;j < k - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp; //????
				}
			}
		}
		System.out.print(b[0]);
		for (int i = 1;i < k;i++)
		{
			System.out.print(",");
			System.out.print(b[i]);
		}
		System.out.print("\n");
		return 0;
	}

}


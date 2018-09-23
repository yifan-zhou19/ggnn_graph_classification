package <missing>;

public class GlobalMembers
{
	/*
	 * ????????????.cpp
	 * ??????
	 * ?????2012.11.8
	 * ???????????
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20001]; //????
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //?????
		for (j = 0;j < n;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				if (a[k] != 0)
				{ //????????0??????
				if (a[j] == a[k])
				{
					a[k] = 0; //??????????????0
				}
				}
			}
		}
		System.out.print(a[0]);
		for (p = 1;p < n;p++)
		{
			if (a[p] != 0)
			{
				System.out.print(" ");
				System.out.print(a[p]);
			}
			continue;
		}
		System.out.print("\n");
		return 0;
	}

}


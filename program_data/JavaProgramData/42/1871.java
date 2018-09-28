package <missing>;

public class GlobalMembers
{
	// *****************************************************************************
	//*????????????.cpp
	//*??;1300012725
	//*?????2013.10
	//*?????????????
	//******************************************************************************



	public static int Main()
	{
		int[] a = new int[100000];
		int n; //count????????
		int m;
		int count = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0; j < n - count;)
		{
			if (a[j] == m)
			{
				count += 1; //??????????????????
				for (int k = j; k < n - count; k++)
				{
					a[k] = a[k + 1]; //????
				}
			}
			else
			{
				j += 1;
			}
		}
		for (int t = 0; t < n - count - 1; t++)
		{
			System.out.print(a[t]);
			System.out.print(' ');
		}
		System.out.print(a[n - 1 - count]);
		System.out.print("\n");

		return 0;
	}
}


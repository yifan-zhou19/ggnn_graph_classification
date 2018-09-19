package <missing>;

public class GlobalMembers
{
	/**
	????1.cpp
	?  ?????
	?  ??10.30
	?  ??????????????
	*/


	public static int Main()
	{
		int[] a = new int[16];
		int i;


		for (i = 1;;i++)
		{
			int j;
			int k;
			int n = 1;
			int cnt = 0;
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break;
			}
			for (j = 1;j < 16;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[j] == 0)
				{
					break;
				}

				n++;

			}

			for (j = 0;j < n - 1;j++)
			{
				for (k = 1;k <= n - j - 1;k++)
				{
					if (a[j] == 2 * a[j + k] || 2 * a[j] == a[j + k])
					{
						cnt++;
					}
				}

			}
			System.out.print(cnt);
			System.out.print("\n");
		}



		return 0;
	}





}


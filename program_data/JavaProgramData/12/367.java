package <missing>;

public class GlobalMembers
{
	/*
	 * ???: 1000010191_32_9.cpp
	 * ??: ???
	 * ????: 2010-11-12
	 * ??: ??
	 */


	public static int Main()
	{
		int[] a = new int[17]; //??
		int n; //??????????
		int s;

		while ((a[1],a[1] != -1 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			n = 1;
			s = 0;
			while ((a[n + 1],a[n + 1] != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				n++;
			}
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (a[i] % a[j] == 0 && a[i] / a[j] == 2)
					{
						s++;
					}
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}

}


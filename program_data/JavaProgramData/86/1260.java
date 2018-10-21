package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                       **
	//*?????? 1100012763              **
	//*???2011.11.03                     **
	//****************************************
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] num = new int[100];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			if (i > 1)
			{
				System.out.print("\n");
			}
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1; j <= m; j++)
			{
				num[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 1; j <= m; j++)
			{
				if (num[j] + j * 3 >= 60)
				{
					if (num[j] + j * 3 <= 63)
					{
						System.out.print(num[j]);
					}
					else
					{
						System.out.print(63 - j * 3);
					}
					break;
				}
			}
			if (j > m)
			{
				System.out.print(60 - m * 3);
			}
		}
		return 0;
	}

}


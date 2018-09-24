package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????????   
	//*?????? 1300012887 **
	//*???2013.10.18 **
	//********************************
	public static int Main()
	{
		int m; //??????
		int i;
		int a;
		int j;
		int b;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 3; i <= m / 2; i += 2) //?????3??????i?m-i?????
			{
				int a = Math.sqrt(i);
				for (j = 2; j <= a; j++) //??????i?????
				{
					if (i % j == 0)
					{
						break;
					}
				}
				int b = Math.sqrt(m - i);
				for (k = 2; k <= b; k++) //??????m-i???
				{
					if ((m - i) % k == 0)
					{
						break;
					}
				}
				if ((j == a + 1) && (k == b + 1)) //?????????????
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(m - i);
					System.out.print("\n");
				}
			}

			return 0;
	}



}


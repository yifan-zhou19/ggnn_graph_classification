package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????????   **
	//*?????? 1300012861 **
	//*???2013.10.17  **
	//********************************
	public static int Main()
	{
		int n;
		int x;
		int y;
		int i;
		int r;
		int j;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 3; x <= n / 2; x += 2) //??? ???3?? ??+2
		{
			y = n - x;
			r = Math.sqrt(x);
			s = Math.sqrt(y);
			for (i = 2; i <= r; i++) //??x?????
			{
				if (x % i == 0) //????????
				{
					break;
				}
			}
			for (j = 2; j <= s; j++) //??y?????
			{
				if (y % j == 0)
				{
					break;
				}
			}
			if ((i == r + 1) && (j == s + 1)) //?x?y??????????? ?????
			{
				System.out.print(x);
				System.out.print(' ');
				System.out.print(y);
				System.out.print("\n");
			}
		}
		return 0;
	}


}


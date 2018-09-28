package <missing>;

public class GlobalMembers
{
	//***********************************
	//*    ??????                 *
	//*    ??????                 *
	//*    ?????2011?10?2?      *
	//***********************************
	public static int Main()
	{
		int a;
		int x1;
		int x2;
		int x3;
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n; i = i + 1)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x1 = 1;
			x2 = 1; //x1,x2?????????
			if (a == 1 || a == 2)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
				for (j = 1;j <= a - 2;j = j + 1) //?a?????a-1???
				{
					x3 = x1 + x2;
					x1 = x2;
					x2 = x3; //????????????
				}
					System.out.print(x3);
					System.out.print("\n");
			}
		}
		return 0;
	}
}


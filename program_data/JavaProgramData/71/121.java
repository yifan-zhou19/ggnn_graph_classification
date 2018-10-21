package <missing>;

public class GlobalMembers
{
	//******************************************************************
	//*???????                                                  *
	//*??????????????????                            *
	//*??????                                                    *
	//*???2010?10?25?                                            *
	//******************************************************************
	public static int Main()
	{
		int n; //????
		int i;
		int a;
		int b;
		int c;
		int t;
		int p;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++) //?n??????????
		{
			while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0) //??a,b,c?????????
			{
			if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) //???????
			{
			p = 1;
			}
			else
			{
				p = 0;
			}
				if (b < c)
				{
					t = b, b = c, c = t;
				} //??b,c???????????
				int s = 0;
					for (i = c; i < b; i++) //?b,c?????????????
					{
						if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
						{
							q = 31;
						}
						if (i == 4 || i == 6 || i == 9 || i == 11)
						{
							q = 30;
						}
						if (i == 2 && p == 0)
						{
							q = 28;
						}
						if (i == 2 && p == 1)
						{
							q = 29;
						}
						s = s + q; //s??????????
					}
					if (s % 7 == 0) //?????7??????
					{
						System.out.print("YES");
						System.out.print("\n");
					}
					else if (s % 7 != 0)
					{
						System.out.print("NO");
						System.out.print("\n");
					}
			}
		}

		return 0;
	}



}


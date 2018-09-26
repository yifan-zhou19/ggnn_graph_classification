package <missing>;

public class GlobalMembers
{
	//*************************************
	//????4.cpp                       *
	//????? 1? 1200012895           *
	//???2012?10?22?                *
	//??????                        *
	//*************************************
	public static int Main()
	{
		int n; //n????i??????a????b?c?????x??????sum????
		int i;
		int a;
		int b;
		int c;
		int x = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b > c) //??????????????
			{
				x = b;
				b = c;
				c = x;
			}
			if ((a % 400 == 0) || (a % 100 != 0 && a % 4 == 0)) //??a???
			{
				for (; b < c; b++)
				{
					if (b == 2) //b?2??????29
					{
						sum = sum + 29;
					}
					else
					{
						if (b == 4 || b == 6 || b == 9 || b == 11) //b?????30
						{
							sum = sum + 30;
						}
						else
						{
							sum = sum + 31; //b?????31
						}
					}
				}
			}
			else //??a???????2???b???28?????
			{
				for (; b < c; b++)
				{
					if (b == 2)
					{
						sum = sum + 28;
					}
					else
					{
						if (b == 4 || b == 6 || b == 9 || b == 11)
						{
							sum = sum + 30;
						}
						else
						{
							sum = sum + 31;
						}
					}
				}

			}
			if (sum % 7 == 0) //??????7??????YES
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			sum = 0; //??
			x = 0;
		}
		return 0;
	}

}


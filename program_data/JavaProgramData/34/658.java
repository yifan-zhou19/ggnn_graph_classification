package <missing>;

public class GlobalMembers
{
	//****************************************************************
	// ????1000012789_2.cpp                                      *
	// ???wusy                                                    *
	// ???12,1                                                    *
	// ???????                                                *
	//****************************************************************
	public static void jiaogu(int t)
	{
		int p; // ??????
		if (t == 1) // ???1?????
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			if (t % 2 == 0) // ?????
			{
				p = t;
				t = t / 2; // ??????
				System.out.print(p);
				System.out.print("/");
				System.out.print(2);
				System.out.print("=");
				System.out.print(t);
				System.out.print("\n");
					jiaogu(t);
			}
			else
			{ //??
				p = t;
				t = t * 3 + 1;
				System.out.print(p);
				System.out.print("*");
				System.out.print("3+1");
				System.out.print("=");
				System.out.print(t);
				System.out.print("\n");
					jiaogu(t);
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiaogu(n); // ????
		return 0;
	}




}


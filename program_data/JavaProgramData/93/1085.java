package <missing>;

public class GlobalMembers
{
	//****************************************************
	//*  ? ? ?: homework.cpp                          *
	//*  ?    ?: ???                                *
	//*  ????: 2012?9?24?                         *
	//*  ????: ??3?5?7????                   *
	//****************************************************

	public static int Main()
	{
		int[] a = new int[4]; //??a ??n?????3 5 7??
		int i; //????
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= 3;i++)
		{ //???a
			a[i] = 0;
		}
		if (n % 3 == 0)
		{ //??n???3??
			a[1] = 3; //??
			a[0]++; //??
		}
		if (n % 5 == 0)
		{ //??n???5??
			a[2] = 5; //??
			a[0]++; //??
		}
		if (n % 7 == 0)
		{ //??n???7??
			a[3] = 7; //??
			a[0]++; //??
		}
		if (a[0] != 0)
		{ //??????3 5 7????
			for (i = 1;i <= 3;i++)
			{ //??N?????
				if (a[i] != 0)
				{
					a[0]--;
					if (a[0] != 0)
					{
						System.out.print(a[i]);
						System.out.print(' ');
					}
					else
					{
						System.out.print(a[i]);
					}
				}
			}
		}
		else
		{
			System.out.print('n');
		}
	}

}


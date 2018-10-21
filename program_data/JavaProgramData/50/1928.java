package <missing>;

public class GlobalMembers
{
	//************************************************
	//*  ??? 1.cpp                                *
	//*  ?? :???  1200012948                    *
	//*  ???2012 11 09                            *
	//*  ????????                            *
	//************************************************
	public static int Main()
	{
		//????????????
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int b;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//?????
		for (i = 1; i <= 12; i++)
		{
			sum += a[i - 1];
			b = sum + 12;
			//????
			if (((b % 7) + n) % 7 == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}

}


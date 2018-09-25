package <missing>;

public class GlobalMembers
{
	//********************************
	//*????4.cpp                ** 
	//*??????                 **
	//*?????? 1200012834      **
	//*???2012.10.22             **
	//********************************

	public static int Main()
	{
		int n;
		int year;
		int m1;
		int m2;
		int d1 = 0;
		int d2 = 0;
		int i;
										 // d1?d2????m1??m2???????
		int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
										 // ??a????12????? 
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
										 // ??b????12????? 
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 1; j <= n; j++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) // ?????
			{
				for (i = 0; i < m1 - 1; i++)
				{
					d1 += a[i]; // ???a?m1?????????d1?
				}
				for (i = 0; i < m2 - 1; i++)
				{
					d2 += a[i]; // ???a?m2?????????d2?
				}
			}
			else // ?????
			{
				for (i = 0; i < m1 - 1; i++)
				{
					d1 += b[i]; // ???b?m1?????????d1?
				}
				for (i = 0; i < m2 - 1; i++)
				{
					d2 += b[i]; // ???b?m2?????????d2?
				}
			}
			if ((d1 - d2) % 7 == 0) // ?????????
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			d1 = 0;
			d2 = 0; // ??????????????0
		}
		return 0;
	}

}


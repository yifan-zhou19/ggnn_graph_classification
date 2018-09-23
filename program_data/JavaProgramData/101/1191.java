package <missing>;

public class GlobalMembers
{
	/*
	 * practice.cpp
	 *
	 *  Created on: 2013-12-26
	 *      Author: 111
	 */

	public static int Main()
	{
		int a;
		int b;
		int c;
		int isa;
		int isb;
		int isc;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					isa = (b > a) + (c == a);
					isb = (a > b) + (a > c);
					isc = (c > b) + (b > a);
					if ((a + isa == b + isb) && (b + isb == c + isc))
					{
						if (isa < isb && isb < isc)
						{
							System.out.print("CBA");
						}
						if (isa < isc && isc < isb)
						{
							System.out.print("BCA");
						}
						if (isb < isa && isa < isc)
						{
							System.out.print("CAB");
						}
						if (isb < isc && isc < isa)
						{
							System.out.print("ACB");
						}
						if (isc < isa && isa < isb)
						{
							System.out.print("BAC");
						}
						if (isc < isb && isb < isa)
						{
							System.out.print("ABC");
						}
					}
				}
			}
		}
		return 0;
	}

}

package <missing>;

public class GlobalMembers
{
	/*
	 * base.cpp
	 * function????
	 * Created on: 2012-11-28
	 * Author: sear
	 */
	public static int Main()
	{
		int a; //a,b,c???????????1?2?3
		int b;
		int c;
		int i; //i,j,k????abc??
		int j;
		int k;
		for (a = 1; a < 4; a++) //a,b,c??1?3??
		{
			for (b = 1; b < 4; b++)
			{
				if (a == b)
				{
					continue; //a=b?b???1
				}
				for (c = 1; c < 4; c++)
				{
					if (c == a || c == b)
					{
						continue; //c=a?c=b?c???1
					}
					if (((a + (b > a) + (a == c)) == 3) && ((b + (a > b) + (a > c)) == 3) && ((c + (c > b) + (b > a)) == 3))
					{
							   break; //?????????????????????3
					}
				}
			}
		}
		a = i,b = j,c = k; //??abc??
								//????????????
		if (a > b)
		{
			if (b > c)
			{
				System.out.print("ABC");
			}
			else
			{
				if (c < a)
				{
					System.out.print("ACB");
				}
				else
				{
					System.out.print("CAB");
				}
			}
		}
		else
		{
			if (a > c)
			{
				System.out.print("BAC");
			}
			else
			{
				if (c < b)
				{
					System.out.print("BCA");
				}
				else
				{
					System.out.print("CBA");
				}
			}
		}
		return 0; //????
	}

}

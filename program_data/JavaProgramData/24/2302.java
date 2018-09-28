import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*  ???:1.cpp                                        *
	//*  ??????    1200012948                          *
	//*  ????: 2012 12 24                                *
	//*  ????:??????                               *
	//********************************************************
	public static int Main()
	{
		String str = new String(new char[3000]);
		String longest = null; //??????????????
		String shortest = null;
		int max = 0;
		int min = 9999;
		int i;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		for (i = 0; i <= len; i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i) != ',' && str.charAt(i) != '\0')
			{
				k++;
			}
			else
			{
				if (k > max)
				{
					max = k;
					longest = str.Substring(i); //?????????????
				}
				if (k < min)
				{
					min = k;
					shortest = str.Substring(i);
				}
				if (str.charAt(i) == ' ' || str.charAt(i) == '\0')
				{
					k = 0;
				}
			}
		}
		for (i = 0; i < max; i++)
		{
			System.out.print((longest - max));
			longest = longest.Substring(1);
		}
		System.out.print("\n");
		for (i = 0; i < min; i++)
		{
				System.out.print((shortest - min));
				shortest = shortest.Substring(1);
		}
			System.out.print("\n");
		return 0;
	}

}

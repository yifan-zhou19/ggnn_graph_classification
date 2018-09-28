import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************************************
	// ????1000012789_1.cpp                                      *
	// ???wusy                                                    *
	// ???12,8                                                    *
	// ???????                                                *
	//****************************************************************
	public static int Main()
	{
		String a = new String(new char[100]); // ??????
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int count = 0;
		String p = null; // ????
		p = a;
		for (i = 1; * (p.Substring(i) - 1) != '\0'; i++)
		{
			if (*(p.Substring(i)) == ' ') // ?????????+1
			{
				count++;
			}
			else
			{
				if (count >= 2) // ??????2
				{
					for (j = i; * (p.Substring(j) - 1) != '\0'; j++) // ????????????
					{
						*(p.Substring(j) - count + 1) = *(p.Substring(j)); // ????
					}
					i = i - count + 1; // ?i?????
				}
				count = 0; // ?????
			}

		} // ????????
		for (p = a, i = 0; * (p.Substring(i)) != '\0'; i++) // ??
		{
			System.out.print((p.Substring(i)));
		}
		return 0;
	}



}

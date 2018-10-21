import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************************************
	// ????1000012789_3.cpp                                      *
	// ???wusy                                                    *
	// ???12,8                                                    *
	// ???????                                                *
	//****************************************************************
	public static int Main()
	{
		int i;
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();

		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) <= '9' && a.charAt(i) >= '0' && a.charAt(i + 1) <= '9' && a.charAt(i + 1) >= '0')
			{
				System.out.print(a.charAt(i));
			}
			if (a.charAt(i) <= '9' && a.charAt(i) >= '0' && (a.charAt(i + 1) > '9' || a.charAt(i + 1) < '0'))
			{
				System.out.print(a.charAt(i));
				System.out.print("\n");
			}
		}
		return 0;
	}


}

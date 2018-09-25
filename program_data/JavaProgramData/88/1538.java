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
		String p = null;
		a = new Scanner(System.in).nextLine();
		p = a;

		for (i = 0; * (p.Substring(i)) != '\0'; i++)
		{
			if (*(p.Substring(i)) <= '9' && *(p.Substring(i)) >= '0' && *(p.Substring(i) + 1) <= '9' && *(p.Substring(i) + 1) >= '0')
			{
				System.out.print((p.Substring(i)));
			}
			if (*(p.Substring(i)) <= '9' && *(p.Substring(i)) >= '0' && (*(p.Substring(i) + 1) > '9' || *(p.Substring(i) + 1) < '0'))
			{
				System.out.print((p.Substring(i)));
				System.out.print("\n");
			}
		}
		return 0;
	}


}

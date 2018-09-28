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
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int count = 0;
		String p = null;

		for (i = 1; a.charAt(i - 1) != '\0'; i++)
		{
			if (a.charAt(i) == ' ')
			{
				count++;
			}
			else
			{
				if (count >= 2)
				{
					for (j = i; a.charAt(j - 1) != '\0'; j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, j - count + 1, a.charAt(j));
					}
					i = i - count + 1;
				}
				count = 0;
			}

		}
		p = a;
		for (p = a, i = 0; a.charAt(i) != '\0'; i++)
		{
			System.out.print(p.charAt(i));
		}
		return 0;
	}


}


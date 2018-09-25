import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ???
	* @date 2011-11-16
	* @description
	* ??????: ????
	*/


	public static int Main()
	{
		int i;
		int j;
		int k;
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		for (i = 1;a.charAt(i) != '\0';i++) // ???1????2
		{
			if (a.charAt(i) == a.charAt(0))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, 1);
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, 2);
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, 0, 1);
		do
		{
			for (j = 0;j < i;j++)
			{
				if (a.charAt(j) == 2)
				{
					for (k = j - 1;k >= 0;k--)
					{
						if (a.charAt(k) == 2)
						{
							break;
						}
						if (a.charAt(k) == 1)
						{
							System.out.print(k);
							System.out.print(" ");
							System.out.print(j);
							System.out.print("\n");
							a = a.substring(0, k);
							a = a.substring(0, j);
							break;
						}
					}

				}
			}
		} while (a.charAt(0) != 0);
		return 0;
	}



}


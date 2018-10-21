import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************************************
	//*   ?  ?   ?: ????.cpp                            *
	//*   ?       ?: ? ?                                   *
	//*   ? ? ? ?: 2010?12?6?                           *
	//**********************************************************
	public static int Main()
	{
		final String a = ""; //??????????
		int i = 1;
		int j = 0;
		a = new Scanner(System.in).nextLine();
		while ((i < 101) && (a.charAt(i) != '\0')) //?????
		{
			if (a.charAt(i) == a.charAt(0)) //?????????????????????
			{
				i++;
				continue;
			}
			else if (a.charAt(i) != a.charAt(0)) //????????????
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (a.charAt(j) != a.charAt(0)) //?????????????
					{
						continue;
					}
					else if (a.charAt(j) == a.charAt(0)) //????????????????????
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						a = tangible.StringFunctions.changeCharacter(a, i, '0');
						a = tangible.StringFunctions.changeCharacter(a, j, '0');
						break;
					}
				}
			}
			i++;
		}
		return 0;
	}

}


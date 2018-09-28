import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************************************************************************************
	//*? ? ?:???????.cpp                                                          *
	//*?    ?:??? 1000012817                                                           *   
	//*????:2010-11-18                                                                  *                                 
	//*????:???????????                                                      *
	//***************************************************************************************
	public static int Main() //???
	{
		int i;
		int j;
		String a = new String(new char[101]); //??????????
		a = new Scanner(System.in).nextLine(); //?????
		for (i = 0;i < (a.length());)
		{ //???????
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{ //?????????
				i = i; //????i??
				for (j = i;j < (a.length() + 1);j++)
				{ //????????????
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
			}
			else
			{
				i++; //????i=i+1
			}
		}
		System.out.print(a);
		System.out.print("\n");
	return 0;
	} //?????
}


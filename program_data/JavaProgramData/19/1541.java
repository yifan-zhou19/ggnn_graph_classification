import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ???: 1000010191_30_3.cpp
	 * ??: ???
	 * ????: 2010-11-5
	 * ??: ????
	 */


	public static int Main()
	{
		String s = new String(new char[101]); //?????,r???
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		final String r = "";
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		String temp = new String(new char[101]);
		int templen = 0;
		for (int i = 0;s.charAt(i);i++)
		{
			if (s.charAt(i) != ' ')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, templen, s.charAt(i));
				templen++;
			}
			else
			{
				temp = tangible.StringFunctions.changeCharacter(temp, templen, '\0');
				if (!strcmp(temp,a))
				{
					r += b; //?????????
				}
				else
				{
					r += temp; //????????
				}
				r += " "; //????
				templen = 0;
			}
		}
		temp = tangible.StringFunctions.changeCharacter(temp, templen, '\0');
		if (!strcmp(temp,a))
		{
			r += b; //?????????
		}
		else
		{
			r += temp; //????????
		}
		System.out.print(r);
		System.out.print("\n");
		return 0;
	}

}


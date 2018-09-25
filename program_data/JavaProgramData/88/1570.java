import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*  ???1000012846_3.cpp  *****************************
	//*  ??:??  ******************************************
	//*  ?????2010?12?  *******************************
	//*  ?????????  *********************************
	//********************************************************
	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int i = 0; //i??????
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				String p = a.charAt(i); //???????????
				while (a.charAt(i) >= '0' && a.charAt(i) <= '9')
				{
					i++;
				}
				a = tangible.StringFunctions.changeCharacter(a, i, '\0'); //????????
				System.out.print(p);
				System.out.print("\n");
			}
			i++;
		}
		return 0;
	}
}


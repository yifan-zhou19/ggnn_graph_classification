import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ???????
	//
	//  Created by ? ?? on 12-11-30.
	//  Copyright (c) 2012? ? ??. All rights reserved.
	//

	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int la = a.length();
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		a = tangible.StringFunctions.changeCharacter(a, la, a.charAt(0));
		p = a;
		while (i < la)
		{
			char m = p++;
			char n = p;
			b = tangible.StringFunctions.changeCharacter(b, i, m + n);
			i++;
			System.out.print(b.charAt(i - 1));
		}

		return 0;
	}

}


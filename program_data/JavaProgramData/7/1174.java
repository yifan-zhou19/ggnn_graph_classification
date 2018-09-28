package <missing>;

public class GlobalMembers
{
	/*******************************
	/* ?  ?: ????
	/* ?  ?: ??? 1200012861
	/* ?  ?: 2012?12?24?
	*******************************/


	public static int Main()
	{
		String str = new String(new char[260]);
		String subStr = new String(new char[260]);
		String replace = new String(new char[260]);
		String str2 = new String(new char[260]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * start = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * node = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * rep = replace;
		int len;
		int i = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		subStr = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replace = ConsoleInput.readToWhiteSpace(true).charAt(0);
		node = tangible.StringFunctions.strStr(str, subStr); //??subStr???str???,??node?str???????,????
		if (node == null) //????
		{
			System.out.print(str);
		}
		else
		{
			while (start != node)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i++, *start++); //????????????
			}
			while (*rep != '\0')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i++, *rep++); //?????????
			}
			node += subStr.length(); //node???????????
			while (*node != '\0')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i++, *node++); //????????????
			}
			str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0'); //?????????
			System.out.print(str2);
		}
		System.out.print("\n");
		start = null; //????
		node = null;
		rep = null;
		return 0;
	}

}


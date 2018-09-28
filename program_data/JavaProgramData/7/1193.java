package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1200012988 **
	//*???2012.12.24  **
	//********************************


	public static int Main()
	{
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String replace = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int len1;
		int len2;
		int len3;
		int i;
		int m;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sub = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replace = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = str.length();
		len2 = sub.length();
		len3 = replace.length();
		p = tangible.StringFunctions.strStr(str, sub);
		if (p != null)
		{
			if (len2 > len3)
			{
				m = len2 - len3;
				for (i = 0; i < len3; i++)
				{
					*p++= replace.charAt(i);
				}
				for (i = 0; * (p + m + i) != str.charAt(len1 - 1); i++)
				{
					*p = (p + m);
				}
				len1 -= m;
			}
			if (len2 == len3)
			{
				for (i = 0; i < len3; i++)
				{
					*p++= replace.charAt(i);
				}
			}
			if (len2 < len3)
			{
				m = len3 - len2;
				for (i = len1 - 1; str.charAt(i) != *(p + m - 1); i--)
				{
					str = tangible.StringFunctions.changeCharacter(str, i + m, str.charAt(i));
				}
				for (i = 0; i < len3; i++)
				{
					*p++= replace.charAt(i);
				}
				len1 += m;
			}
		}
		for (i = 0; i < len1; i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}

}


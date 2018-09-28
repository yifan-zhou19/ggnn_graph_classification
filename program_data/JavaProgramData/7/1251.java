package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2.cpp   **
	//*?????? 1200012768 **
	//*???2012.12.29  **
	//*???????  **
	//********************************
	public static int Main()
	{
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String rep = new String(new char[256]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sub = ConsoleInput.readToWhiteSpace(true).charAt(0);
		rep = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p = strstr(str, sub), *temp1, *temp2;
		char p = tangible.StringFunctions.strStr(str, sub);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * temp1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * temp2;
		if (p == null)
		{
			System.out.print(str);
		}
		else
		{
			temp1 = p, temp2 = rep;
			while (*temp2 != '\0')
			{
				*temp1 = temp2;
				temp1++, temp2++;
			}
			System.out.print(str);
		}
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1200012837 **
	//*???2012.12.25  **
	//********************************

	public static int Main()
	{
		String str = new String(new char[270]);
		String subs = new String(new char[70]);
		String rep = new String(new char[70]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		subs = ConsoleInput.readToWhiteSpace(true).charAt(0);
		rep = ConsoleInput.readToWhiteSpace(true).charAt(0);
		p = tangible.StringFunctions.strStr(str,subs); //???????
		if (p != null)
		{
			for (int i = 0;rep.charAt(i) != '\0'; i++)
			{
				*p++= rep.charAt(i);
			}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}

}


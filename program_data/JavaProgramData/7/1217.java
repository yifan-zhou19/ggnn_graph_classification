package <missing>;

public class GlobalMembers
{
	//*********************
	//function:????
	//date:2012/12/28
	//writer:???
	//*********************
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String replace = new String(new char[300]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replace = ConsoleInput.readToWhiteSpace(true).charAt(0);
		String p;
		int alen;
		int blen;
		int relen;
		int i;
		int j;
		p = tangible.StringFunctions.strStr(a, b); //????
		if (p == null) //????
		{
			System.out.print(a);
			System.out.print("\n");
		}
		else //???
		{
			alen = a.length();
			blen = b.length();
			relen = replace.length();
			for (i = 0; a.charAt(i) != p;i++) //????
			{
				System.out.print(a.charAt(i));
			}
			System.out.print(replace);
			i += blen;
			for (;i < alen - blen + relen;i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}


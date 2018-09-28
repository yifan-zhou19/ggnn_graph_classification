package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String fstr = new String(new char[101]);
		char c = str.charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = fstr;
		cin.get(str,101);
		for (p,q; * (p + 1) != '\0';p++,q++)
		{
			*q = p + *(p + 1);
		}
		*q = p + *str;
		*(q + 1) = '\0';
		System.out.printf("%s\n",fstr);
		return 0;
	}
}

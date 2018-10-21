package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String zfc = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pn;
		int len;

		zfc = new Scanner(System.in).nextLine();
		len = zfc.length();
		for (pn = str,p = zfc;pn < str.Substring(len) - 1;pn++,p++)
		{
			*pn = p + *(p + 1);
		}
		*pn = p + *zfc;

		for (pn = str;pn < str.Substring(len);pn++)
		{
			System.out.printf("%c",*pn);
		}

	}

}

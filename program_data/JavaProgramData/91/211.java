package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int len;
		String str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		str = (String)calloc(150,(Integer.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (p = str;p - str < len - 1;p++)
		{
			System.out.printf("%c",*p + *(p + 1));
		}
		System.out.printf("%c\n",*p + str);
	}



}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String p0;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		p0 = str;
		for (p = str; * p != '\0';p++)
		{
			if (*p != '\0')
			{
				i++;
			}
		}

		*p = p0;
		*(p + 1) = '\0';
		for (p = str;p < str.Substring(i);p++)
		{
			*p = p + *(p + 1);
		}
		*p = '\0';
		System.out.printf("%s",str);
		return 0;
	}

}

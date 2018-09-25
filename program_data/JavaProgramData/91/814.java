package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[200]);
		str = new Scanner(System.in).nextLine();
		char a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		p = str.charAt(0);
		q = str.charAt(1);
		a = p;
		while (*q != '\0')
		{
			*p = p + *q;
			p++;
			q++;
		}
		*p = p + a;
		System.out.printf("%s\n",str);
	}

}

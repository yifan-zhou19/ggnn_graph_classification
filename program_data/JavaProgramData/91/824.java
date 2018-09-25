package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		String str1 = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		str = new Scanner(System.in).nextLine();
		p = str;
		p2 = str.charAt(0);
		p1 = str1;
		int i;
		int n;
		i = 0;
		for (; * p != '\0';p++)
		{
			i++;
		}
		n = i;
		p = str;
		for (i = 0;i < n - 1;i++)
		{
			*p1 = p + *(p + 1);
			p++;
			p1++;
		}
		*p1 = p2 + *p;
		p1 = str1;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",*p1);
			p1++;
		}
	}


}

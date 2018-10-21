package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String temp;

		str1 = new Scanner(System.in).nextLine();
		p1 = str1;
		p2 = str2;
		while (*(p1 + 1) != '\0')
		{
			temp = p1 + 1;
			*p2 = p1 + temp;
			p1 = p1 + 1;
			p2 = p2 + 1;
		}
		temp = str1;
		*p2 = p1 + temp;
		temp = str2;
		while (temp <= p2)
		{
			System.out.printf("%c", temp);
			temp = temp.Substring(1);
		}
		System.out.print("\n");
	}

}

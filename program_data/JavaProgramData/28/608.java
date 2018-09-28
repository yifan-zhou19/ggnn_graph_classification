package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		char n;
		int i;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (p = a;;)
		{
			for (i = 0; * p != ' ' && *p != '\0';p++)
			{
				i++;
			}
			if (i != 0 && *p == ' ')
			{
				System.out.printf("%d,",i);
				p++;
			}
			else if (i == 0 && *p == ' ')
			{
				p++;
			}
			else if (i != 0 && *p == '\0')
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}

}

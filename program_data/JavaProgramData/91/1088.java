package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String zfc1 = new String(new char[101]);
		String zfc2 = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		p2 = zfc2;
		zfc1 = new Scanner(System.in).nextLine();
		for (p1 = zfc1; * p1 != '\0';p1++,p2++)
		{
			if (*(p1 + 1) != '\0')
			{
				*p2 = p1 + *(p1 + 1);
			}
			else
			{
				*p2 = p1 + *zfc1;
			}
		}
		*p2 = '\0';


		System.out.printf("%s",zfc2);
	}



}

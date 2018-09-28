package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String str = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
	int num = 0;
	str = new Scanner(System.in).nextLine();
	for (p = str; * p != '\0';p++)
	{
		   if (*p != ' ')
		   {
		num = num + 1;
		   }
		else if (*p = ' ' && num != 0)
		{
			 System.out.printf("%d,",num);
		  num = 0;
		}
	}
		System.out.printf("%d",num);
	}

}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[30]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int num = 1;
		c = new Scanner(System.in).nextLine();
		for (p = c; * p != '\0';p++)
		{
		   if ((*p > 47) && (*p < 58))
		   {
			  if (num == 1)
			  {
			  System.out.printf("%c",*p);
			  num = 1;
			  }
			  else
			  {
			  System.out.printf("\n%c",*p);
			  num = 1;
			  }
		   }
		   else
		   {
			  num = 0;
		   }
		}
	}
}

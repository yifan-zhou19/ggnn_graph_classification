package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[40]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * p = a;
	   cin.get(a,40);
	   for (; * p != '\0';p++)
	   {
		  if (*p >= '0' && *p <= '9')
		  {
			  for (; * p >= '0' && *p <= '9';p++)
			  {
				  System.out.print(p);
			  }
			  System.out.print("\n");
		  }
	   }
	   return 0;
	}
}

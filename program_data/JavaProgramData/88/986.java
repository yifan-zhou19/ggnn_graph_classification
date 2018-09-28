package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String k;
		for (p = a; * p != '\0';p++)
		{
			if (*p >= '0' && *p <= '9')
			{
			   for (q = p; * q != '\0';q++)
			   {
				if (*q < '0' || *q>'9')
				{
				   System.out.print("\n");
				   break;
				}
				System.out.print(q);
				k = q;
			   }
			 p = k;
			}
		}
	   return 0;
	}
}

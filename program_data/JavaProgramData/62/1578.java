package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		for (p = a,q = b;(*p) != '\0';p++)
		{
		   if ((p - a.charAt(0)) == 0)
		   {
			 *q = p;
			 q++;
		   }
		   else
		   {
			 if ((*(p - 1) == ' ') && ((*p) == ' '))
			 {
			   continue;
			 }
			 else
			 {
			   *q = p;
			   q++;
			 }
		   }

		}
		*q = '\0';
		System.out.print(b);
		System.out.print("\n");


		return 0;
	}




}

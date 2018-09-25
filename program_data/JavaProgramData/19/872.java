package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 String ini = new String(new char[101]);
		 String former = new String(new char[101]);
		 String latter = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * p;
		 String q = ini;
		 ini = new Scanner(System.in).nextLine();
		 former = new Scanner(System.in).nextLine();
		 latter = new Scanner(System.in).nextLine();
		 for (p = ini;;p++)
		 {
			  if (*p == ' ')
			  {
				 *p = '\0';
				 if (strcmp(q,former) == 0)
				 {
					 System.out.printf("%s ",latter);
				 }
				 else
				 {
					 System.out.printf("%s ",q);
				 }
				 q = p + 1;
			  }
			 else if (*p == '\0')
			 {
				 if (strcmp(q,former) == 0)
				 {
					 System.out.printf("%s\n",latter);
				 }
				 else
				 {
					 System.out.printf("%s\n",q);
				 }
				 break;
			 }
		 }

	}





}

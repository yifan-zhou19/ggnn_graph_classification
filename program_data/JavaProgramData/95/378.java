package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 's', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 't', so pointers on this parameter are left unchanged:
	public static int strcmp(char * s, char * t)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * s1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * t1;
	 s1 = s;
	 t1 = t;
	 for (s1 = s; * s1 != '\0';s1++)
	 {
		 if (*s1 >= 'A' && *s1 <= 'Z')
		 {
			 *s1 = s1 + 32;
		 }
	 }
	 for (t1 = t; * t1 != '\0';t1++)
	 {
		 if (*t1 >= 'A' && *t1 <= 'Z')
		 {
			 *t1 = t1 + 32;
		 }
	 }
	 for (; * s == *t && *s != '\0';s++, t++)
	 {
		 ;
	 }
	 return (*s - *t);





	}
	public static int Main()
	{
	 String str1 = new String(new char[80]);
	 String str2 = new String(new char[80]);
	 str1 = new Scanner(System.in).nextLine();
	 str2 = new Scanner(System.in).nextLine();
	 if (strcmp(str1, str2) > 0)
	 {
		 System.out.print(">\n");
	 }
	 else if (strcmp(str1, str2) == 0)
	 {
		 System.out.print("=\n");
	 }
	 else
	 {
		 System.out.print("<\n");
	 }


	 return 0;
	}
}

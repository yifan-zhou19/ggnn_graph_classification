package <missing>;

public class GlobalMembers
{


/*
??????????:???????????????
str:????????
return ?????????
*/
	public static String upper(tangible.RefObject<String> str)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * s = str.argValue;
	 while (*s != '\0')
	 {
	  if (*s >= 'a' && *s <= 'z')
	  {
	   *s = s - ('a' - 'A');
	  }
	  s++;
	 }
	 return str.argValue;
	}


	public static int Main()
	{
	 String s = new String(new char[100]);
	 String m = new String(new char[100]);
	 s = new Scanner(System.in).nextLine();
	 m = new Scanner(System.in).nextLine(); //?????????
 tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
 tangible.RefObject<String> tempRef_m = new tangible.RefObject<String>(m);
	 int a = strcmp(upper(tempRef_s),upper(tempRef_m)); //?????????
	 m = tempRef_m.argValue;
	 s = tempRef_s.argValue;
	 if (a == 0)
	 {
	 System.out.print("=");
	 System.out.print("\n");
	 }
	 if (a > 0)
	 {
	 System.out.print(">");
	 System.out.print("\n");
	 }
	 if (a < 0)
	 {
	 System.out.print("<");
	 System.out.print("\n");
	 }
	 return 0;
	}



}


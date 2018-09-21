package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int num;
	 String ch = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p;
	 ch = new Scanner(System.in).nextLine();
	 num = ch.length();
	 p = ch;
	 for (p = ch.Substring(num) - 1,i = num - 1;p >= ch;p--,i--)
	 {
	  if (*p == ' ')
	  {
	   for (p = ch.Substring(i) + 1;(*p != ' ' && *p != '\0');p++)
	   {
		  System.out.printf("%c",*p);
	   }
	   System.out.print(" ");
	   p = ch.Substring(i);
	  }
	  if (i == 0)
	  {
	   for (p = ch.Substring(i);(*p != ' ' && *p != '\0');p++)
	   {
		   System.out.printf("%c",*p);
	   }
	  }
	 }
	}
}

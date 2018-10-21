package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 String ch = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p;
	 p = ch;
	 i = 0;
	 while (scanf("%c", ch.charAt(i)) && ch.charAt(i) != '\n')
	 {
	  i++;
	 }
	 while (i > 1)
	 {
	  System.out.printf("%c",*p + *(p + 1));
	  p++;
	  i--;
	 }
	 System.out.printf("%c\n",*p + ch.charAt(0));
	 return 0;
	}





}

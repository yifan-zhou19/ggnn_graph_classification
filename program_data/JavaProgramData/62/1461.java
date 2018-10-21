package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   str = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
	   str = new Scanner(System.in).nextLine();
	   p = str;
	   for (; * p != '\0';p++)
	   {
			   if (*p != ' ')
			   {
				   System.out.printf("%c",*p);
			   }
			  else if (*(p - 1) != ' ')
			  {
				  System.out.print(" ");
			  }
	   }
	}
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   p = (String)malloc(200 * (Character.SIZE / Byte.SIZE));
	   p = new Scanner(System.in).nextLine();
	   for (a = p,b = p.Substring(1);b < p + p.length();a++,b++)
	   {
		   System.out.printf("%c",*a + *b);
	   }
	   System.out.printf("%c", p + *a);
	}
}

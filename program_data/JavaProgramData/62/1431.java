package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		s = (String)calloc(100000,(Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		for (; * s != '\0';s++)
		{
		   if ((*s != ' ') || ((*s == ' ') && (*(s - 1) != ' ')))
		   {
			 System.out.printf("%c",*s);
		   }
		}
		System.out.print("\n");
	}
}

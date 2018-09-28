package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		for (p = s; * (p + 1) != '\0';p++)
		{
		   System.out.printf("%c",*p + *(p + 1));
		}
		System.out.printf("%c\n",*p + s);
	}
}

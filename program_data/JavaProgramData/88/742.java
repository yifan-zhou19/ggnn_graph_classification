package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

	String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * r;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
	p = new Scanner(System.in).nextLine();

	for (r = p; * r != '\0';r++)
	{
	if ((*r > 57) || (*r < 48))
	{
		System.out.print("\n");
	}
	else
	{
		System.out.printf("%c",*r);
	}
	}

	}
}

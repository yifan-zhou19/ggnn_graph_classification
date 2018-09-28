package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String head;
		String head1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		head = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		head1 = p1;
		p = new Scanner(System.in).nextLine();
		for (; * (p + 1) != '\0';p++)
		{
			*p1 = (p) + *(p + 1);
			p1++;
		}
		*p1 = p + head;
		*(p1 + 1) = '\n';
		for (p1 = head1; * p1 != '\n';p1++)
		{
			System.out.printf("%c",*p1);
		}
	}
}

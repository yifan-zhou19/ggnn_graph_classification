public class student
{
	public String c = new String(new char[60]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student) malloc(LEN);
		head = p1;
		head.next = null;
		p1.c = new Scanner(System.in).nextLine();
		while (strcmp(p1.c,"end"))
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student) malloc(LEN);
			p1.c = new Scanner(System.in).nextLine();
		p1.next = head;
		head = p1;
		}
		return (head);
	}
	public static void print(student head)
	{
		student p = head.next;
		do
		{
			System.out.println(p.c);
			p = p.next;
		}while (p.next != null);
		System.out.println(p.c);
	}
	public static void Main()
	{
		student p = creat();
		print(p);
	}

}

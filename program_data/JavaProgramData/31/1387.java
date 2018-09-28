public class student
{
	public String a = new String(new char[88]);
public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student p1;
		student p2;
		student head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = p2 = (student)malloc(LEN);
	p1.a = new Scanner(System.in).nextLine();
	p1.next = null;
	while (strcmp(p1.a,"end") != 0)
	{
		p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (student)malloc(LEN);
	p1.a = new Scanner(System.in).nextLine();
	p1.next = p2;

	}
	head = p2;
	return (head);
	}
	public static void print(student head)
	{
		student p;
	p = head;
	while (p != 0)
	{
		System.out.println(p.a);
	p = p.next;
	}
	}
	public static void Main()
	{
		student head;
	head = creat();
	print(head);
	}
}

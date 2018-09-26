public class student
{
	public String str = new String(new char[500]);
	public student next;
	public student before;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		p1.str = new Scanner(System.in).nextLine();
		p1.before = null;
		head = p1;
		while (strcmp(p1.str,"end") != 0)
		{
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.str = new Scanner(System.in).nextLine();
			p2.next = p1;
			p1.before = p2;
		}
		p2.next = null;
		head = p2;
		return (head);
	}

	public static void Main()
	{
		student p;
		student head;
		head = creat();
		p = head;
		while (p.before != null)
		{
			System.out.printf("%s\n",p.str);
		p = p.before;
		}
		System.out.printf("%s",p.str);
	}

}

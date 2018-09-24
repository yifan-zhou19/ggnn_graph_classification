public class stu
{
	public String a = new String(new char[1000]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu head;
		stu p1;
		stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(LEN);
		head = p1;
		p1.next = null;
		p1.a = new Scanner(System.in).nextLine();
		while (strcmp(p1.a,"end") != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (stu)malloc(LEN);
				p1.a = new Scanner(System.in).nextLine();
				head = p1;
				p1.next = p2;
				p2 = p1;
		}
		p1 = head.next;
		while (p1 != null)
		{
			System.out.println(p1.a);
			p1 = p1.next;
		}
	}
}

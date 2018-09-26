public class student
{
	public String info = new String(new char[100]);
	public student next;
	public student former;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student head;
		student tail;
		student p;
		String s = new String(new char[100]);
		p = new student();
		p.info = new Scanner(System.in).nextLine();
		head = p;
		head.former = null;
		tail = p;
		while (strcmp(p.info,"end") != 0)
		{
			p = new student();
			p.info = new Scanner(System.in).nextLine();
			tail.next = p;
			p.former = tail;
			tail = p;
		}
		while (p.former != null)
		{
			p = p.former;
			System.out.printf("%s\n",p.info);
		}
		return 0;
	}
}

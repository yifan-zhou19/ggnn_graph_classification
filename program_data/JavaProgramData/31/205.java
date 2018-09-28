public class student
{
	public String xh = new String(new char[1000]);
	public student next;
	public student last;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		p1 = new student();
		p2 = p1;
		p1.xh = new Scanner(System.in).nextLine();
			 head = null;
		p1.last = null;
		for (n = 1;strcmp(p1.xh,"end") != 0;n++)
		{
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			p1 = new student();
			p1.xh = new Scanner(System.in).nextLine();
			if (strcmp(p1.xh,"end") == 0)
			{
				break;
			}
			p1.last = p2;
		}
		head = p2;
		p2.next = null;
		return (head);
	}
	public static void print(student head)
	{
		student p;
		p = head;
		if (head != null)
		{
			for (;p != null;)
			{
				System.out.printf("%s\n",p.xh);
				p = p.last;
			}
		}
	}
	public static void Main()
	{
		student head;
		head = creat();
		print(head);
	}

}

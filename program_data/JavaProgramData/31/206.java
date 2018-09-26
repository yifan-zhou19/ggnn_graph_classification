public class student
{
	public String a = new String(new char[100]);
	public student next;
	public student last;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		p1 = new student();
		p1.a = new Scanner(System.in).nextLine();
		p1.last = null;
		int i;
		for (i = 1;strcmp(p1.a,"end") != 0;i++)
		{
			if (i == 1)
			{
				;
			}
			else
			{
				p2.next = p1;
				p1.last = p2;
			}
			p2 = p1;
			p1 = new student();
			p1.a = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		head = p2;
		return (head);
	}
	public static int Main()
	{
		student head;
		student p;
		head = creat();
		p = head;
		int i;
		for (i = 0;p.last != null;i++)
		{
			System.out.printf("%s\n",p.a);
			p = p.last;
		}
		System.out.printf("%s",p.a);
	}

}

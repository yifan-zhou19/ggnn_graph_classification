public class stu
{
	public String infor = new String(new char[1000]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu p1;
	public static stu p2;
	public static stu creat()
	{
		stu head = null;
		   p2 = p1 = new stu();
	   p1.infor = new Scanner(System.in).nextLine();
		while (strcmp(p1.infor,"end"))
		{
			if (head == null)
			{
				head = p1;
			}
		else
		{
			p2.next = p1;
		}
		p2 = p1;
		p1 = new stu();
		p1.infor = new Scanner(System.in).nextLine();
		}

	p2.next = null;
	return (head);
	}
	public static stu back(stu head)
	{
		stu newp;
		stu newhead = null;
		do
		{
			p2 = null;
			p1 = head;
		while (p1.next != null)
		{
			p2 = p1;
			p1 = p1.next;
		}
			if (newhead == null)
			{
				newhead = p1,newp = newhead.next = p2;
			}
			newp = newp.next = p2;
			p2.next = null;
		}while (head.next != null);
	return (newhead);
	}
	public static void Main()
	{
		stu head;
	head = creat();
	  head = back(head);
	 for (p1 = head;p1 != null;p1 = p1.next)
	 {
	  System.out.printf("%s\n",p1.infor);
	 }


	}
}

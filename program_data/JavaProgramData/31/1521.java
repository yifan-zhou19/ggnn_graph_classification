public class stu
{
	public String info = new String(new char[50]);
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu p1;
	public static stu p2;
	public static int n;
	public static stu creat()
	{
		stu head = null;
	n = 0;
	p1 = p2 = new stu(); //???????
	p1.info = new Scanner(System.in).nextLine();
	while (strcmp(p1.info,"end") != 0)
	{
		n++;
	if (n == 1)
	{
		head = p1;
	}
	else
	{
		p2.next = p1;
	}
	p2 = p1;
	p1 = new stu();
	p1.info = new Scanner(System.in).nextLine();
	}
	p2.next = null;
	return (head);
	}

	public static stu turnback(stu head)
	{
		stu New;
		stu Newhead = null;
		do
		{
			p2 = null;
			p1 = head;
			while (p1.next != null)
			{
				p2 = p1;
			p1 = p1.next;
			}
			if (Newhead == null)
			{
				Newhead = p1;
				New = Newhead.next = p2;
			}
			New = New.next = p2;
			p2.next = null;
		}while (head.next != null);
		return (Newhead);
	}
	public static void output(stu head)
	{
		for (p1 = head;p1 != null;System.out.println(p1.info),p1 = p1.next)
		{
			;
		}
	}
	public static void Main()
	{
		stu head;
		head = creat();
		head = turnback(head);
		output(head);
	}



}

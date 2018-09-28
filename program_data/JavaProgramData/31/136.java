public class stu
{
	public String id = new String(new char[500]);
	public stu next;
	public stu pre;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		stu p1;
		stu p2;
		stu head;
		stu tail;
		stu p;
		n = 0;
		p1 = p2 = new stu();
		p1.id = new Scanner(System.in).nextLine();
		while (strcmp(p1.id,"end") != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
				p1.pre = null;
			}
			else
			{
				p2.next = p1;
				p1.pre = p2;
			}
			p2 = p1;
			p1 = new stu();
			p1.id = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		tail = p2;
		p = tail;
		do
		{
			System.out.printf("%s\n",p.id);
			p = p.pre;
		}while (p != null);
	}
}

public class student
{
	public String inf = new String(new char[200]);
	public student next;
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
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		p2 = p1;
		p1.inf = new Scanner(System.in).nextLine();
		head = null;
		do
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.inf = new Scanner(System.in).nextLine();
		} while (strcmp((p1.inf),"end") != 0);
		p2.next = null;
		return (head);
	}
	public static int Main()
	{
		student r;
		student headr;
		r = creat();
		headr = r;
		r = r.next;
		for (;r != headr;)
		{
			for (r = headr;r.next != null;)
			{
				r = r.next;
			}
			System.out.printf("%s\n",r.inf);
			for (r = headr;(r.next).next != null;)
			{
				r = r.next;
			}
			r.next = null;
		}
		System.out.printf("%s",headr.inf);
	}
}

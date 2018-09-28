public class xinxi
{
	public String stu = new String(new char[1000]);
	public xinxi next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		xinxi head;
		xinxi p;
		xinxi pt;
		int i;
		int n;

		p = new xinxi();
		p.stu = new Scanner(System.in).nextLine();
		pt = p;
		head = new xinxi();
		n = 0;
		while (strcmp(p.stu,"end") != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				head.next = p;
			}
			if (n > 1)
			{
				pt.next = p;
			}

			pt = p;
			p = new xinxi();
			n = n + 1;
			p.stu = new Scanner(System.in).nextLine();
		}
		pt.next = null;

	while (head.next != null)
	{
			pt = head;
		p = head.next;
		while (p.next != null)
		{
			p = p.next;
		pt = pt.next;
		}

		System.out.println(p.stu);
		pt.next = null;
	}
	}

}

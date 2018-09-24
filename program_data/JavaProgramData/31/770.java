public class link
{
	public String s = new String(new char[100]);
	public link next;
	public link last;
}

package <missing>;

public class GlobalMembers
{
	public static link create()
	{
		link last;
		link head;
		link p;
		String s = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (link)malloc(LEN);
		last = head;
		do
		{
			s = new Scanner(System.in).nextLine();
			if (s.length() == 3)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (link)malloc(LEN);
			p.s = s;
			last.next = p;
			p.last = last;
			last = p;
		} while (0 == 0);
		last.next = null;
		head = head.next;
		head.last = null;
		return head;
	}
	public static void nprint(link p)
	{
		link last;
		while (p != null)
		{
			last = p;
			p = p.next;
		}
		p = last;
		while (p != null)
		{
			System.out.println(p.s);
			p = p.last;
		}
	}
	public static int Main()
	{
		link p;
		p = create();
		nprint(p);
	}
}

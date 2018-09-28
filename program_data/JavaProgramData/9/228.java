public class s
{
	public int d;
	public String c = new String(new char[20]);
	public s next;
}

package <missing>;

public class GlobalMembers
{
	public static void sort(s head)
	{
		s pre = head;
		s p = pre.next;
		s s;
		s = new s();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s.c = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s.d = Integer.parseInt(tempVar2);
		}
		s.next = null;
		if (s.d >= 60)
		{
			while (p != null && p.d >= s.d)
			{
				pre = p;
				p = p.next;
			}
			pre.next = s;
			s.next = p;
		}
		if (s.d < 60)
		{
			while (p != null)
			{
				pre = p;
				p = p.next;
			}
				pre.next = s;
				s.next = p;
		}
	}
	public static int Main()
	{
		s head;
		s p;
		int n;
		int i;
		head = new s();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head.next = null;
		for (i = 0;i < n;i++)
		{
			sort(head);
		}
		p = head.next;
		while (p != null)
		{
			System.out.printf("%s\n",p.c);
			p = p.next;
		}
		return 0;
	}
}


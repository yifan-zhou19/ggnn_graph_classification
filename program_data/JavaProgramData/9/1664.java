public class bingren
{
	public String id = new String(new char[20]);
	public int nian;
	public bingren next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		bingren p1;
		bingren head;
		bingren temp = new bingren();
		final String a = "";
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = new bingren();
		head.next = null;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			head.id = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			head.nian = Integer.parseInt(tempVar3);
		}
		p1 = head;
		for (i = 1;i < n;i++)
		{
			p1.next = new bingren();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.next.id = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.next.nian = Integer.parseInt(tempVar5);
			}
			p1.next.next = null;
			p1 = p1.next;
		}
		p1 = head;
		for (i = 1;i < n;i++)
		{
			for (;p1.next != null;)
			{
				if (p1.next.nian >= 60 && p1.next.nian > p1.nian)
				{
					b = p1.nian;
					p1.nian = p1.next.nian;
					p1.next.nian = b;
					a = p1.id;
					p1.id = p1.next.id;
					p1.next.id = a;
				}
				p1 = p1.next;
			}
			p1 = head;
		}
		p1 = head;
		for (;p1 != null;)
		{
			System.out.printf("%s\n",p1.id);
			p1 = p1.next;
		}
	}












}


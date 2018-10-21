public class data
{
	public String a = new String(new char[20]);
	public int b;
	public data next;
}

package <missing>;

public class GlobalMembers
{
	public static data sort(int n)
	{
	data p = null;
	data q = null;
	data s = null;
	data head = null;
	head = new data();
	head.next = null;
	int i;
	for (i = 0;i < n;i++)
	{
	s = new data();
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s.a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		(s.b) = Integer.parseInt(tempVar2);
	}
	if (s.b >= 60)
	{
		q = head;
		p = head.next;
		while (p != null)
		{
			if (p.b < s.b)
			{
				break;
			}
			q = q.next;
			p = p.next;
		}
		q.next = s;
		s.next = p;
	}
	else
	{
		q = head;
		p = head.next;
		while (p != null)
		{
			q = q.next;
			p = p.next;
		}
		q.next = s;
		s.next = null;
	}
	}

	return head;
	}


	public static int Main()
	{
		int n;
		int i;
		data p;
		data head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = sort(n);
		p = head.next;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p.a);
			p = p.next;
		}
	}
}


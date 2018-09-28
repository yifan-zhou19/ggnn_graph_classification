public class pat
{
	public String id = new String(new char[11]);
	public int age;
	public pat next;
}

package <missing>;

public class GlobalMembers
{
	public static void find(pat head, pat s)
	{
		pat pre = head;
		pat p = pre.next;
		while (p != null && s.age <= p.age)
		{
			pre = p;
			p = p.next;
		}
		pre.next = s;
		s.next = p;
	}

	public static void sort(pat head, int x, String name)
	{
		pat pre = head;
		pat p = pre.next;
		pat s;
		s = new pat();
		s.age = x;
		s.id = name;
		s.next = null;
		if (x >= 60)
		{
			find(head, s);
		}
		else
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

		pat head;
		pat p;
		int n;
		int x;
		int i;
		String name = new String(new char[11]);
		head = new pat();
		head.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			sort(head, x, name);
		}
		p = head.next;
		while (p != null)
		{
			System.out.printf("%s\n",p.id);
			p = p.next;
		}
		return 0;
	}
}


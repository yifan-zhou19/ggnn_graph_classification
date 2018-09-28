public class people
{
	public String num = new String(new char[10]);
	public int age;
	public people next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		people head;
		people p0;
		people p;
		people s;
		head = new people();
		head.next = null;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			p0 = head;
			p = p0.next;
			s = new people();
			s.next = null;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s.num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s.age = Integer.parseInt(tempVar3);
			}
			while (p != null && ((s.age >= 60 && s.age <= p.age) || s.age < 60))
			{
				p0 = p;
				p = p.next;
			}
			p0.next = s;
			s.next = p;
		}
		p = head.next;
		while (p != null)
		{
			System.out.printf("%s\n",p.num);
			p = p.next;
		}
	}
}


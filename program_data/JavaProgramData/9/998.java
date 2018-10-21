public class hospital
{
	public String ID = new String(new char[13]);
	public int age;
	public hospital next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void change(struct hospital *);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		hospital p;
		hospital head;
		p = new hospital();
		head = p;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.age = Integer.parseInt(tempVar3);
			}
			p.next = new hospital();
			p = p.next;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p.ID = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p.age = Integer.parseInt(tempVar5);
		}
		p.next = null;
		for (i = 0;i < n;i++)
		{
		for (p = head;p.next != null;p = p.next)
		{
			if (p.age < 60 && p.next.age >= 60)
			{
				change(p);
			}
			if (p.age >= 60 && p.next.age >= 60 && p.next.age > p.age)
			{
				change(p);
			}
		}
		}
		for (p = head;p != null;p = p.next)
		{
			System.out.printf("%s\n",p.ID);
		}
		return 0;
	}
	public static void change(hospital p)
	{
		int tempage;
		String tempID = new String(new char[13]);
		hospital later = p.next;
		tempage = later.age;
		tempID = later.ID;
		later.age = p.age;
		later.ID = p.ID;
		p.age = tempage;
		p.ID = tempID;
	}

}


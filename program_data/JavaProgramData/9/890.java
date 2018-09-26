public class patient
{
	public String id = new String(new char[10]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		patient p;
		patient pre;
		patient pnew;
		patient head1;
		patient head2;
		head1 = null;
		head2 = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new patient();
		for (i = 0;i < n;i++)
		{
			pnew = new patient();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pnew.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pnew.age = Integer.parseInt(tempVar3);
			}
			pnew.next = null;
			if (pnew.age >= 60)
			{
				if (head1 == null)
				{
					head1 = pnew;
				}
				else
				{
					p = head1;
					while (p != null && p.age >= pnew.age)
					{
						pre = p;
						p = p.next;
					}
					if (p == head1)
					{
						pnew.next = head1;
						head1 = pnew;
					}
					else
					{
						pre.next = pnew;
						pnew.next = p;
					}
				}
			}
			else
			{
				if (head2 == null)
				{
					head2 = pnew;
				}
				else
				{
					p = head2;
					while (p != null)
					{
						pre = p;
						p = p.next;
					}
					if (p == head2)
					{
						pnew.next = head2;
						head2 = pnew;
					}
					else
					{
						pre.next = pnew;
						pnew.next = p;
					}
				}
			}
		}
		p = head1;
		if (head1 != null)
		{
			while (p != null)
			{
				System.out.printf("%s\n",p.id);
				p = p.next;
			}
		}
		p = head2;
		if (head2 != null)
		{
			while (p != null)
			{
				System.out.printf("%s\n",p.id);
				p = p.next;
			}
		}
		return 0;
	}
}


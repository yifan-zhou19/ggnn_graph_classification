public class patient
{
	public String ID = new String(new char[10]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static patient insert(patient head, patient another)
	{
		patient p0;
		patient p1;
		patient p2;
		p1 = head;
		p0 = another;
		if (p0.age < 60)
		{
			while (p1.next != null)
			{
				p2 = p1;
				p1 = p1.next;
			}
			p1.next = p0;
			p0.next = null;
		}
		else
		{
			while (p1.age >= p0.age != 0 && p1.next != null)
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (p1.age >= p0.age)
			{
				p1.next = p0;
				p0.next = null;
			}
			else
			{
				if (p1 == head)
				{
					head = p0;
					p0.next = p1;
				}
				else
				{
					p2.next = p0;
					p0.next = p1;
				}
			}
		}
		return head;
	}
	public static void print(patient head)
	{
		patient p;
		p = head;
		while (p != null)
		{
			System.out.printf("%s\n",p.ID);
			p = p.next;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		patient head;
		patient p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p = (patient)malloc(len);
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
		head.next = null;
		for (i = 1;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p = (patient)malloc(len);
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
		   head = insert(head, p);
		}
		print(head);
	}
}


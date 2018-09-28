public class patient
{
	public String id = new String(new char[10]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static void sort(patient head, patient s)
	{
		patient pre = head;
		patient p = pre.next;
		if (s.age >= 60)
		{
			while (p != null && s.age <= p.age)
			{
				pre = p;
				p = p.next;
			}
			pre.next = s;
			s.next = p;
		}
		else
		{
			while (pre.next != null)
			{
				pre = pre.next;
			}
			pre.next = s;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		patient head;
		patient p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (patient)malloc(LEN);
		head.next = null;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (patient)malloc(LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.age = Integer.parseInt(tempVar3);
			}
			p.next = null;
			sort(head, p);
		}
		p = head.next;
		while (p != null)
		{
			System.out.printf("%s\n", p.id);
			p = p.next;
		}
	}
}


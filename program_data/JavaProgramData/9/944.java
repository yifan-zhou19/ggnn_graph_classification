public class patient
{
	public String id = new String(new char[10]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static patient sort(patient head, String d, int a)
	{
		patient pp;
		patient p;
		patient s;
		p = head;
		pp = p;
		p = p.next;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (patient)malloc(LEN);
		s.id = d;
		s.age = a;
		while (p != null && p.age >= a)
		{
			pp = p;
			p = p.next;
		}
		s.next = p;
		pp.next = s;
	}

	public static patient creat(patient hhead, String d, int a)
	{
		patient p;
		patient pp;
		patient s;
		p = hhead;
		pp = p;
		p = p.next;
		while (p != null)
		{
			pp = p;
			p = p.next;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (patient)malloc(LEN);
		s.age = a;
		s.id = d;
		s.next = p;
		pp.next = s;
	}

	public static void Main()
	{
		patient head;
		patient hhead;
		patient p1;
		patient p2;
		int n;
		int a;
		int i;
		String d = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (patient)malloc(LEN);
		head.next = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		hhead = (patient)malloc(LEN);
		hhead.next = null;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			if (a >= 60)
			{
				sort(head, d, a);
			}
			else
			{
				creat(hhead, d, a);
			}
		}
		p1 = head.next;
		p2 = hhead.next;
		while (p1 != null)
		{
			System.out.printf("%s\n",p1.id);
			p1 = p1.next;
		}
		while (p2 != null)
		{
			System.out.printf("%s\n",p2.id);
			p2 = p2.next;
		}
	}


}


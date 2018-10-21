public class patient
{
public String ID = new String(new char[10]);
public int age;
public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static void sort(patient head, patient q)
	{
	patient pre = head;
	patient p = pre.next;
	patient s;
	s = new patient();
	s.age = q.age;
	s.ID = q.ID;
	s.next = null;
	if (q.age >= 60)
	{
	while ((p != null) && (q.age <= p.age))
	{
	pre = p;
	p = p.next;
	}
	pre.next = s;
	s.next = p;
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
	head = new patient();
	head.next = null;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	p = new patient();
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
	sort(head, p);
	}
	print(head.next);
	}
}


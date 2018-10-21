public class patient
{
	public String ID = new String(new char[15]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static patient create()
	{
		patient head;
		patient p1;
		patient p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (patient)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.ID = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.age = Integer.parseInt(tempVar2);
		}
		head = p1;
		p2 = p1;
		p1.next = null;
		int i = 1;
		do
		{
			if (i == n)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (patient)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.ID = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
			p2.next = p1;
			p2 = p1;
			p1.next = null;
			i++;
		}while (1 != 0);
		return (head);
	}
	public static patient findmax(patient head)
	{
		patient max;

		patient p;
		max = head;
		p = head.next;
		while (p != null)
		{
			if (p.age > max.age)
			{
				max = p;
			}
			p = p.next;
		}
		return (max);
	}
	public static patient del(patient head, patient needdel)
	{
		patient p;
		patient ppre;
		System.out.printf("%s\n",needdel.ID);
		p = head;
		while (p != null && needdel != p)
		{
			ppre = p;
		p = p.next;
		}
		if (p == head)
		{
			head = p.next;
			p = null;
		}
		else if (p)
		{
			ppre.next = p.next;
			p = null;
		}

		return (head);
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
	public static int Main()
	{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		patient head;
		patient p;
		head = create();
		p = head;

		do
		{
			p = findmax(head);
			if (p.age < 60)
			{
				break;
			}
			head = del(head, p);

		}while (1 != 0);
		print(head);
	}





}


public class patient
{
	public String ID = new String(new char[20]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int N;
	public static patient creat()
	{
		patient head;
		patient p1;
		patient p2;
		int i;
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
		p1.next = null;
		head = p1;
		p2 = p1;
		for (i = 1;i < N;i++)
		{
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
			p1.next = null;
			p2.next = p1;
			p2 = p1;
		}
		return (head);
	}
	public static patient rank(patient head)
	{
		int i;
		int j;
		int a;
		String ID = new String(new char[20]);
		patient p1;
		patient p2;
		for (i = 0;i < N - 1;i++)
		{
			p1 = head;
			p2 = head.next;
			for (j = 0;j < N - i - 1;j++)
			{
				if ((p1.age < p2.age) && (p2.age >= 60))
				{
					a = p1.age;
					p1.age = p2.age;
					p2.age = a;
					ID = p1.ID;
					p1.ID = p2.ID;
					p2.ID = ID;
				}
				p1 = p2;
				p2 = p2.next;
			}
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
		patient head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		head = creat();
		head = rank(head);
		print(head);
	}

}


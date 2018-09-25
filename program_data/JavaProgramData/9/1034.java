public class Patient
{
	public String id = new String(new char[10]);
	public int age;
	public Patient next;
	public Patient pre;
}

package <missing>;

public class GlobalMembers
{
	public static Patient creat(int x)
	{
	Patient p1;
	Patient p2;
	Patient head;
	Patient p;
	int i;
		head = null;
		for (i = 0;i < x;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (Patient)malloc(Len);
			if (i == 0)
			{
				head = p1;
				head.pre = null;
			}
			else
			{
				p2.next = p1;
				p1.pre = p2;
			}
			p2 = p1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.id = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.age = Integer.parseInt(tempVar2);
			}
		}
		p1.next = null;
		return head;
	}
	public static Patient sort(Patient head)
	{
	Patient p1;
	Patient p2;
	Patient temp;
	Patient p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	temp = (Patient)malloc(Len);
		p1 = p2 = head;
		while (p1 != null)
		{
			if (p1.age >= 60)
			{
				p2 = p1.next;
				while (p2 != null)
				{
					if (p2.age > p1.age)
					{
						temp.age = p2.age;
						temp.id = p2.id;
						p = p2;
						while (p.pre != p1)
						{
							p.id = p.pre.id;
							p.age = p.pre.age;
							p = p.pre;
						}
						p.id = p1.id;
						p.age = p1.age;
						p1.age = temp.age;
						p1.id = temp.id;
					}
					 p2 = p2.next;
				}
			}
			p1 = p1.next;
		}
	  return head;
	}
	public static void print(Patient head)
	{
	Patient p1;
	Patient p2;
	Patient p;
	p = head;
		while (p != null)
		{
			if (p.age >= 60)
			{
				System.out.printf("%s\n",p.id);
			}
			p = p.next;
		}
		p = head;
		while (p != null)
		{
			if (p.age < 60)
			{
				System.out.printf("%s\n",p.id);
			}
			p = p.next;
		}
	}

	public static int Main()
	{
		Patient patient;
		Patient patient2;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		patient = creat(n);
		patient2 = sort(patient);
		print(patient2);
	}
}


public class patient
{
	public String id = new String(new char[20]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		patient head;
		patient p1;
		patient p2;
		patient p0;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (patient)malloc(LEN);
		head = null;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.age = Integer.parseInt(tempVar3);
			}
			p1.next = null;
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				if ((p1.age > 60) && (p1.age > head.age))
				{
					p0 = head;
					p1.next = p0;
					head = p1;
				}
				else
				{
					p0 = head;
					p2 = head.next;
					if ((p1.age) < 60)
					{
						while (p2 != null)
						{
							p0 = p2;
							p2 = p2.next;
						}
						p0.next = p1;
					}
					else
					{
						while ((p2 != null) && ((p1.age) <= (p2.age)))
						{
							p0 = p2;
							p2 = p2.next;
						}
						p0.next = p1;
						p1.next = p2;
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (patient)malloc(LEN);
		}

		p1 = head;
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%s\n",p1.id);
			p1 = p1.next;
		}
		System.out.printf("%s",p1.id);
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char ID[10];
	//		int age;
	//		struct patient *next;
	//		struct patient *pre;
	//	};
		patient p;
		patient head;
		patient q;
		patient m;
		patient temp;
		p = new patient();
		head = p;
		temp = new patient();
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.age = tempVar3;
			}
			if (i != n - 1)
			{
				p.next = new patient();
				p.next.pre = p;
				p.next.next = null;
				p = p.next;
			}
		}
		for (p = head;p != null;p = p.next)
		{
			for (q = p.next;q != null;q = q.next)
			{
				if ((p.age < q.age) && (q.age >= 60))
				{
					for (m = q;m != p;m = m.pre)
					{
						temp.age = m.age;
						m.age = m.pre.age;
						m.pre.age = temp.age;
						temp.ID = m.ID;
						m.ID = m.pre.ID;
						m.pre.ID = temp.ID;
					}
				}
			}
		}
		for (p = head;p != null;p = p.next)
		{
		System.out.printf("%s\n",p.ID);
		}
		return 0;
	}

}


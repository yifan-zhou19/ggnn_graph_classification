package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct joyan
	//	{
	//		char num[10];
	//		char name[20];
	//		char sex[1];
	//		int age;
	//		float score;
	//		char add[20];
	//		struct joyan * next;
	//	};
		joyan head;
		joyan p1;
		joyan p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = head = (joyan)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.sex = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.age = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.score = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.add = tempVar6;
		}
		p1.next = null;
		int n = 1;
		int i;
		while (p1.num[0] >= '0' && p1.num[0] <= '9')
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (joyan)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7;
			}
			if (p1.num[0] != 'e')
			{
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					p1.name = tempVar8;
				}
				String tempVar9 = ConsoleInput.scanfRead();
				if (tempVar9 != null)
				{
					p1.sex = tempVar9;
				}
				String tempVar10 = ConsoleInput.scanfRead();
				if (tempVar10 != null)
				{
					p1.age = tempVar10;
				}
				String tempVar11 = ConsoleInput.scanfRead();
				if (tempVar11 != null)
				{
					p1.score = tempVar11;
				}
				String tempVar12 = ConsoleInput.scanfRead();
				if (tempVar12 != null)
				{
					p1.add = tempVar12;
				}
				p2.next = p1;
				p2 = p1;
				n++;
			}
			else
			{
				p2.next = null;
				break;
			}

		}
		joyan p;
		joyan q;
		joyan temp;
		p = head;
		if (p.next != null)
		{
			q = p.next;
			if (q.next == null)
			{
				p.next = null;
				q.next = p;
			}
			else
			{
				p.next = null;
				temp = p;
				p = q;
				q = q.next;
				while (q.next != null)
				{
					p.next = temp;
					temp = p;
					p = q;
					q = q.next;
				}
				p.next = temp;
				q.next = p;
			}
			head = q;
		}

		p1 = head;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s %s %s %d %g %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
			p1 = p1.next;
		}
		return 0;
	}
}


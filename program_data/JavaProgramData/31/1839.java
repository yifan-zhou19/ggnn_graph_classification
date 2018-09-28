package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char num[21];
	//		char name[31];
	//		char sex[2];
	//		int age;
	//		float score;
	//		char address[31];
	//		struct stu *next;
	//		struct stu *pre;
	//	};
		stu head;
		stu p1;
		stu p2;
		stu tail;
		head = new stu();
		p1 = head;
		p2 = p1;
		p1.pre = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar;
		}
		if (strcmp(p1.num,"end"))
		{
		while (strcmp(p1.num,"end"))
		{
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
				p1.address = tempVar6;
			}
			p2 = new stu();
			p1.next = p2;
			p2.pre = p1;
			p1 = p2;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7;
			}
		}
		tail = p1.pre;
		p1 = null;
		tail.next = null;
		p1 = tail;
		p2 = p1;
		while (p1 != null)
		{
			System.out.printf("%s %s %s %d %g %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.address);
			p2 = p1.pre;
			p1 = p2;
		}
		p1 = head;
		p2 = p1;
		while (p1 != null)
		{
			p2 = p1.next;
			p1 = null;
			p1 = p2;
		}
		}
		else
		{
			head = null;
		}
	}
}


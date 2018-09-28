package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char num[100];
	//		char nam[100];
	//		char sex;
	//		int age;
	//		float sco;
	//		char add[100];
	//		struct stu *next;
	//	};
		int len = 1;
		int i;
		stu p1;
		stu p2;
		stu head;
		stu new;
		stu newhead;
		p1 = p2 = head =  new stu();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar;
		}
		while (strcmp(p1.num,"end") != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.nam = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
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
				p1.sco = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.add = tempVar6;
			}
			p1 =  new stu();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7;
			}
			if (strcmp(p1.num,"end") == 0)
			{
				p2.next = null;
			}
			else
			{
				p2.next = p1;
				p2 = p1;
				len++;
			}
		}
		p1 = head;
		for (i = 0;i < len;i++)
		{
			p2 = p1 = head;
			while (p1.next != null)
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (i == 0)
			{
				newhead = new = p1;
			}
			else
			{
				new = new.next = p1;
			}
			p2.next = null;
		}
		p1 = newhead;
		for (i = 0;i < len;i++)
		{
			System.out.printf("%s %s %c %d %g %s\n",p1.num,p1.nam,p1.sex,p1.age,p1.sco,p1.add);
			p1 = p1.next;
		}
	}

}


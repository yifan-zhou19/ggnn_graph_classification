package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char No[9];
	//		char name[20];
	//		char sex;
	//		int age;
	//		char score[8];
	//		char add[20];
	//		struct student *next,*last;
	//	};
		student p;
		student head;
		student tail;
		p = new student();
		head = p;
		head.last = null;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.No = tempVar;
			}
			if (p.No[0] == 'e')
			{
				p.next = null;
				tail = p.last;
			}
			else
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p.name = tempVar2;
				}
				String tempVar3 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar3 != null)
				{
					p.sex = tempVar3;
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p.age = tempVar4;
				}
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					p.score = tempVar5;
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					p.add = tempVar6;
				}
				p.next = new student();
				p.next.last = p;
			}
			p = p.next;
		}while (p != null);
		p = tail;
		while (p != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.No,p.name,p.sex,p.age,p.score,p.add);
			p = p.last;
		}
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char num[100];
	//		char name[100];
	//		char sex[10];
	//		char age[10];
	//		char score[10];
	//		char address[100];
	//		struct student *next;
	//	};
		student head;
		student p1;
		p1 = new student();
		head = null;
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
			 p1.next = head;
			head = p1;
			p1 = new student();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7;
			}
		}
		p1 = head;
		while (p1 != null)
		{
			System.out.printf("%s %s %s %s %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.address);
			p1 = p1.next;
		}
	}









}


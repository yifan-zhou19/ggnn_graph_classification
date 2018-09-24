package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char number[20];
	//		char name[20];
	//		char sex;
	//		int age;
	//		float score;
	//		char address[20];
	//		struct student *fomer;
	//		struct student *next;
	//	};
		student head;
		student p;
		student wei;
		int i;
		int j;
		head = new student();
		p = head;
		p.fomer = null;
		if (p == null)
		{
				System.out.print("fail!!!");
				System.exit(-1);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.number = tempVar;
		}
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
		String tempVar4 = ConsoleInput.scanfRead(" ");
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
			p.address = tempVar6;
		}
		for (i = 1;i <= 1000;i++)
		{
			p.next = new student();
			p.next.fomer = p;
			p = p.next;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p.number = tempVar7;
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p.name = tempVar8;
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				p.sex = tempVar9;
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p.age = tempVar10;
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				p.score = tempVar11;
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				p.address = tempVar12;
			}
			//printf("%s %s %c %d %g %seeererrtttre\n",p->fomer->number,p->fomer->name,p->fomer->sex,p->fomer->age,p->fomer->score,p->fomer->address);
			if (*p.number == 'e')
			{
				p.fomer.next = null;
				wei = p.fomer;
				//printf("%s %s %c %d %g %s\n",wei->number,wei->name,wei->sex,wei->age,wei->score,wei->address);
				break;
			}
		}
		//printf("%s %s %c %d %g %s\n",wei->number,wei->name,wei->sex,wei->age,wei->score,wei->address);
		p = wei;
		for (;p != null;)
		{
		   System.out.printf("%s %s %c %d %g %s\n",p.number,p.name,p.sex,p.age,p.score,p.address);
		   p = p.fomer;
		}


	}
}


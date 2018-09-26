package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct st
	//	{
	//		char num[500];
	//		char name[500];
	//		char sex;
	//		int age;
	//		double mark;
	//		char adress[500];
	//		struct st *next;
	//	}
	//	*p,*p1,*p2;
		p2 = null;

		while (true)
		{
			p1 = new st();
			p1.next = p2;
			p2 = p1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar;
			}
			if (strcmp("end",p1.num) == 0)
			{
				p = p1.next;
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.sex = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.mark = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.adress = tempVar6;
			}

		}

		while (p != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.mark,p.adress);
			p = p.next;
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char num[20];
	//		char name[20];
	//		char sex[5];
	//		int age;
	//		char score[10];
	//		char add[100];
	//		struct student *next;
	//	}
	//	*p1,*head,*p2,*end,*p3,*heade;
		head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = p1 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar;
		}
		if (p1.num[0] != 'e')
		{
			head = p1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
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
				p1.score = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6;
			}
			n = 1;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			p1.num = tempVar7;
		}
		while (p1.num[0] != 'e')
		{
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8;
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.sex = tempVar9;
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.age = tempVar10;
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p1.score = tempVar11;
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.add = tempVar12;
			}
			n++;
			p2.next = p1;
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar13 = ConsoleInput.scanfRead();
			if (tempVar13 != null)
			{
				p1.num = tempVar13;
			}
		}
		p2.next = null;
		end = p2;
		if (n == 1)
		{
			System.out.printf("%s %s %s %d %s %s\n",head.num,head.name,head.sex,head.age,head.score,head.add);
		}
		else if (n == 2)
		{
			System.out.printf("%s %s %s %d %s %s\n",end.num,end.name,end.sex,end.age,end.score,end.add);
			System.out.printf("%s %s %s %d %s %s\n",head.num,head.name,head.sex,head.age,head.score,head.add);
		}
		else
		{
			p1 = head;
			p2 = head.next;
			p3 = p2.next;
			p1.next = null;
			p2.next = p1;
			while (p3.next != null)
			{
				p1 = p2;
				p2 = p3;
				p3 = p2.next;
				p2.next = p1;
			}
			p3.next = p2;
			heade = p3;
			p1 = heade;
			while (p1 != null)
			{
				System.out.printf("%s %s %s %d %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
				p1 = p1.next;
			}
		}
		return 0;
	}
}


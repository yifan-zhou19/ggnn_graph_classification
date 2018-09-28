package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char num[20];
	//		char name[20];
	//		char sex;
	//		int age;
	//		float mark;
	//		char address[20];
	//		struct student *next;
	//		struct student *pre;
	//	};
		student stu;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		stu = (student)malloc(LEN);
		stu.pre = null;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				stu.num = tempVar;
			}
			if (strcmp(stu.num,"end") == 0)
			{
			break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				stu.sex = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu.age = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				stu.mark = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				stu.address = tempVar6;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			stu.next = (student)malloc(LEN);
			stu.next.pre = stu;
			stu = stu.next;
		}
		stu = stu.pre;
		stu.next = null;
		for (;stu != null;)
		{
			System.out.printf("%s %s %c %d %g %s\n",stu.num,stu.name,stu.sex,stu.age,stu.mark,stu.address);
			stu = stu.pre;
			if (stu != null)
			{
			stu.next = null;
			}
		}
		return 0;
	}

}


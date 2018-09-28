package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char num[10],name[20],sex,add[15];
	//		int age;
	//		float mark;
	//		struct student * next;
	//		struct student * before;
	//	};
		student s1 = new student();
		student head = s1;
		student s2;
		s1.before = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s1.num = tempVar;
			}
			if (s1.num[0] != 'e')
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s1.name = tempVar2;
				}
				String tempVar3 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar3 != null)
				{
					(s1.sex) = tempVar3;
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					(s1.age) = tempVar4;
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					(s1.mark) = tempVar5;
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					s1.add = tempVar6;
				}
				s2 = s1.next = new student();
				s2.before = s1;
				s1 = s2;
			}
			else
			{
				head = s1.before;
				break;
			}
		}
		s1 = head;
		while (true)
		{
			System.out.printf("%s %s %c %d %g %s\n",s1.num,s1.name,s1.sex,s1.age,s1.mark,s1.add);
			if (s1.before)
			{
				s1 = s1.before;
			}
			else
			{
				break;
			}
		}
	}
}


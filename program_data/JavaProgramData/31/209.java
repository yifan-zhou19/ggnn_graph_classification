package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char info[1000];
	//		struct student *pre,*next;
	//	}
	//	*head,*tail,*p;
		int l;
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		l = sizeof(student);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(l);
		p = head;
		p.pre = null;
		p.next = null;
		for (;;)
		{
			p.info = new Scanner(System.in).nextLine();
			if (strcmp(p.info,"end") == 0)
			{
				tail = p;
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p.next = (student)malloc(l);
			(p.next).pre = p;
			(p.next).next = null;
			p = p.next;
		}
		p = tail;
		for (;;)
		{
			if (!(p.pre))
			{
				p = null;
				break;
			}
			System.out.println((p.pre).info);
			p = p.pre;
			p.next = null;
		}
	}
}

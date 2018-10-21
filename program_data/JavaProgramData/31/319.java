package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct li
	//	{
	//		char num[20],k[1000];
	//		struct li *next,*up;
	//	}
	//	*head,*p;
		head = new li();
		p = head;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.num = tempVar;
			}
			if (p.num[0] == 'e')
			{
				break;
			}
			p.k = new Scanner(System.in).nextLine();
			p.next = new li();
			(p.next).up = p;
			p = p.next;
		}
		p = p.up;
		while (p != head)
		{
			System.out.printf("%s%s\n",p.num,p.k);
			p = p.up;
		}
		System.out.printf("%s%s\n",head.num,head.k);

	}

}


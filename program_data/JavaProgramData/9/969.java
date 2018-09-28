public class pa
{
	public String id = new String(new char[10]);
	public int age;
	public pa next;
}

package <missing>;

public class GlobalMembers
{
	public static pa head;
	public static pa p;
	public static pa p2;

	public static int Main()
	{
		int i;
		int j;
		int n;
		int t;
		String tid = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = new pa();
		p = new pa();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p.id = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p.age = Integer.parseInt(tempVar3);
		}
		head.next = p;
		p.next = null;
		p2 = p;
		for (i = 1;i < n;i++)
		{
			p = new pa();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.id = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.age = Integer.parseInt(tempVar5);
			}
			p2.next = p;
			p2 = p;
			p2.next = null;
		}

	//	for(p=head->next;p!=NULL;p=p->next)printf("%s\n",p->id);	

		for (i = 0;i < n;i++) //???????????, ????GE?????
		{
			for (p = head.next;p.next != null;p = p.next)
			{
				if (p.next.age >= 60 && p.next.age > p.age) //???????..?????????.
				{
					t = p.age,p.age = p.next.age,p.next.age = t;
					tid = p.id,strcpy(p.id,p.next.id),strcpy(p.next.id,tid);
				}
			}
		}

		p = head.next;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p.id);
			p = p.next;
		}
		return 0;

	}
}


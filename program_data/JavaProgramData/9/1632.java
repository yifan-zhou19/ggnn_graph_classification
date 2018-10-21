package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct date
	//	{
	//		char a[10];
	//		int num;
	//		struct date *next;
	//	};
		date p1;
		date p2;
		date head;
		int n;
		int i;
		int temp;
		int j;
		int compare;
		String tem = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = p2 = (date)malloc(len);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			head.a = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			head.num = tempVar3;
		}
		head.next = null;
		head = p1;
		for (i = 2;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (date)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p2.a = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p2.num = tempVar5;
			}
			p2.next = null;
			p1.next = p2;
			p1 = p2;
		}
		for (i = n - 1;i >= 1;i--)
		{
			p1 = head;
			p2 = p1.next;
			for (j = 1;j <= i;j++)
			{
				compare = strcmp(p1.a,p2.a);
				if (p1.num < 60 && p2.num >= 60)
				{
					tem = p1.a;
					p1.a = p2.a;
					p2.a = tem;
					temp = p2.num;
					p2.num = p1.num;
					p1.num = temp;
				}
				if (p1.num >= 60 && p2.num >= 60 && p1.num < p2.num)
				{
					tem = p1.a;
					p1.a = p2.a;
					p2.a = tem;
					temp = p2.num;
					p2.num = p1.num;
					p1.num = temp;
				}
				p1 = p2;
				p2 = p1.next;
			}
		}
		p1 = p2 = head;
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%s\n",p2.a);
			p1 = p2;
			p2 = p1.next;
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		int a;
	//		int b;
	//		int c;
	//		int d;
	//		struct s *next;
	//	};
		s p1;
		s p2;
		s head;
		int i;
		int j;
		int k;
		int m;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = p2 = new s();
		head = p1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.a = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.b = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.c = tempVar4;
		}
		for (i = 0;i < n - 1;i++)
		{
			p1 = new s();
			p2.next = p1;
			p2 = p1;
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.a = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.b = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.c = tempVar7;
			}
		}
		p2.next = 0;
		p1 = p2 = head;
		for (i = 0;i < n;i++)
		{
			p1.d = p1.b + p1.c;
			p1 = p1.next;
		}
		p1 = head;
		p2 = p1.next;
		for (j = 0;j < 3;j++)
		{
			p1 = head;
			p2 = p1.next;
			for (i = 0;i < n - 2;i++)
			{
				if (p1.d < p2.d)
				{
					t = p1.d;
					p1.d = p2.d;
					p2.d = t;
					k = p1.a;
					p1.a = p2.a;
					p2.a = k;
				}

				p2 = p2.next;

			}
			p1 = head;


				System.out.printf("%d %d\n",p1.a,p1.d);
				p1.d = 0;

		}
	}
}


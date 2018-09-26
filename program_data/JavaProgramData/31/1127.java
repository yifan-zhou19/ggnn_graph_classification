package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		char a[100];
	//		char b[100];
	//		char c;
	//		int d;
	//		float e;
	//		char f[100];
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
		p1 = p2 = new s();
		head = p1 = p2;
		n = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.a = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.b = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.c = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.d = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.e = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.f = tempVar6;
		}
		for (i = 0;i < 10000;i++)
		{
			p1 = new s();
			p2.next = p1;
			p2 = p1;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.a = tempVar7;
			}
			if (strcmp(p1.a,"end") != 0)
			{
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					p1.b = tempVar8;
				}
				String tempVar9 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar9 != null)
				{
					p1.c = tempVar9;
				}
				String tempVar10 = ConsoleInput.scanfRead(" ");
				if (tempVar10 != null)
				{
					p1.d = tempVar10;
				}
				String tempVar11 = ConsoleInput.scanfRead(" ");
				if (tempVar11 != null)
				{
					p1.e = tempVar11;
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					p1.f = tempVar12;
				}
				n++;
			}
			else
			{
				break;
			}
		}
		p1 = p2 = head;
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
			p1 = p1.next;
			}
			System.out.printf("%s %s %c %d %g %s\n",p1.a,p1.b,p1.c,p1.d,p1.e,p1.f);
			p1 = head;
		}
		System.out.printf("%s %s %c %d %g %s\n",p1.a,p1.b,p1.c,p1.d,p1.e,p1.f);
	}

}


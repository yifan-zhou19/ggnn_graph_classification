package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char a[20];
	//		char b[30];
	//		char c;
	//		int d;
	//		char e[6];
	//		char f[20];
	//		struct stu *be;
	//	};
		int n = 0;
		stu head = null;
		stu p1;
		stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = p1 = (stu) malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.a = tempVar;
		}
		while (strcmp(p1.a,"end"))
		{
			if (n != 0)
			{
				p1.be = p2;
			}
			else
			{
				p1.be = null;
			}
			n++;
			String tempVar2 = ConsoleInput.scanfRead();
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
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu) malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.a = tempVar7;
			}
		}
		while (p2 != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p2.a,p2.b,p2.c,p2.d,p2.e,p2.f);
			p2 = p2.be;
		}
		return 0;
	}
}


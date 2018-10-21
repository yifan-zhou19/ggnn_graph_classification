package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	char a[20];
	//	char b[20];
	//	char c[20];
	//	char d[20];
	//	char e[20];
	//	char f[20];
	//	struct student *pNext;
	//	};
		student pHeader = new student();
		pHeader.pNext = null;
		student p;
		while (true)
		{
		p = new student();
		p.pNext = pHeader.pNext;
		pHeader.pNext = p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.a = tempVar;
		}
		if (p.a[0] == 'e')
		{
			break;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p.b = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p.c = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p.d = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p.e = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p.f = tempVar6;
		}
		}
		p = pHeader.pNext.pNext;
		while (true)
		{
		if (p == null)
		{
			break;
		}
		System.out.printf("%s %s %s %s %s %s\n",p.a,p.b,p.c,p.d,p.e,p.f);
		p = p.pNext;
		}
	}

}


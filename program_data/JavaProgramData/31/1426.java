package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct inf
	//	{
	//	struct inf *pLate;
	//	char num[20];
	//	char nam[20];
	//	char gen;
	//	int old[20];
	//	int sco[20];
	//	char loc[20];
	//	struct inf *pNext;
	//	};
		int i;
		int j;
		int k;
		inf pHeader;
		pHeader = new inf();
		inf p;
		inf p1 = null;
		p = pHeader;
		pHeader.pLate = null;
		for (i = 0;;i++)
		{
			p.pNext = new inf();
			p = p.pNext;
			p.pLate = p1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.num = tempVar;
			}
			if (p.num[0] == 'e')
			{
				p.pNext = null;
				break;
			}
			else
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.nam = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p.gen = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.old = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.sco = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p.loc = tempVar6;
			}
			p1 = p;
			}
		}
		for (j = i;j >= 1;j--)
		{
			p = p.pLate;
			System.out.printf("%s %s %c %s %s %s\n",p.num,p.nam,p.gen,p.old,p.sco,p.loc);
		}
		p = pHeader;
		inf pd;
		for (k = 0;k <= i;k++)
		{
			pd = p;
			p = p.pNext;
			pd = null;
		}
		p = null;
	}
}


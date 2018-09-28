package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char ID[10];
	//		int a;
	//	}
	//	p[100],pr;
		int np;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			np = Integer.parseInt(tempVar);
		}
		for (i = 0;i < np;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].a = tempVar3;
			}
		}
		for (i = 0;i < np;i++)
		{
			for (k = np - 1;k > i;k--)
			{
				if (p[k].a > p[k - 1].a && p[k].a >= 60)
				{
					pr = p[k];
					p[k] = p[k - 1];
					p[k - 1] = pr;
				}
			}
			System.out.printf("%s\n",p[i].ID);
		}
		return 0;
	}
}


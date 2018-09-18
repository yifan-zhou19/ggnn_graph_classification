package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int a;
	//		int b;
	//		int c;
	//		int d;
	//		int h;
	//	}
	//	s[100000];
		int i;
		int j;
		int k;
		int n;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].b = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].c = tempVar4;
			}
			s[i].d = s[i].b + s[i].c;
			s[i].h = -1;
		}
		for (i = 1;i <= 3;i++)
		{
			max = 0;
			k = 0;
			for (j = 1;j <= n;j++)
			{
				if ((s[j].d > max) && (s[j].h == -1))
				{
					max = s[j].d;
					k = j;
				}
			}
			s[k].h = 1;
			System.out.printf("%d %d\n",s[k].a,s[k].d);
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[100];
		int m = 0;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct time
	//	{
	//		int a,b,c,d,e,f;
	//	}
	//	t[100];
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t[i].a = tempVar;
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				t[i].b = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				t[i].c = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				t[i].d = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				t[i].e = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				t[i].f = tempVar6;
			}
			m++;
			if (t[i].a == 0 && t[i].b == 0 && t[i].c == 0 && t[i].d == 0 && t[i].e == 0 && t[i].f == 0)
			{
				break;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			n[i] = (t[i].d + 12 - t[i].a) * 3600 + t[i].e * 60 + t[i].f - (t[i].b * 60 + t[i].c);
			System.out.printf("%d\n",n[i]);
		}
		return 0;
	}
}


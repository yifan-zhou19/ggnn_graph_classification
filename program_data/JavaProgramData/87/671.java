package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct sk
	//	{
	//		  int a,b,c,d,e,f;
	//		  }
	//		  sk[100];
		int i;
		int n;
		int[] time = new int[100];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sk[i].a = tempVar;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sk[i].b = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sk[i].c = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sk[i].d = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				sk[i].e = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				sk[i].f = tempVar6;
			}
			if ((sk[i].a == 0) && (sk[i].b == 0) && (sk[i].c == 0) && (sk[i].d == 0) && (sk[i].e == 0) && (sk[i].f == 0))
			{
				n = i;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			time[i] = (sk[i].d + 12) * 3600 + sk[i].e * 60 + sk[i].f - sk[i].a * 3600 - sk[i].b * 60 - sk[i].c;
			System.out.printf("%d\n",time[i]);
		}
		return 0;
	}











}


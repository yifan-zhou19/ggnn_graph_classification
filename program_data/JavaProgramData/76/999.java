package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qujian
	//	{
	//		int a,b;
	//	}
	//	qj[5000];
		int n;
		int i;
		int j;
		int a;
		int b;
		int min;
		int max;
		int[] sz = new int[10000];
		int t;
		t = 1;
		min = 10000;
		max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 10000;i++)
		{
			sz[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			for (j = a;j < b;j++)
			{
				sz[j] = 1;
			}
			qj[i].a = a;
			qj[i].b = b;
			if (qj[i].a < min)
			{
				min = qj[i].a;
			}
			if (qj[i].b > max)
			{
				max = qj[i].b;
			}
		}
		for (i = min;i < max;i++)
		{
			if (sz[i] == 0)
			{
				t = 0;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}


}


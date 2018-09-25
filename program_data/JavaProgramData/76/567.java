package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int e;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qj
	//	{
	//		int a,b;
	//	}
	//	qj[50000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(qj[i].a) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(qj[i].b) = tempVar3;
			}
		}
		for (p = 0;p < n;p++)
		{
			for (i = n - 1;i > p;i--)
			{
				if (qj[i].a < qj[i - 1].a)
				{
					e = qj[i].a;
					qj[i].a = qj[i - 1].a;
					qj[i - 1].a = e;
				}
				if (qj[i].b < qj[i - 1].b)
				{
					e = qj[i].b;
					qj[i].b = qj[i - 1].b;
					qj[i - 1].b = e;
				}
			}
		}
		s = 0;
		for (i = 1;i < n;i++)
		{
			if (qj[i].a > qj[i - 1].b)
			{
				s = 1;
			}
		}
		if (s == 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",qj[0].a,qj[n - 1].b);
		}
		return 0;
	}

}


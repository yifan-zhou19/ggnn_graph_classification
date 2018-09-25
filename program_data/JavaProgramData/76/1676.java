package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qj
	//	{
	//		int x,y;
	//	}
	//	qj[50000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				qj[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qj[i].y = tempVar3;
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (qj[j].x > qj[j + 1].x)
				{
					int a;
					int b;
					a = qj[j + 1].x;
					b = qj[j + 1].y;
					qj[j + 1].x = qj[j].x;
					qj[j + 1].y = qj[j].y;
					qj[j].x = a;
					qj[j].y = b;
				}
			}
		}
		m = qj[0].y;
		for (i = 0;i < n - 1;i++)
		{
			if (qj[i + 1].y > m)
			{
				if (qj[i + 1].x > m)
				{
					System.out.print("no");
					return 0;
				}
				m = qj[i + 1].y;
			}
		}
		System.out.printf("%d %d",qj[0].x,m);
		return 0;
	}

}


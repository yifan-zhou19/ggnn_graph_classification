package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int h;
		int k;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qujian
	//	{
	//		int ai,bi;
	//	}
	//	qj[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				qj[i].ai = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				qj[i].bi = tempVar3;
			}
		}
		for (k = 1;k <= n;k++)
		{
		for (i = 0;i < n - k;i++)
		{
				if (qj[i].ai > qj[i + 1].ai)
				{
						e = qj[i + 1].ai;
						h = qj[i + 1].bi;
						qj[i + 1].ai = qj[i].ai;
						qj[i + 1].bi = qj[i].bi;
						qj[i].ai = e;
						qj[i].bi = h;
				}
		}
		}
		m = qj[0].bi;
		for (i = 1;i < n;i++)
		{
			if (m >= qj[i].ai)
			{
				if (m < qj[i].bi)
				{
					m = qj[i].bi;
				}
			}
			else
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",qj[0].ai,m);
		return 0;
	}
}


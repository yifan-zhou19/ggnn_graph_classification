package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qj
	//	{
	//		int a,b;
	//	}
	//	qj[50000],e;
		int n;
		int i;
		int k;
		int bmax;
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
				(qj[i].a) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(qj[i].b) = tempVar3;
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (qj[i].a > qj[i + 1].a)
				{
					e = qj[i + 1];
					qj[i + 1] = qj[i];
					qj[i] = e;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (qj[i].b < qj[i + 1].a)
			{
				System.out.print("no");
				break;
			}
			else if (qj[i].b > qj[i + 1].b)
			{
				qj[i + 1].b = qj[i].b;
			}
		}
		if (i == n)
		{
			System.out.printf("%d %d",(qj[0].a),qj[n].b);
		}
		return 0;
	}
}


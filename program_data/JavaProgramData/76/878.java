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
	//	qj[50001];
		int n;
		int i;
		int k;
		int e;
		int f;
		int j;
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
				qj[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qj[i].b = tempVar3;
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (qj[i].a > qj[i + 1].a)
				{
						e = qj[i + 1].a;
						qj[i + 1].a = qj[i].a;
						qj[i].a = e;
				}
				if (qj[i].b > qj[i + 1].b)
				{
					f = qj[i + 1].b;
					qj[i + 1].b = qj[i].b;
					qj[i].b = f;

				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (qj[i].b < qj[i + 1].a)
			{
				j = 0;
				break;
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		if (j != 0)
		{
			System.out.printf("%d %d",qj[0].a,qj[n - 1].b);

		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int e;
		int z;
		int q;
		int w;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qj
	//	{
	//		int a;
	//		int b;
	//	}
	//	qj[50000];
		for (i = 0;i < n;i = i + 1)
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
		for (k = 1;k <= n;k = k + 1)
		{
			for (i = 0;i < n - k;i = i + 1)
			{
				if (qj[i].a > qj[i + 1].a)
				{
					qj[n] = qj[i + 1];
					qj[i + 1] = qj[i];
					qj[i] = qj[n];
				}
			}
		}
		z = 0;
		for (i = 1;i < n;i = i + 1)
		{
			z = 0;
			for (c = 0;c < i;c = c + 1)
			{
				if (qj[i].a <= qj[c].b)
				{
					z = 1;
				}
			}
			if (z == 0)
			{
				break;
			}
		}
		q = qj[0].a;
		w = qj[0].b;
		for (i = 0;i < n;i = i + 1)
		{
			if (qj[i].a < q)
			{
				q = qj[i].a;
			}
			if (qj[i].b > w)
			{
				w = qj[i].b;
			}
		}
		if (z == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",q,w);
		}
		return 0;
	}

}


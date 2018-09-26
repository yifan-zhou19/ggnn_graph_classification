package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int e;
		int m;
		int c;
		int max;
		int z;
		int a;
		double j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qj
	//	{
	//		int a,b;
	//	}
	//	qj[50000];
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
			if (qj[i].a >= qj[i + 1].a)
			{
			e = qj[i].a;
			qj[i].a = qj[i + 1].a;
			qj[i + 1].a = e;
			m = qj[i].b;
			qj[i].b = qj[i + 1].b;
			qj[i + 1].b = m;
			}
		}
	}
	max = 0;
	for (i = 0;i < n;i++)
	{
		if (max < qj[i].b)
		{
		  max = qj[i].b;
		}
	}
	c = 0;
	for (j = qj[0].a + 0.5;j < max;j++)
	{
		z = 0;
		for (i = 0;i < n;i++)
		{
		if ((j < qj[i].b) && (j> qj[i].a))
		{
			   z = 1;
		}
		}
		if (z == 1)
		{
			c++;
		}
	}
	if (c == (max - (qj[0].a)))
	{
		System.out.printf("%d %d",(qj[0].a),max);
	}
	else
	{
		System.out.print("no");
	}

		return 0;

	}
}


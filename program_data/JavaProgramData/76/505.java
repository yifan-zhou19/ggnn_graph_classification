package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int d;
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
	//	qj[n],c;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(qj[i].a) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(qj[i].b) = tempVar3;
			}
		}
		d = qj[0].b;
		for (i = 0;i < n;i++)
		{
			if (qj[i].b > d)
			{
				d = qj[i].b;
			}
		}
	   for (k = 1;k < n;k++)
	   {
	   for (i = 0;i < n - k;i++)
	   {
		   if (qj[i].a > qj[i + 1].a)
		   {
			   c = qj[i];
			   qj[i] = qj[i + 1];
			   qj[i + 1] = c;

		   }
	   }
	   }
	   for (i = 1;i < n;i++)
	   {
		   if (qj[0].b >= qj[i].a && qj[0].b < qj[i].b)
		   {
			   qj[0].b = qj[i].b;
		   }
	   }
	   if (qj[0].b == d)
	   {
		   System.out.printf("%d %d",qj[0].a,qj[0].b);
	   }
	   else
	   {
		   System.out.print("no");
	   }
	   return 0;
	}

}


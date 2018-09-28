package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int ks;
		int js;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x,y;
	//	}
	//	qj[NUM],t;
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
				qj[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qj[i].y = tempVar3;
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (qj[i].x > qj[i + 1].x)
				{
					t = qj[i + 1];
					qj[i + 1] = qj[i];
					qj[i] = t;
				}
			}
		}
		ks = qj[0].x;
		js = qj[0].y;
		for (i = 1;i < n;i++)
		{
			if (qj[i].x <= js)
			{
				if (qj[i].y > js)
				{
					js = qj[i].y;
				}
			}
			else
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",ks,js);
		return 0;
	}





}


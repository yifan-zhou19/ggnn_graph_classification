package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qj
	//	{
	//		int lp;
	//		int rp;
	//	}
	//	qj[50000];
		int n;
		int i;
		int j;
		int maxr;
		int minl;
		int sig;
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
				qj[i].lp = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				qj[i].rp = tempVar3;
			}
		}
		minl = qj[0].lp;
		maxr = qj[0].rp;
		for (i = 0;i < n;i++)
		{
			if (minl > qj[i].lp)
			{
				minl = qj[i].lp;
			}
			if (maxr < qj[i].rp)
			{
				maxr = qj[i].rp;
			}
		}
		sig = 1;
		int[] sign = new int[50000];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (j != i)
				{
				if (qj[i].lp == minl)
				{
					sign[i] = 1;
				}
				if (qj[i].lp <= qj[j].rp && qj[i].lp >= qj[j].lp)
				{
					sign[i] = 1;
				}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sign[i] == 0)
			{
				sig = 0;
			}
		}
		if (sig == 0)
		{
			System.out.print("no");
		}
		else
		{

		System.out.printf("%d %d",minl,maxr);
		}
		return 0;
	}

}


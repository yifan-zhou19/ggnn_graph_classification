package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qujian
	//	{
	//		int x,y;
	//	}
	//	e,qujians[50000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				qujians[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qujians[i].y = tempVar3;
			}
		}
		int k;
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (qujians[i].x > qujians[i + 1].x)
				{
					e = qujians[i + 1];
					qujians[i + 1] = qujians[i];
					qujians[i] = e;
				}
			}
		}
		int p = qujians[0].x;
		for (i = 0;i < n;i++)
		{
			if (qujians[i].x < p)
			{
				p = qujians[i].x;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (qujians[i + 1].x > qujians[i].y)
			{
				s = 1;
				break;
			}
			else
			{
				qujians[i + 1].x = qujians[i].x;
				if (qujians[i].y > qujians[i + 1].y)
				{
					qujians[i + 1].y = qujians[i].y;
				}
				else
				{
					qujians[i + 1].y = qujians[i + 1].y;
				}
			}
		}



		int m = qujians[0].y;
		for (i = 0;i < n;i++)
		{
			if (qujians[i].y > m)
			{
				m = qujians[i].y;
			}
		}

		if (s == 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",p,m);
		}
		return 0;

	}

}


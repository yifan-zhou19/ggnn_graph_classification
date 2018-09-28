package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qujian
	//	{
	//		int a;
	//		int b;
	//	}
	//	q[50000],t;
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
				q[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q[i].b = tempVar3;
			}

		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (q[i].a > q[j].a)
				{
					t = q[j];
					q[j] = q[i];
					q[i] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (q[i + 1].a > q[i].b)
			{
				System.out.print("no\n");
				k = 0;
				break;
			}
			else
			{
				q[i + 1].a = q[i].a;
				q[i + 1].b = (q[i].b > q[i + 1].b)?q[i].b:q[i + 1].b;
			}
		}
		if (k != 0)
		{
			System.out.printf("%d %d\n",q[n - 1].a,q[n - 1].b);
		}
		return 0;
	}

}


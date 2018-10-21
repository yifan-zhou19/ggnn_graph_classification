package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qujian
	//	{
	//		int a;
	//		int b;
	//	}
	//	qj[50000],temp;
		int n;
		int i;
		int j;
		int max;
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
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (qj[j].a > qj[j + 1].a)
				{
					temp.a = qj[j].a;
					temp.b = qj[j].b;
					qj[j].a = qj[j + 1].a;
					qj[j].b = qj[j + 1].b;
					qj[j + 1].a = temp.a;
					qj[j + 1].b = temp.b;
				}
			}
		}
		max = qj[0].b;
		for (i = 0;i < n - 1;i++)
		{
			if (max < qj[i].b)
			{
				max = qj[i].b;
			}
			if (max < qj[i + 1].a)
			{
				System.out.print("no");
				break;
			}
		}
		if (i == n - 1)
		{
			System.out.printf("%d %d",qj[0].a,max);
		}
		return 0;
	}


}


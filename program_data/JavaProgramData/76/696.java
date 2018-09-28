package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int a,b;
	//	}
	//	q[5000],c;
		int star;
		int end;
		int e;
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
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (q[j].a > q[j + 1].a)
				{
					c = q[j];
					q[j] = q[j + 1];
					q[j + 1] = c;
				}
			}
		}
		star = q[0].a;
		end = q[0].b;
		for (i = 1;i < n;i++)
		{
			if (end < q[i].a)
			{
				e = 0;
				break;
			}
			else
			{
				e = 1;
				if (end < q[i].b)
				{
				end = q[i].b;
				}
			}
		}
		if (e == 0)
		{
		System.out.print("no");
		}
		if (e == 1)
		{
		System.out.printf("%d %d",star,end);
		}
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int z;
		int e;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int a;
	//		int b;
	//	}
	//	m[5000],t;
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
				m[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[i].b = tempVar3;
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (m[j].a > m[j + 1].a)
				{
					t = m[j];
					m[j] = m[j + 1];
					m[j + 1] = t;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (m[j].b > m[j + 1].b)
				{
					e = m[j].b;
					m[j].b = m[j + 1].b;
					m[j + 1].b = e;
				}
			}
		}
		z = 1;
		for (i = 0;i < n - 1;i++)
		{
			if (m[i].b < m[i + 1].a)
			{
				z = 0;
			}
		}
		if (z == 1)
		{
			System.out.printf("%d %d",m[0].a,m[n - 1].b);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}


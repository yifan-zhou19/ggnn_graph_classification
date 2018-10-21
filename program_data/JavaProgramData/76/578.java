package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int s;
		int t;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct q
	//	{
	//		int a,b;
	//	}
	//	m[n],e;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(m[i].a) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(m[i].b) = tempVar3;
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if ((m[i].a) > (m[i + 1].a))
				{
					e = m[i + 1];
					m[i + 1] = m[i];
					m[i] = e;
				}
			}
		}






		s = 0;
		x = m[0].b;
		for (i = 0;i < (n - 1);i++)
		{
		   if (x < m[i + 1].a)
		   {
				s = 1;
		   }
		   if (x < m[i + 1].b)
		   {
			   x = m[i + 1].b;
		   }
		}
		t = m[0].b;
		for (i = 1;i < n;i++)
		{
			if (m[i].b > t)
			{
				t = m[i].b;
			}
		}
		if (s > 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",m[0].a,t);
		}
		return 0;
	}

}


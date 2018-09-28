package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int a,b;
	//	}
	//	p[50000];

		int i;
		int k;
		int n;
		int l;
		int r;
		double j;

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
				p[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].b = tempVar3;
			}
		}
		l = p[0].a;
		r = p[0].b;


		for (i = 1;i < n;i++)
		{
			if (p[i].a < l)
			{
				l = p[i].a;
			}
			if (p[i].b > r)
			{
				r = p[i].b;
			}
		}

		for (j = l + 0.5;j < r;j++)
		{
			k = 0;
			for (i = 0;i < n;i++)
			{
				if (j < p[i].a || j> p[i].b)
				{
					k++;
				}
			}
			if (k == n)
			{
				System.out.print("no");
				break;
			}
		}
		if (j == r + 0.5)
		{
			System.out.printf("%d %d",l,r);
		}





		return 0;
	}

}


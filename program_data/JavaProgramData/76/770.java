package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ab
	//	{
	//		int a;
	//		int b;
	//	};
		int n;
		int i;
		int j;
		int e = 1;
		int max = 0;
		ab[] p;
		ab t = new ab();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = tangible.Arrays.initializeWithDefaultabInstances(n);
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
		for (i = 0;i < n - 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=p[i];
			t.copyFrom(p[i]);
			for (j = i + 1;j < n;j++)
			{
				if (p[j].a < p[i].a)
				{
					p[i] = p[j];
					p[j] = t;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=p[i];
					t.copyFrom(p[i]);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (p[i].b > max)
			{
				max = p[i].b;
			}
			if (max < p[i + 1].a)
			{
				e = 0;
				break;
			}
		}
		if (p[n - 1].b > max)
		{
			max = p[n - 1].b;
		}
		if (e == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",p[0].a,max);
		}
		return 0;
	}
}


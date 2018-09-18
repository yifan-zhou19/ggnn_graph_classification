package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int ch;
	//		int ma;
	//		int sum;
	//	};
		student[] p;
		int n;
		int i;
		int j;
		int t1;
		int t2;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int k1;
		int k2;
		int k3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].ch = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].ma = tempVar4;
			}
		p[i].sum = p[i].ch + p[i].ma;
		}
		/*for (j=0; j<n-1; j++)
			for (i=0; i<n-1-j; i++)
				if (p[i].sum<p[i+1].sum)
				{ t1=p[i].num; p[i].num=p[i+1].num; p[i+1].num=t1;
				t2=p[i].sum; p[i].sum=p[i+1].sum; p[i+1].sum=t2; }*/
		for (i = 0; i < n; i++)
		{
			if (p[i].sum > a1)
			{
			k1 = i;
			a1 = p[i].sum;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (p[i].sum <= a1 != 0 && p[i].sum> a2 && i != k1)
			{
			k2 = i;
			a2 = p[i].sum;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (p[i].sum <= a2 != 0 && p[i].sum> a3 && i != k1 && i != k2)
			{
			k3 = i;
			a3 = p[i].sum;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n", p[k1].num, p[k1].sum, p[k2].num, p[k2].sum, p[k3].num, p[k3].sum);
		/*for (i=0; i<3; i++)
			printf ("%d %d\n", p[i].num, p[i].sum);*/
		return 0;
	}
}


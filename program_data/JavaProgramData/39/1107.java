package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char t[20],a[2],b[2];
	//		int m,n,p,g;
	//	}
	//	k[100],q;
		int c;
		int i;
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		for (i = 0;i < c;i++)
		{
			k[i].g = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k[i].t = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k[i].m = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				k[i].n = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				k[i].a = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				k[i].b = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				k[i].p = tempVar7;
			}
			if (k[i].m > 80 && k[i].p >= 1)
			{
				k[i].g += 8000;
			}
			if (k[i].m > 85 && k[i].n > 80)
			{
				k[i].g += 4000;
			}
			if (k[i].m > 90)
			{
				k[i].g += 2000;
			}
			if (k[i].m > 85 && k[i].b[0] == 'Y')
			{
				k[i].g += 1000;
			}
			if (k[i].n > 80 && k[i].a[0] == 'Y')
			{
				k[i].g += 850;
			}
		}
		for (i = 0;i < c;i++)
		{
			sum += k[i].g;
		}
		for (i = 0;i < c;i++)
		{
			for (j = c - 1;j > i;j--)
			{
				if (k[j].g > k[j - 1].g)
				{
					q = k[j];
					k[j] = k[j - 1];
					k[j - 1] = q;
				}
			}
		}
		System.out.printf("%s\n%d\n%d",k[0].t,k[0].g,sum);
		return 0;
	}

}


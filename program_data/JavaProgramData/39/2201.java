package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[100];
	//		int score,cscore,p;
	//		char w,l;
	//	};
		int n;
		int tot = 0;
		int i;
		int j;
		int swap;
		stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(102);
		stu aswap = new stu();
		int[] b = new int[102];
		char rr;
		char tt;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].score = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].cscore = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				rr = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				a[i].l = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(null, 1);
			if (tempVar7 != null)
			{
				tt = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(null, 1);
			if (tempVar8 != null)
			{
				a[i].w = tempVar8;
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				a[i].p = tempVar9;
			}
		}

		for (i = 1;i <= n;i++)
		{
			b[i] = 0;
			if ((a[i].score > 80) && (a[i].p >= 1))
			{
				b[i] = b[i] + 8000;
			}
			if ((a[i].score > 85) && (a[i].cscore > 80))
			{
				b[i] = b[i] + 4000;
			}
			if (a[i].score > 90)
			{
				b[i] = b[i] + 2000;
			}
			if ((a[i].score > 85) && (a[i].w == 'Y'))
			{
				b[i] = b[i] + 1000;
			}
			if ((a[i].cscore > 80) && (a[i].l == 'Y'))
			{
				b[i] = b[i] + 850;
			}
			tot = tot + b[i];
		}
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (b[i] < b[j])
				{
					swap = b[i];
					b[i] = b[j];
					b[j] = swap;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: aswap=a[i];
					aswap.copyFrom(a[i]);
					a[i] = a[j];
					a[j] = aswap;
				}
			}
		}
		System.out.printf("%s\n",a[1].name);
		System.out.printf("%d\n",b[1]);
		System.out.printf("%d\n",tot);
		return 0;
	}


}


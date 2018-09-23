package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int i1 = 0;
		int i2 = 0;
		int t1;
		int t2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct heying
	//	{
	//		char sex[10];
	//		double h;
	//	}
	//	heying[N],ex,male[N],fe[N];
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
				heying[i].sex = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				heying[i].h = tempVar3;
			}
			if (heying[i].sex[0] == 'm')
			{
				male[i1] = heying[i];
				i1++;
			}
			else
			{
				fe[i2] = heying[i];
				i2++;
			}
		}
		t1 = i1;
		t2 = i2;
		for (i = 0;i < t1;i++)
		{
			for (j = i + 1;j < t1;j++)
			{
				if (male[i].h > male[j].h)
				{
					ex = male[i];
					male[i] = male[j];
					male[j] = ex;
				}
			}
		}
		for (i = 0;i < t2;i++)
		{
			for (j = i + 1;j < t2;j++)
			{
				if (fe[i].h < fe[j].h)
				{
					ex = fe[i];
					fe[i] = fe[j];
					fe[j] = ex;
				}
			}
		}
		for (i = 0;i < t1;i++)
		{
			System.out.printf("%.2lf ",male[i].h);
		}
		for (i = 0;i < t2 - 1;i++)
		{
			System.out.printf("%.2lf ",fe[i].h);
		}
		System.out.printf("%.2lf\n",fe[t2 - 1].h);
		return 0;
	}

}


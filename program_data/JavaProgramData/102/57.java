package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int f = 0;
		int k;
		String sex = new String(new char[10]);
		final String s = "male";
		double h;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char sex[10];
	//		double h;
	//	}
	//	qq[40],male[40],female[40],e;
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
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			qq[i].sex = sex;
			qq[i].h = h;
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(qq[i].sex,s))
			{
				female[f] = qq[i];
				f++;
			}
			else
			{
				male[m] = qq[i];
				m++;

			}
		}
		for (i = 1;i < m;i++)
		{
			for (k = 0;k < m - i;k++)
			{
				if (male[k].h > male[k + 1].h)
				{
					e = male[k];
					male[k] = male[k + 1];
					male[k + 1] = e;
				}
			}
		}
		for (i = 1;i < f;i++)
		{
			for (k = 0;k < f - i;k++)
			{
				if (female[k].h > female[k + 1].h)
				{
					e = female[k];
					female[k] = female[k + 1];
					female[k + 1] = e;
				}
			}
		}
		System.out.printf("%.2lf",male[0].h);
		for (i = 1;i < m;i++)
		{
			System.out.printf(" %.2lf",male[i].h);
		}
		for (i = f - 1;i >= 0;i--)
		{
			System.out.printf(" %.2lf",female[i].h);
		}
		return 0;
	}

}


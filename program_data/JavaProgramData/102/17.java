package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x = 0;
		int y = 0;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct a
	//	{
	//		double b;
	//		char c[7];
	//	}
	//	a[40],male[40],female[40],temp;
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
				a[i].c = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].b = tempVar3;
			}
			if (a[i].c[0] == 'm')
			{
				male[x] = a[i];
				x++;
			}
			else
			{
				female[y] = a[i];
				y++;
			}
		}
		for (i = 0;i < x - 1;i++)
		{
			for (m = 0;m < x - 1 - i;m++)
			{
				if (male[m].b > male[m + 1].b)
				{
					temp = male[m];
					male[m] = male[m + 1];
					male[m + 1] = temp;
				}
			}
		}
		for (i = 0;i < y - 1;i++)
		{
			for (m = 0;m < y - 1 - i;m++)
			{
				if (female[m].b < female[m + 1].b)
				{
					temp = female[m];
					female[m] = female[m + 1];
					female[m + 1] = temp;
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			if (i == 0)
			{
				System.out.printf("%.2lf",male[i].b);
			}
			else
			{
				System.out.printf(" %.2lf",male[i].b);
			}
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf(" %.2lf",female[i].b);
		}
		return 0;
	}

}


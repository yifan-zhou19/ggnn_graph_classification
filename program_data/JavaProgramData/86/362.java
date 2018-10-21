package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int m,x[10],t[10],s; //t???s?60?????
	//	}
	//	a[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].m = tempVar2;
			}
			for (j = 0; j < a[i].m; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i].x[j] = tempVar3;
				}
			}
		}

		for (i = 0; i < n; i++)
		{
			if (a[i].m == 0)
			{
				a[i].s = 60;
				System.out.printf("%d\n",a[i].s);
			}
			else
			{
				if (a[i].x[a[i].m - 1] + a[i].m * 3 <= 60)
				{
					a[i].s = 60 - 3 * a[i].m;
					System.out.printf("%d\n",a[i].s);
				}
				else
				{
					for (j = a[i].m - 1; a[i].x[j] + (j + 1) * 3 >= 60; j--)
					{
					} //j=4
					if (a[i].x[j + 1] + 3 * (j + 1) >= 57 && a[i].x[j + 1] + 3 * (j + 1) <= 60)
					{
						System.out.printf("%d\n",a[i].x[j + 1]);
					}
					else
					{
						a[i].s = 60 - 3 * (j + 1);
						System.out.printf("%d\n",a[i].s);
					}
				}
			}
		}
		return 0;
	}

}


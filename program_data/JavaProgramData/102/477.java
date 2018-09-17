package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int b;
		int a;
		int j = 0;
		double c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char sx[10];
	//		double s;
	//	}
	//	pl[40],pa[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = n - 1;
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 pl[i].sx = tempVar2;
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 pl[i].s = tempVar3;
			 }
		}
		for (i = 0;i < n;i++)
		{
				if (strcmp(pl[i].sx,"male") == 0)
				{
					pa[j] = pl[i];
					j++;
				}
				if (strcmp(pl[i].sx,"female") == 0)
				{
					pa[b] = pl[i];
					b--;
				}
		}
		for (i = 1;i <= j;i++)
		{
			for (a = 0;a < j - i;a++)
			{
					if (pa[a].s > pa[a + 1].s)
					{
						c = pa[a].s;
						pa[a].s = pa[a + 1].s;
						pa[a + 1].s = c;
					}
			}
		}
		for (i = 1;i <= n - j;i++)
		{
			for (a = 0;a < n - i - j;a++)
			{
					if (pa[a + j].s < pa[a + j + 1].s)
					{
						c = pa[a + j].s;
						pa[a + j].s = pa[a + j + 1].s;
						pa[a + j + 1].s = c;
					}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
			 System.out.printf("%.2lf ",pa[i].s);
			}
			else
			{
			 System.out.printf("%.2lf",pa[i].s);
			}
		}
		return 0;
	}
}


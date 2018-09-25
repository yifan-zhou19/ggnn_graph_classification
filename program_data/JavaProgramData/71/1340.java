package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int k;
		int t1 = 0;
		int t2 = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		int year;
	//		int month1;
	//		int month2;
	//	}
	//	p[200];
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
				p[i].year = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].month1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].month2 = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			t1 = 0,t2 = 0;
			for (j = 0;j < p[i].month1;j++)
			{
				if ((j == 1) || (j == 3) || (j == 5) || (j == 7) || (j == 8) || (j == 10) || (j == 12))
				{
					t1 += 31;
				}
				else if ((j == 4) || (j == 6) || (j == 9) || (j == 11))
				{
					t1 += 30;
				}
				else if (j == 2)
				{
					if (p[i].year % 400 == 0 || (p[i].year % 4 == 0 && p[i].year % 100 != 0))
					{
						t1 += 29;
					}
					else
					{
						t1 += 28;
					}
				}
			}
			for (k = 0;k < p[i].month2;k++)
			{
				if ((k == 1) || (k == 3) || (k == 5) || (k == 7) || (k == 8) || (k == 10) || (k == 12))
				{
					t2 += 31;
				}
				else if ((k == 4) || (k == 6) || (k == 9) || (k == 11))
				{
					t2 += 30;
				}
				else if (k == 2)
				{
					if (p[i].year % 400 == 0 || (p[i].year % 4 == 0 && p[i].year % 100 != 0))
					{
						t2 += 29;
					}
					else
					{
						t2 += 28;
					}
				}
			}
			if (((t2 - t1) % 7 == 0) || ((t1 - t2) % 7 == 0))
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}

	}



}


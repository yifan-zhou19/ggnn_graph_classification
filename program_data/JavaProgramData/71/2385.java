package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct remonth
	//	{
	//		int year,month1,month2;
	//	}
		remonth[200]; //??,?????????
		int[] diff = new int[200]; //??????????

		int i;
		int m; //??2?????
		int k; //????,??remonth[i].month1,??????
		int t; //????,?????????????????

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
				remonth[i].year = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				remonth[i].month1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				remonth[i].month2 = tempVar4;
			}
		}

		for (i = 0;i < n;i++)
		{
			if ((remonth[i].year % 4 == 0 && remonth[i].year % 100 != 0) || remonth[i].year % 400 == 0)
			{
				m = 29;
			}
			else
			{
				m = 28;
			} //??????????

			if (remonth[i].month1 > remonth[i].month2)
			{
				t = remonth[i].month1;
				remonth[i].month1 = remonth[i].month2;
				remonth[i].month2 = t;
			} //?????????

			diff[i] = 0;

			for (k = remonth[i].month1;k < remonth[i].month2;k++)
			{
				if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
				{
					diff[i] = diff[i] + 31;
				}
				else if (k == 4 || k == 6 || k == 9 || k == 11)
				{
					diff[i] = diff[i] + 30;
				}
				else if (k == 2)
				{
					diff[i] = diff[i] + m;
				}
			} //???????????
		}
		for (i = 0;i < n;i++)
		{
			if (diff[i] % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		} //??????
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y; //????????y???m1?m2???n?????day???????i?j?????max
		int m1;
		int m2;
		int n;
		int day;
		int i;
		int j;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++) //??n?
		{
			day = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) //?????
			{
				if (m1 < m2) //???????
				{
					j = m1;
					max = m2;
				}
				else
				{
					j = m2;
					max = m1;
				}
				for (;j < max;j++) //??????
				{
					day += b[j - 1];
				}
			}
			else //?????
			{
				if (m1 < m2) //???????
				{
					j = m1;
					max = m2;
				}
				else
				{
					j = m2;
					max = m1;
				}
				for (;j < max;j++) //??????
				{
					day += a[j - 1];
				}
			}
			if (day % 7 == 0) //????????
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}


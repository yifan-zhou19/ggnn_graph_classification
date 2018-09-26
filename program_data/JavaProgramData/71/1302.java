package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int m1;
		int m2;
		int i;
		int m;
		int n;
		int diff;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			/* ?????? */
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
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
			/* ???????? */
			if (m1 > m2)
			{
				int t = m1;
				m1 = m2;
				m2 = t;
			}
			/* ??????? */
			diff = 0;
			for (m = m1; m < m2; m++)
			{
				switch (m)
				{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					diff = diff + 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					diff = diff + 30;
					break;
				case 2:
					if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
					{
						diff = diff + 29;
					}
					else
					{
						diff = diff + 28;
					}
					break;
				}
			}
			/* ????????7?? */
			if (diff % 7 == 0)
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


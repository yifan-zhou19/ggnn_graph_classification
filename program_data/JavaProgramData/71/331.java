package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int year;
		int m1;
		int m2;
		int temp;
		int[] s = new int[12];
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				s[i - 1] = 31;
			}
			else
			{
				if (i != 2)
				{
				s[i - 1] = 30;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
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
			if (m1 > m2)
			{
				temp = m2;
				m2 = m1;
				m1 = temp;
			}
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			{
				s[1] = 29;
			}
			else
			{
				s[1] = 28;
			}
			for (i = m1;i < m2;i++)
			{
				h = h + s[i - 1];
			}
			if (h % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			h = 0;
		}
		return 0;
	}
}


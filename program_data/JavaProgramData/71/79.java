package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int j;
		int s;
		int y;
		int m1;
		int m2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			m[1] = 28;
			s = 0;
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
			if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))
			{
				m[1] = 29;
			}
			if (m1 > m2)
			{
				j = m1;
				m1 = m2;
				m2 = j;
			}
			for (j = m1;j < m2;j++)
			{
				s = s + m[j - 1];
			}
			if (s % 7 == 0)
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


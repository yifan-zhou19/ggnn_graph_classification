package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int total = 0;
		 int y;
		 int m1;
		 int m2;
		 int i;
		 int j;
		 int n;
		 int[] t1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 int[] t2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			{
				if (m1 > m2)
				{
					total = 0;
					for (j = m2;j < m1;j++)
					{
					  total += t2[j - 1];
					}
					if (total % 7 == 0)
					{
					  System.out.print("YES\n");
					}
					else
					{
					  System.out.print("NO\n");
					}

				}
				else if (m1 < m2)
				{
					total = 0;
					for (j = m1;j < m2;j++)
					{
					  total += t2[j - 1];
					}
					if (total % 7 == 0)
					{
					  System.out.print("YES\n");
					}
					else
					{
					  System.out.print("NO\n");
					}

				}
			}
			else
			{
				if (m1 > m2)
				{
					total = 0;
					for (j = m2;j < m1;j++)
					{
					  total += t1[j - 1];
					}
					if (total % 7 == 0)
					{
					  System.out.print("YES\n");
					}
					else
					{
					  System.out.print("NO\n");
					}
				}
				else if (m1 < m2)
				{
					total = 0;
					for (j = m1;j < m2;j++)
					{
					  total += t1[j - 1];
					}
					if (total % 7 == 0)
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
		return 0;
	}
}


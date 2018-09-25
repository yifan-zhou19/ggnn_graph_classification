package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] y = new int[200];
		int[] m1 = new int[200];
		int[] m2 = new int[200];
		int[] mon = new int[12];
		int sum = 0;
		int t;
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
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;

			if (m2[i] > m1[i])
			{
				t = m2[i];
				m2[i] = m1[i];
				m1[i] = t;
			}

			if (m2[i] > 2)
			{
				for (j = m2[i];j < m1[i];j++)
				{
					if (j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
					{
						mon[j] = 31;
					}
					else
					{
						mon[j] = 30;
					}
					sum += mon[j];
				}
				if (sum % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else if (m1[i] == 2 && m2[i] == 1)
			{
				System.out.print("NO\n");
			}
			else if (m2[i] <= 2 && m1[i]>2)
			{
				if ((y[i] % 100 != 0 && y[i] % 4 == 0) || (y[i] % 400 == 0))
				{
				for (j = m2[i];j < m1[i];j++)
				{
					if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
					{
						mon[j] = 31;
					}
					else if (j == 2)
					{
						mon[j] = 29;
					}
					else
					{
						mon[j] = 30;
					}
					 sum += mon[j];
				}
				 if (sum % 7 == 0)
				 {
					 System.out.print("YES\n");
				 }
				 else
				 {
					 System.out.print("NO\n");
				 }
				}

			   else
			   {
				  for (j = m2[i];j < m1[i];j++)
				  {
					 if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
					 {
						 mon[j] = 31;
					 }
					 else if (j == 2)
					 {
						 mon[j] = 28;
					 }
					 else
					 {
						 mon[j] = 30;
					 }
					 sum += mon[j];
				  }
					if (sum % 7 == 0)
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



	}
}


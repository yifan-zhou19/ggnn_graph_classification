package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] flag = new int[300];
		int[] r = new int[300];
		int[] year = new int[300];
		int[] m1 = new int[300];
		int[] m2 = new int[300];
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
				year[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
			if (year[i] % 4 == 0 && year[i] % 100 != 0 || year[i] % 400 == 0)
			{
				flag[i] = 1;
			}
			else
			{
				flag[i] = 0;
			}
			if (m1[i] == 1)
			{
				m1[i] = 1;
			}
			if (m1[i] == 2)
			{
				m1[i] = 32;
			}
			if (m1[i] == 3)
			{
				m1[i] = 60;
			}
			if (m1[i] == 4)
			{
				m1[i] = 91;
			}
			if (m1[i] == 5)
			{
				m1[i] = 121;
			}
			if (m1[i] == 6)
			{
				m1[i] = 152;
			}
			if (m1[i] == 7)
			{
				m1[i] = 182;
			}
			if (m1[i] == 8)
			{
				m1[i] = 213;
			}
			if (m1[i] == 9)
			{
				m1[i] = 244;
			}
			if (m1[i] == 10)
			{
				m1[i] = 274;
			}
			if (m1[i] == 11)
			{
				m1[i] = 305;
			}
			if (m1[i] == 12)
			{
				m1[i] = 335;
			}
			if (m2[i] == 1)
			{
				m2[i] = 1;
			}
			if (m2[i] == 2)
			{
				m2[i] = 32;
			}
			if (m2[i] == 3)
			{
				m2[i] = 60;
			}
			if (m2[i] == 4)
			{
				m2[i] = 91;
			}
			if (m2[i] == 5)
			{
				m2[i] = 121;
			}
			if (m2[i] == 6)
			{
				m2[i] = 152;
			}
			if (m2[i] == 7)
			{
				m2[i] = 182;
			}
			if (m2[i] == 8)
			{
				m2[i] = 213;
			}
			if (m2[i] == 9)
			{
				m2[i] = 244;
			}
			if (m2[i] == 10)
			{
				m2[i] = 274;
			}
			if (m2[i] == 11)
			{
				m2[i] = 305;
			}
			if (m2[i] == 12)
			{
				m2[i] = 335;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (flag[i] == 1)
			{
				if (m1[i] > 32)
				{
					m1[i]++;
				}
				if (m2[i] > 32)
				{
					m2[i]++;
				}
			}
			if (m1[i] > m2[i])
			{
				r[i] = m1[i] - m2[i];
			}
			else
			{
				r[i] = m2[i] - m1[i];
			}
			if (r[i] % 7 == 0)
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


package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] y = new int[1000];
		int[] m1 = new int[1000];
		int[] m2 = new int[1000];
		int a;
		int cha;
		int i;
		int tian1;
		int tian2;
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
			if (y[i] % 4 == 0)
			{
				if (y[i] % 100 == 0)
				{
					if (y[i] % 400 == 0)
					{
						a = 29;
					}
					else
					{
						a = 28;
					}
				}
				else
				{
					a = 29;
				}
			}
			else if (y[i] % 4 != 0)
			{
				a = 28;
			}
			if (m1[i] == 1)
			{
				tian1 = 0;
			}
			if (m1[i] == 2)
			{
				tian1 = 31;
			}
			if (m1[i] == 3)
			{
				tian1 = 31 + a;
			}
			if (m1[i] == 4)
			{
				tian1 = 31 + a + 31;
			}
			if (m1[i] == 5)
			{
				tian1 = 31 + a + 31 + 30;
			}
			if (m1[i] == 6)
			{
				tian1 = 31 + a + 31 + 30 + 31;
			}
			if (m1[i] == 7)
			{
				tian1 = 31 + a + 31 + 30 + 31 + 30;
			}
			if (m1[i] == 8)
			{
				tian1 = 31 + a + 31 + 30 + 31 + 30 + 31;
			}
			if (m1[i] == 9)
			{
				tian1 = 31 + a + 31 + 30 + 31 + 30 + 31 + 31;
			}
			if (m1[i] == 10)
			{
				tian1 = 31 + a + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			}
			if (m1[i] == 11)
			{
				tian1 = 31 + a + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			}
			if (m1[i] == 12)
			{
				tian1 = 31 + a + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			}
			if (m2[i] == 1)
			{
				tian2 = 0;
			}
			if (m2[i] == 2)
			{
				tian2 = 31;
			}
			if (m2[i] == 3)
			{
				tian2 = 31 + a;
			}
			if (m2[i] == 4)
			{
				tian2 = 31 + a + 31;
			}
			if (m2[i] == 5)
			{
				tian2 = 31 + a + 31 + 30;
			}
			if (m2[i] == 6)
			{
				tian2 = 31 + a + 31 + 30 + 31;
			}
			if (m2[i] == 7)
			{
				tian2 = 31 + a + 31 + 30 + 31 + 30;
			}
			if (m2[i] == 8)
			{
				tian2 = 31 + a + 31 + 30 + 31 + 30 + 31;
			}
			if (m2[i] == 9)
			{
				tian2 = 31 + a + 31 + 30 + 31 + 30 + 31 + 31;
			}
			if (m2[i] == 10)
			{
				tian2 = 31 + a + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			}
			if (m2[i] == 11)
			{
				tian2 = 31 + a + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			}
			if (m2[i] == 12)
			{
				tian2 = 31 + a + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			}
			cha = Math.abs(tian1 - tian2);
			if (cha % 7 == 0)
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


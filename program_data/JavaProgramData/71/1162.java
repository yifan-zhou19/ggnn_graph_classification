package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int s;
		int p;
		int y;
		int[] d = new int[100];
		int[] m = new int[2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 0;p < n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m[0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m[1] = Integer.parseInt(tempVar4);
			}
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			{
				for (i = 0;i < 2;i++)
				{
					if (m[i] == 1)
					{
						d[i] = 0;
					}
					if (m[i] == 2)
					{
						d[i] = 31;
					}
					if (m[i] == 3)
					{
						d[i] = 60;
					}
					if (m[i] == 4)
					{
						d[i] = 91;
					}
					if (m[i] == 5)
					{
						d[i] = 121;
					}
					if (m[i] == 6)
					{
						d[i] = 152;
					}
					if (m[i] == 7)
					{
						d[i] = 182;
					}
					if (m[i] == 8)
					{
						d[i] = 213;
					}
					if (m[i] == 9)
					{
						d[i] = 244;
					}
					if (m[i] == 10)
					{
						d[i] = 274;
					}
					if (m[i] == 11)
					{
						d[i] = 305;
					}
					if (m[i] == 12)
					{
						d[i] = 335;
					}
				}
			}
			else
			{
				for (i = 0;i < 2;i++)
				{
					if (m[i] == 1)
					{
						d[i] = 0;
					}
					if (m[i] == 2)
					{
						d[i] = 31;
					}
					if (m[i] == 3)
					{
						d[i] = 59;
					}
					if (m[i] == 4)
					{
						d[i] = 90;
					}
					if (m[i] == 5)
					{
						d[i] = 120;
					}
					if (m[i] == 6)
					{
						d[i] = 151;
					}
					if (m[i] == 7)
					{
						d[i] = 181;
					}
					if (m[i] == 8)
					{
						d[i] = 212;
					}
					if (m[i] == 9)
					{
						d[i] = 243;
					}
					if (m[i] == 10)
					{
						d[i] = 273;
					}
					if (m[i] == 11)
					{
						d[i] = 304;
					}
					if (m[i] == 12)
					{
						d[i] = 334;
					}
				}
			}

			if (d[0] > d[1])
			{
				s = d[0] - d[1];
					if (s % 7 == 0)
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
				s = d[1] - d[0];
					if (s % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
			}
		}
			return 0;
	}



}


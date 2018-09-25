package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] m = new int[n][3];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m[i][3] = Integer.parseInt(tempVar4);
			}
		}
		for (j = 0;j < n;j++)
		{
			if (((m[j][2] == 9 && m[j][3] == 12) || (m[j][3] == 9 && m[j][2] == 12)) || ((m[j][2] == 4 && m[j][3] == 7) || (m[j][3] == 4 && m[j][2] == 7)) || ((m[j][2] == 3 && m[j][3] == 11) || (m[j][3] == 3 && m[j][2] == 11)))
			{
				System.out.print("YES\n");
			}
			else
			{
				if (((m[j][1] % 4 == 0 && m[j][1] % 100 != 0) || (m[j][1] % 400 == 0)) && (((m[j][2] == 1 && m[j][3] == 4) || (m[j][3] == 1 && m[j][2] == 4)) || ((m[j][2] == 1 && m[j][3] == 7) || (m[j][3] == 1 && m[j][2] == 7)) || ((m[j][2] == 2 && m[j][3] == 8) || (m[j][3] == 2 && m[j][2] == 8))))
				{
					System.out.print("YES\n");
				}
				else
				{
					if ((m[j][1] % 4 != 0 || (m[j][1] % 100 == 0) && (m[j][1] % 400 != 0)) && (((m[j][2] == 1 && m[j][3] == 10) || (m[j][3] == 1 && m[j][2] == 10)) || ((m[j][2] == 2 && m[j][3] == 3) || (m[j][3] == 2 && m[j][2] == 3)) || ((m[j][2] == 2 && m[j][3] == 11) || (m[j][3] == 2 && m[j][2] == 11))))
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


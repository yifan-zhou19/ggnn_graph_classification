package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[200];
		int[][] b = new int[200][13];
		int[][] c = new int[200][13];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			if ((a[i] % 4 == 0 && a[i] % 100 != 0) || a[i] % 400 == 0)
			{
				b[i][1] = 0;
				b[i][2] = 31;
				b[i][3] = 60;
				b[i][4] = 91;
				b[i][5] = 121;
				b[i][6] = 152;
				b[i][7] = 182;
				b[i][8] = 213;
				b[i][9] = 244;
				b[i][10] = 274;
				b[i][11] = 305;
				b[i][12] = 335;
				c[i][1] = 0;
				c[i][2] = 31;
				 c[i][3] = 60;
				c[i][4] = 91;
				c[i][5] = 121;
				c[i][6] = 152;
				b[i][10] = 274;
				b[i][11] = 305;
				b[i][12] = 335;
				c[i][1] = 0;
				c[i][2] = 31;
				 c[i][3] = 60;
				c[i][4] = 91;
				c[i][5] = 121;
				c[i][6] = 152;
				c[i][7] = 182;
				c[i][8] = 213;
				c[i][9] = 244;
				   c[i][10] = 274;
				c[i][11] = 305;
				c[i][12] = 335;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					j = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					k = Integer.parseInt(tempVar4);
				}
				if ((c[i][k] - b[i][j]) % 7 == 0)
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
				b[i][1] = 0;
				b[i][2] = 31;
				b[i][3] = 59;
				b[i][4] = 90;
				b[i][5] = 120;
				b[i][6] = 151;
				b[i][7] = 181;
				b[i][8] = 212;
				b[i][9] = 243;
				b[i][10] = 273;
				b[i][11] = 304;
				b[i][12] = 334;
				c[i][1] = 0;
				c[i][2] = 31;
				 c[i][3] = 59;
				c[i][4] = 90;
				c[i][5] = 120;
				c[i][6] = 151;
				c[i][7] = 181;
				c[i][8] = 212;
				c[i][9] = 243;
				   c[i][10] = 273;
				c[i][11] = 304;
				c[i][12] = 334;
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					j = Integer.parseInt(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					k = Integer.parseInt(tempVar6);
				}
				if ((c[i][k] - b[i][j]) % 7 == 0)
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


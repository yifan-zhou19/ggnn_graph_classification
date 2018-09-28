package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[8][8];
		int an_dian_shu = 0;
		char dou_hao;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			dou_hao = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			col = Integer.parseInt(tempVar3);
		}
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)

			{
				int hang_zui_da = 0;
				int lie_zui_xiao = 0;
				for (int k = 0;k < col;k++)
				{
					if (a[i][j] < a[i][k])
					{
						hang_zui_da++;
					}
				}

				for (int l = 0;l < row;l++)
				{
					if (a[i][j] > a[l][j])
					{
						lie_zui_xiao++;
					}
				}

				if (hang_zui_da == 0 && lie_zui_xiao == 0)


				{
					System.out.printf("%d+%d",i,j);
					an_dian_shu++;
				}
			}
		}
		if (an_dian_shu == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

